package bo.gob.sin.mobile.domain.model;

import com.sun.org.apache.xpath.internal.operations.String;

import sun.rmi.runtime.Log;

/**
 * Representa el modelo de datos
 */

public class UsuarioDomain {

    private final String login;

    public UsuarioDomain(String login) {
        this.login = login;
    }
    public final String getLogin(){
        return this.login;
    }


    public final boolean isValidForAdd(){
        String vValidaAdd = this.login;
        if(vValidaAdd == null){

        }else{
            return (vValidaAdd).toString().length()>1;
        }
        return vValidaAdd.toString().length()>5;

    }

}
