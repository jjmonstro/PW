package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "TBL_MODELO")
public class Modelo {
    @Column(name = "ID_MODELO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "NR_POTENCIA", columnDefinition = "numeric")
    private Double potencia;

}
