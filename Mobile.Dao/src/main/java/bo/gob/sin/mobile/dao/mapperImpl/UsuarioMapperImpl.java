package bo.gob.sin.mobile.dao.mapperImpl;

import bo.gob.sin.mobile.domain.repository.IUsuarioMapper;
import bo.gob.sin.mobile.entities.model.Usuario;

public class UsuarioMapperImpl implements IUsuarioMapper {

    @Override
    public Usuario toEntity(Object vEnviarUsuario) {
        return new Usuario(vEnviarUsuario.getClass().getName());
    }
}
