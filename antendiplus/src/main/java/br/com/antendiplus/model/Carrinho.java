package br.com.antendiplus.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "carrinho")
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private Produtos produtoId;

    private int quantidade;
    private int subtotal;
}
