package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ACESSORIO")
public class Acessorio {
    @Id
    @Column(name = "ID_ACESSORIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAcessorio;

    @Column(name = "TX_DESCRICAO")
    private String txNome;
}
