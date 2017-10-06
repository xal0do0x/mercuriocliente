/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.controladores;

import com.biosisperu.mercurio.siac.domain.Empleado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AJC
 */
public class EmpleadoControlador extends Controlador<Empleado> {

    public EmpleadoControlador() {
        super(Empleado.class);
    }

    @Override
    public void prepararCrear() {
        super.prepararCrear(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Empleado buscarPorDNI(String dni){
        String jpql = "SELECT e FROM Empleado e WHERE e.dni = "+dni;
        List<Empleado> empleadoList = this.getDao().buscar(jpql);
        if(empleadoList != null && empleadoList.size() > 0){
            return empleadoList.get(0);
        }else{
            return null;
        }
    }
}
