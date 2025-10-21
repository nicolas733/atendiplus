package br.com.antendiplus.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity(name = "caixa")
public class Caixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private Pagamento pagamentoId;

    @ManyToOne
    @JoinColumn
    private Pedido pedidoId;

    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechamento;
    private double saldoInicial;
    private double saldoFinal;
    private double totalDinheiro;
    private double totalCartao;
    private double totalPix;
}
