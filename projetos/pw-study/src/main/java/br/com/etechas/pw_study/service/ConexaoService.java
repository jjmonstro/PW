package br.com.etechas.pw_study.service;

import br.com.etechas.pw_study.entity.Conexao;
import br.com.etechas.pw_study.entity.Disciplina;
import br.com.etechas.pw_study.entity.Monitor;
import br.com.etechas.pw_study.repository.ConexaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ConexaoService {
    @Autowired
    private ConexaoRepository repository;

    public Long listar(){
        return repository.count();
    }

    public List<Conexao> buscaPorMonitor(Monitor monitor){
        var conexao = repository.findByMonitor(monitor);
        return conexao;
    }



}
