package br.com.etechas.pw_study.repository;

import br.com.etechas.pw_study.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//aqui é onde tem os comandos
@Repository
public interface DisciplinaRepository
        extends JpaRepository<Disciplina, Long> {
    List<Disciplina> findByNome(String nome);
}
