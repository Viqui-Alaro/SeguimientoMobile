package bo.gob.sin.mobile.domain.repository;

import bo.gob.sin.mobile.domain.model.UsuarioDomain;

/**
 * Interfaz de repositorio para ser implementado por la capa de Datos.
 */

public interface IUsuarioRepository {

    UsuarioDomain findByLogin(String login);
}
