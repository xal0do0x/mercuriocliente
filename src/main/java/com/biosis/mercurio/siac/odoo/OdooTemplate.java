/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.odoo;

import com.biosis.mercurio.siac.odoo.OdooCliente.RPCProtocol;
import com.biosis.mercurio.siac.odoo.exceptions.OdooException;
import org.apache.xmlrpc.XmlRpcException;

/**
 *
 * @author fesqu
 */
public class OdooTemplate {

    private OdooCliente.RPCProtocol protocol;
    private String host;
    private int port;

    public OdooTemplate(String host, int port) {
        this(RPCProtocol.RPC_HTTP, host, port);
    }

    public OdooTemplate(OdooCliente.RPCProtocol protocol,
            String host, int port) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
    }

    @SuppressWarnings("unchecked")
    public <Result> Result executeCall(OdooCliente.RPCServices rpcService,
            String methodName, Object[] parameters, Class<Result> result) {
        try {
            return (Result) new OdooCliente(protocol, host, port,
                    rpcService).execute(methodName, parameters);
        } catch (XmlRpcException xmlRpcEx) {
            throw new OdooException(xmlRpcEx);
        }
    }
}
