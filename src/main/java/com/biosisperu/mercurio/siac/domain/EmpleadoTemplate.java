/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosisperu.mercurio.siac.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fesqu
 */
@Entity
@Table(name = "EMPLEADO_TEMPLATE")
@NamedQueries({
    @NamedQuery(name = "EmpleadoTemplate.findAll", query = "SELECT e FROM EmpleadoTemplate e")})
public class EmpleadoTemplate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "FORMATO")
    private String formato;
    @Column(name = "DEDO")
    private Integer dedo;
    @Basic(optional = false)
    @Lob
    @Column(name = "PLANTILLA")
    private Serializable plantilla;
    @Basic(optional = false)
    @Column(name = "PLANTILLA_CONTENT_TYPE")
    private String plantillaContentType;
    @Column(name = "TAMANIO")
    private Integer tamanio;
    @JoinColumn(name = "EMPLEADO_ID", referencedColumnName = "ID")
    @ManyToOne
    private Empleado empleado;

    public EmpleadoTemplate() {
    }

    public EmpleadoTemplate(Long id) {
        this.id = id;
    }

    public EmpleadoTemplate(Long id, String formato, Serializable plantilla, String plantillaContentType) {
        this.id = id;
        this.formato = formato;
        this.plantilla = plantilla;
        this.plantillaContentType = plantillaContentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Integer getDedo() {
        return dedo;
    }

    public void setDedo(Integer dedo) {
        this.dedo = dedo;
    }

    public Serializable getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(Serializable plantilla) {
        this.plantilla = plantilla;
    }

    public String getPlantillaContentType() {
        return plantillaContentType;
    }

    public void setPlantillaContentType(String plantillaContentType) {
        this.plantillaContentType = plantillaContentType;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoTemplate)) {
            return false;
        }
        EmpleadoTemplate other = (EmpleadoTemplate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.biosisperu.mercurio.siac.domain.EmpleadoTemplate[ id=" + id + " ]";
    }
    
}
