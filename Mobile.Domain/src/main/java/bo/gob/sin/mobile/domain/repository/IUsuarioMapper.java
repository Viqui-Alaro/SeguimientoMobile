package bo.gob.sin.mobile.domain.repository;

import bo.gob.sin.mobile.entities.model.Usuario;

public interface IUsuarioMapper {

   Usuario toEntity(Object vEnviarUsuario);
}
