package com.biosis.mercurio.siac;

import com.debortoliwines.openerp.api.OpenERPXmlRpcProxy;
import com.debortoliwines.openerp.api.Session;
import java.net.URL;
import static java.util.Arrays.asList;
import java.util.Collections;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //final String url = "http://127.0.0.1:8069", db="odooMercurio",username="mercurio1",password="admin";
        try {
            /*
            final XmlRpcClient client = new XmlRpcClient();
            final XmlRpcClientConfigImpl start_config = new XmlRpcClientConfigImpl();
            final XmlRpcClientConfigImpl model_config = new XmlRpcClientConfigImpl();
            start_config.setServerURL(new URL(String.format("%s/xmlrpc/2/common", url)));
            model_config.setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
            
            
            int uid = (int)client.execute(start_config,"authenticate",asList(db,username,password,emptyMap()));
            boolean resultado = (boolean)client.execute(model_config,"execute_kw",asList(db,uid,password,"res.partner","check_access_rights",asList("read"),new HashMap(){{put("raise_exception",false);}}));
            System.out.println("UId: "+uid);
            System.out.println("Valor bool: "+resultado);*/
            
            
            //final Map<String, String> info= (Map<String,String>)client.execute(start_config,"start",emptyList());
            Session sesion = new Session(OpenERPXmlRpcProxy.RPCProtocol.RPC_HTTP, "127.0.0.1", 8069, "odooMercurio", "mercurio1", "admin");

            
            sesion.startSession();

            Object[] params = new Object[]{new HashMap() {
                {
                    put("name", "Aarops");
                }
            }};
            sesion.executeCommand("hr.employee", "create", params);
                    
        //    System.out.println("URL: "+info.get("host"));
          //  System.out.println("db: "+info.get("database"));
           // System.out.println("username: "+info.get("user"));
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
