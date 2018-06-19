package bo.gob.sin.mobile.dao.impl;

import java.util.List;

import bo.gob.sin.mobile.dao.IUsuarioDaoImpl;
import bo.gob.sin.mobile.dao.mapperImpl.UsuarioMapperImpl;
import bo.gob.sin.mobile.domain.model.UsuarioDomain;
import bo.gob.sin.mobile.domain.repository.IUsuarioRepository;

public class UsuarioRepositoryImp implements IUsuarioRepository {

    private final IUsuarioDaoImpl usuarioDao;
    private final UsuarioMapperImpl mapper;


    public UsuarioRepositoryImp(IUsuarioDaoImpl usuarioDao, UsuarioMapperImpl mapper) {
        this.usuarioDao = usuarioDao;
        this.mapper = mapper;
    }

    @Override
    public UsuarioDomain findByLogin(String login) {
        List<UsuarioDomain> vListaUsuario = null;
        vListaUsuario = (List<UsuarioDomain>) usuarioDao.findByLogin(login);
        if(vListaUsuario.size() >0){
            UsuarioDomain vUsuario = vListaUsuario.get(0);
            return vUsuario;
        }

        return null;
    }
}



