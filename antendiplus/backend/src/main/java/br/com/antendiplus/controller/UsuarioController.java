package br.com.antendiplus.controller;

import br.com.antendiplus.dto.UsuarioDto;
import br.com.antendiplus.model.Usuario;
import br.com.antendiplus.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:5173") // permite que o Vue acesse a API
public class UsuarioController {

    public UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/cadastroUsuario")
    public String mostrarCadastroUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastroUsuario";
    }

    @PostMapping("/cadastrar")
    public boolean cadastrarUsuario(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService.cadastrarUsuario(usuarioDto);
    }

    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios() {
        return usuarioService.findAll();
    }

    @DeleteMapping("/{id}")
    public boolean excluirUsuario(@PathVariable int id) {
        return usuarioService.deletarUsuario(id);
    }
}
