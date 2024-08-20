package br.com.etechoracio.eteccar.entity;

import br.com.etechoracio.eteccar.enums.TiposCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
    @Enumerated(EnumType.STRING)
    private TiposCombustivelEnum tiposCombustivel;

    @Column(name = "NR_KM_ATUAL")
    private int kmAtual;

    @JoinColumn(name = "ID_MODELO")
    @ManyToOne
    private Modelo modelo;

    @ManyToMany
    @JoinTable(name = "TBL_REL_AUTOMOVEL_ACESSORIO",
        joinColumns = @JoinColumn(name = "ID_AUTOMOVEL"),
            inverseJoinColumns = @JoinColumn(name = "ID_ACESSORIO")
    )
    private List<Acessorio> acessorios;

}
