package br.com.antendiplus.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public abstract class AbstraticModel {
    @DateTimeFormat
    private String dataCriacao;
    @DateTimeFormat
    private String dataAtualizacao;
}
