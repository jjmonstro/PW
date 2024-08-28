package br.com.etechas.pw_study.entity;
// Matheus Bernardino
// João Pedro Correia
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TBL_MONITOR")
public class Monitor {

    @Id
    @Column(name = "ID_MONITOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME",columnDefinition = "varchar")
    private String nome;

    @Column(name = "TX_FOTO",columnDefinition = "varchar")
    private String foto;

    @Column(name = "TX_WHATSAPP",columnDefinition = "varchar")
    private String whatsapp;

    @Column(name = "TX_EMAIL",columnDefinition = "varchar")
    private String email;

    @Column(name = "TX_CONTEUDO",columnDefinition = "varchar")
    private String conteudo;

    @JoinColumn(name = "ID_DISCIPLINA")
    @OneToOne
    private Disciplina id_disciplina;

    @ManyToMany
    @JoinTable(name = "TBL_REL_MONITOR_DISPONIBILIDADE",
            joinColumns = @JoinColumn(name = "ID_MONITOR"),
              inverseJoinColumns = @JoinColumn(name = "ID_DISPONIBILIDADE")
    )
    private List<Disponibilidade> disponibilidade;
}
