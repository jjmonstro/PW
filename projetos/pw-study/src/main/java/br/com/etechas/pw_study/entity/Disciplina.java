package br.com.etechas.pw_study.entity;
// Matheus Bernardino
// João Pedro Correia
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_DISCIPLINA")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISCIPLINA")
    private Long id;

    @Column(name = "TX_NOME", columnDefinition = "varchar")
    private String nome;


}
