package br.com.antendiplus.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn
    private Pedido pedidoId;

    private double valorTotal;
    private Status status;

}
