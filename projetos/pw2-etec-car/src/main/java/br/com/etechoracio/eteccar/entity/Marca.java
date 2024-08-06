package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.SimpleTimeZone;
@Entity
@Setter
@Getter
@Table(name = "TBL_MARCA")
public class Marca {

    @Id
    @Column(name = "ID_MARCA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

}
