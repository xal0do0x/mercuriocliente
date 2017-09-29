/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.dao;


import com.biosis.mercurio.siac.utiles.Encriptador;
import com.personal.utiles.ParametrosUtil;
import com.personal.utiles.PropertiesUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.internal.SessionFactoryImpl;

/**
 *
 * @author gabriel
 * @param <T>
 */
public class DAOBiosis<T> implements DAO<T> {

    protected String PU = "mercurioPU";
    protected static EntityManager em;
    protected Class<T> clase;
    private static final Logger LOG = Logger.getLogger(DAOBiosis.class.getName());

    public DAOBiosis(Class<T> clase) {
        this.clase = clase;
    }

    public DAOBiosis() {
        this.clase = null;
    }

    @Override
    public EntityManager getEntityManager() {
        if (em == null) {
            Map<String, String> properties = new HashMap<>();
            properties.put("javax.persistence.jdbc.user", "admin");
            properties.put("javax.persistence.jdbc.password", "admin");
            properties.put("javax.persistence.jdbc.driver", "org.h2.Driver");
            properties.put("javax.persistence.jdbc.url", "jdbc:h2:C:\\Users\\Aldo\\Documents\\NetBeansProjects\\mercuriocliente\\db");
//            properties.put("hibernate.show_sql", "true");
            properties.put("javax.persistence.schema-generation.database.action", "none");

            try {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory(this.PU, properties);
                em = emf.createEntityManager();
            } catch (Exception e) {
                LOG.error(e.getCause().getMessage() + " " + e.getMessage());
            }

        }
        return em;
    }

    @Override
    public Boolean guardar(T objeto) {
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().persist(objeto);
            getEntityManager().getTransaction().commit();
            getEntityManager().clear();
            return true;
        } catch (Exception e) {
            LOG.error("ERROR EN EL GUARDADO: " + e.getLocalizedMessage() + " " + e.getMessage() + " " + e.getCause());
            em = null;
            return false;
        }

    }

    @Override
    public Boolean guardarLote(List<T> lote) {
        try {
            getEntityManager().getTransaction().begin();
            lote.stream().forEach((objeto) -> {
                getEntityManager().persist(objeto);
            });
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOG.error("ERROR EN EL GUARDADO POR LOTE: " + e.getLocalizedMessage() + " " + e.getMessage());
            em = null;
            return false;
        }
    }

    @Override
    public Boolean modificar(T objeto) {
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().merge(objeto);
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOG.error("ERROR AL MODIFICAR: " + e.getLocalizedMessage() + " " + e.getMessage());
            em = null;
            return false;
        }

    }

    
    @Override
    public Boolean modificarLote(List<T> lote) {
        try {
            getEntityManager().getTransaction().begin();
            lote.stream().forEach((objeto) -> {
                getEntityManager().merge(objeto);
            });
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOG.error("ERROR EN EL MODIFICADO POR LOTE: " + e.getLocalizedMessage() + " " + e.getMessage());
            em = null;
            return false;
        }
    }
    @Override
    public Boolean eliminar(T objeto) {
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().remove(objeto);
            getEntityManager().getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOG.error("ERROR AL ELIMINAR: " + e.getLocalizedMessage() + " " + e.getMessage());
            em = null;
            return false;
        }
    }

    @Override
    public List<T> buscar(String queryJPQL) {
        return this.buscar(queryJPQL, null, -1, -1);
    }

    @Override
    public List<T> buscar(String queryJPQL, Map<String, Object> parametros) {
        return this.buscar(queryJPQL, parametros, -1, -1);
    }

    @Override
    public List<T> buscar(String queryJPQL, Map<String, Object> parametros, int inicio, int tamanio) {
        try {
            Query query = getEntityManager().createQuery(queryJPQL);

            if (parametros != null) {
                parametros.entrySet().stream().forEach((entry) -> {
                    query.setParameter(entry.getKey(), entry.getValue());
                });
            }

            if (inicio != -1) {
                query.setFirstResult(inicio);
            }

            if (tamanio != -1) {
                query.setMaxResults(tamanio);
            }

            List<T> lista = query.getResultList();

            return lista;
        } catch (Exception e) {
            LOG.error("ERROR AL BUSCAR: " + e.getLocalizedMessage() + " " + e.getMessage());
            em = null;
            return null;
        }

    }

    @Override
    public int contar(String queryJPQL, Map<String, Object> parametros) {
        try {
            Query query = getEntityManager().createQuery(queryJPQL);

            if (parametros != null) {
                parametros.entrySet().stream().forEach((entry) -> {
                    query.setParameter(entry.getKey(), entry.getValue());
                });
            }

            Long conteo = (Long) query.getSingleResult();

            return conteo.intValue();
        } catch (Exception e) {
            LOG.error("ERROR AL CONTAR: " + e.getLocalizedMessage() + " " + e.getMessage());
            em = null;
            return 0;
        }

    }

    @Override
    public List<T> buscarTodos() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(clase));
        return getEntityManager().createQuery(cq).getResultList();
    }

    @Override
    public int contar() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(clase);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    @Override
    public T buscarPorId(Object id) {
        return getEntityManager().find(clase, id);
    }

    private void rollback() {
        getEntityManager().getTransaction().begin();
        getEntityManager().getTransaction().rollback();
    }


}
