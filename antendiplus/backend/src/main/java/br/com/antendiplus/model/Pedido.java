package br.com.antendiplus.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity (name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn
    private Carrinho carrinhoId;

    @OneToOne
    @JoinColumn
    private Usuario usuarioId;

    private Status status;
    private LocalDateTime dataHoraPedido;

    //pensar em como relacionar com a senha do pedido a Fazer em Pedidos//
    private int senhaPedidoAFazer;
}
