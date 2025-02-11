package br.com.etechas.pw_study.repository;

import br.com.etechas.pw_study.entity.Conexao;
import br.com.etechas.pw_study.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
public interface ConexaoRepository extends JpaRepository<Conexao, Long> {
    List<Conexao> findByMonitor(Monitor monitor);
}
