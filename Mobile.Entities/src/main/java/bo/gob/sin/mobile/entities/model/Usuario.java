package bo.gob.sin.mobile.entities.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "usuarioEntity")
public class Usuario {


    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "login")
    private String login;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "rol")
    private Boolean rol;

    public Usuario(String nombre) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRol() {
        return rol;
    }

    public void setRol(Boolean rol) {
        this.rol = rol;
    }



}
