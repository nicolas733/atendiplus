package br.com.antendiplus.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuarioDto {

    @NotNull
    @Size(min = 3, max = 40)
    private String nome;

    @NotNull
    @Size(min = 3, max = 40)
    private String login;

    @NotNull
    @Size(min = 3, max = 40)
    private String senha;
}
