package br.com.etechas.pw_study.repository;

import br.com.etechas.pw_study.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository
        extends JpaRepository<Disciplina, Long> {

}
