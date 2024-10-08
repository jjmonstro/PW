package br.com.etechas.pw_study.repository;

import br.com.etechas.pw_study.entity.Disciplina;
import br.com.etechas.pw_study.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//aquié onde tem os comandos
@Repository
public interface MonitorRepository
        extends JpaRepository<Monitor, Long> {

    List<Monitor> findByWhatsapp(String whatsapp);
    List<Monitor> findByEmail(String email);

    List<Monitor> findByDisciplina(Disciplina disciplina);
}
