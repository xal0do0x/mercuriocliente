/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosisperu.mercurio.siac.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Aldo
 */
@Embeddable
public class EmpleadoTemplateId implements Serializable{
    @Column(name="NEMPLEADOID")
    @Basic
    private Integer nEmpleadoId;
    
    @Column(name="NINDEX")
    @Basic
    private Integer nIndex;
    
    @Column(name="NFINGERINDEX")
    @Basic
    private Integer nFingerIndex;

    public EmpleadoTemplateId(){}
    
    public Integer getnEmpleadoId() {
        return nEmpleadoId;
    }

    public void setnEmpleadoId(Integer nEmpleadoId) {
        this.nEmpleadoId = nEmpleadoId;
    }

    public Integer getnIndex() {
        return nIndex;
    }

    public void setnIndex(Integer nIndex) {
        this.nIndex = nIndex;
    }

    public Integer getnFingerIndex() {
        return nFingerIndex;
    }

    public void setnFingerIndex(Integer nFingerIndex) {
        this.nFingerIndex = nFingerIndex;
    }
    
    
}
