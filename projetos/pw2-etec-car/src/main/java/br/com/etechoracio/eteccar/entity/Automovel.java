package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_AUTOMOVEL")
public class Automovel {

    @Column(name = "ID_AUTOMOVEL")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NR_ANO_FABRICACAO")
    private int anoFabricacao;

    @Column(name = "NR_ANO_MODELO")
    private int anoModelo;

    @Column(name = "TP_COMBUSTIVEL", columnDefinition = "varchar")
    private String combustivel;

    @Column(name = "NR_KM_ATUAL", columnDefinition = "numeric")
    private Double kmAtual;

}
