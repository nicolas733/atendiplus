package br.com.antendiplus.service;

import br.com.antendiplus.repository.UsuarioRepository;
import br.com.antendiplus.dto.UsuarioDto;
import br.com.antendiplus.model.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {


    private UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    //tratar excessoes//
    public boolean cadastrarUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDto.getNome());
        usuario.setLogin(usuarioDto.getLogin());
        usuario.setSenha(usuarioDto.getSenha());
        usuarioRepository.save(usuario);
        return true;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }


    //fazer validações//
    public boolean atualizarUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDto.getNome());
        usuario.setLogin(usuarioDto.getLogin());
        usuario.setSenha(usuarioDto.getSenha());
        usuarioRepository.save(usuario);
        return true;
    }

    //fazer validações//
    public boolean deletarUsuario(@RequestParam int id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            usuarioRepository.delete(usuarioOptional.get());
            return true; // exclusão feita com sucesso
        } else {
            return false; // usuário não encontrado
        }
    }
}
