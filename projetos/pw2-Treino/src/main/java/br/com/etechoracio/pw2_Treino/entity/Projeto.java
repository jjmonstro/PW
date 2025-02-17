package br.com.etechoracio.pw2_Treino.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TBL_PROJETO")
public class Projeto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", columnDefinition = "varchar")
    private String nome;


    @ManyToMany
    @JoinTable(name = "TBL_Projeto_Funcionario",
        joinColumns = @JoinColumn(name = "funcionario_id"),
            inverseJoinColumns = @JoinColumn(name = "projeto_id")
    )
    private List<Funcionario> funcionario;
}
