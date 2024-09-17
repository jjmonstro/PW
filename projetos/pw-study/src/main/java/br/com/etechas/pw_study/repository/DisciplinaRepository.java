package br.com.etechas.pw_study.repository;

import br.com.etechas.pw_study.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//aquié onde tem os comandos
public interface DisciplinaRepository
        extends JpaRepository<Disciplina, Long> {
    List<Disciplina> findByNome(String nome);
}
