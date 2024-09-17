package br.com.etechas.pw_study.repository;

import br.com.etechas.pw_study.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//aquié onde tem os comandos
public interface MonitorRepository
        extends JpaRepository<Monitor, Long> {

    List<Monitor> findByWhatsapp(String whatsapp);
    List<Monitor> findByEmail(String email);
}
