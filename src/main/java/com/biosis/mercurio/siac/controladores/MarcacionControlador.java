/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.controladores;

import com.biosisperu.mercurio.siac.domain.Marcacion;

/**
 *
 * @author francis
 */
public class MarcacionControlador extends Controlador<Marcacion> {

    private MarcacionControlador() {
        super(Marcacion.class);
    }

    public static MarcacionControlador getInstance() {
        return MarcacionControladorHolder.INSTANCE;
    }

    private static class MarcacionControladorHolder {

        private static final MarcacionControlador INSTANCE = new MarcacionControlador();
    }
}
