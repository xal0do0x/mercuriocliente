/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosisperu.mercurio.apiclient;

import com.biosisperu.mercurio.siac.domain.Empleado;
import com.biosisperu.mercurio.siac.domain.Marcacion;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author fesqu
 */
public class MercurioClient {

    private static final Logger LOG = Logger.getLogger(MercurioClient.class.getName());
    
    public static enum URL_TIPO {
        MARCACION_BUSQUEDA,
        EMPLEADO_GUARDAR,
        MARCACION_GUARDAR
    }
    private final RestTemplate REST_TEMPLATE;
    
    private final Map<URL_TIPO, String> URLS;
    private final String URL_BASE = "http://54.69.245.214:8080/%s";
    
    private MercurioClient() {
        REST_TEMPLATE = new RestTemplate();
        URLS = new HashMap<>();
        
        URLS.put(URL_TIPO.MARCACION_BUSQUEDA, String.format(URL_BASE, "marcacions/q"));
        URLS.put(URL_TIPO.MARCACION_GUARDAR, String.format(URL_BASE, "marcacions"));
    }
    
    public static MercurioClient getInstance() {
        return MercurioClientHolder.INSTANCE;
    }
    
    private static class MercurioClientHolder {

        private static final MercurioClient INSTANCE = new MercurioClient();
    }
    
    public boolean enviarMarcacion(Marcacion marcacion){
        try {
            
            Marcacion response = REST_TEMPLATE.postForObject(URLS.get(URL_TIPO.MARCACION_GUARDAR), marcacion, Marcacion.class);
            LOG.info("Marcacion enviada");
            return true;
        } catch (Exception e) {
            LOG.severe("Error en" + e.getMessage());
            return false;
        }
    }
    
    public boolean enviarEmpleado(Empleado empleado){
        try {
            
            Empleado response = REST_TEMPLATE.postForObject(URLS.get(URL_TIPO.EMPLEADO_GUARDAR), empleado, Empleado.class);
            LOG.info("Empleado enviado");
            return true;
        } catch (Exception e) {
            LOG.severe("Error en" + e.getMessage());
            return false;
        }
    }
}
