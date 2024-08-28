package br.com.etechas.pw_study.entity;
// Matheus Bernardino
// João Pedro Correia
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_DISPONIBILIDADE")
@Getter
@Setter
public class Disponibilidade {

    @Id
    @Column(name = "ID_DISPONIBILIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_DIA_SEMANA", columnDefinition = "varchar")
    private String dia_senha;

    @Column(name = "DT_DAS", columnDefinition = "DateTime")
    private LocalDateTime dt_das;

    @Column(name = "DT_ATE", columnDefinition = "DateTime")
    private LocalDateTime dt_ate;

}
