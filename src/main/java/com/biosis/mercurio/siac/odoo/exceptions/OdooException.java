/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.odoo.exceptions;

/**
 *
 * @author fesqu
 */
public class OdooException extends RuntimeException {
	private static final long serialVersionUID = -5360622566392311263L;

	public OdooException(){
		
	}
	
	public OdooException(Throwable cause){
		super(cause);
	}
}