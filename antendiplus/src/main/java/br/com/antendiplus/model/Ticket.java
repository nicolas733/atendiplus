package br.com.antendiplus.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //pensar em como relacionar com a senha do pedido a Fazer em Pedidos//
    private int senhaPedido;

    @OneToOne
    @JoinColumn
    private Pedido pedidoId;

    @OneToOne
    @JoinColumn
    private Pagamento pagamentoId;

    private LocalDateTime dataHoraPedido;
}
