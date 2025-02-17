package br.com.etechas.pw_study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "TBL_CONEXAO")
public class Conexao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONEXAO")
    private Long id;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime data;

    @JoinColumn(name = "ID_MONITOR")
    @ManyToOne
    private Monitor monitor;
}
