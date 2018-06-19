package bo.gob.sin.mobile.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.sun.istack.internal.NotNull;

import java.util.List;

import bo.gob.sin.mobile.domain.repository.IUsuarioDao;
import bo.gob.sin.mobile.entities.model.Usuario;

/**
 * Descripción: - Clase que implementa la Interfaz de Usuario
 * @author: viqui.alaro
 * @version:  1.0 - 18/06/2018
 */

@Dao
public interface IUsuarioDaoImpl extends IUsuarioDao{

    @Insert(onConflict = 1)
    void insertOrUpdate(@NotNull Usuario var1);

    /**
     * Función que devuelve todos los usuarios
     * @return  retorna una lista de todos los usuarios.
     */
    @Query("SELECT * FROM usuarioEntity")
    List<Usuario> getAll();

    /**
     * Función que devuelve los usuarios por rol.
     * @param pRol tipo de rol(Admin,Normal)equivalente a (true,false)
     * @return  retorna una lista de usuarios por rol.
     */
    List<Usuario> getUsuariosByRol(Boolean pRol);

    /**
     * Función que realiza la búsqueda de un usuario por el login (Usuario),
     * retorna el usuario con el login dado
     * @param pLogin parametro de busqueda de un usuario
     * @return   retorna un Usuario con el login dado .
     */
    @Query("SELECT nombre FROM usuarioEntity WHERE login =:pLogin")
    Usuario findByLogin(String pLogin);

    /**
     * Función que devuelve a un usuario por el nombre.
     * @param pNombre que es el nombre de el usuario
     * @return  retorna a un usuario por el nombre.
     */

    @Query("SELECT * FROM usuarioEntity where nombre like :pNombre")
    Usuario findByName(String pNombre);


    /**
     * Función que devuelve el numero de usuario.
     * @return  retorna el numero de usuarios.
     */

    @Query("SELECT COUNT(*) FROM usuarioEntity")
    int count();

    /**
     * Función que elimina un usuario.
     * @return  la eliminación de un usuario.
     */
    @Delete
    void delete(@NotNull Usuario usuarioEntity);



}
