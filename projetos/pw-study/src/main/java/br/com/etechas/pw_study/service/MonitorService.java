package br.com.etechas.pw_study.service;


import br.com.etechas.pw_study.entity.Monitor;
import br.com.etechas.pw_study.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//MATHEUS BERNARDINO
//JOAO PEDRO CORREIA

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository repository;

    public List<Monitor> listar(){
        return repository.findAll();
    }

    public Monitor cadastrar(Monitor monitor){
        var existe = repository.findByEmail(monitor.getEmail());
        if (!existe.isEmpty()){
            throw new RuntimeException("Email já cadastrado");
        }

        existe = repository.findByWhatsapp(monitor.getWhatsapp());
        if (!existe.isEmpty()){
            throw new RuntimeException("Whatsapp já cadastrado");
        }
        return repository.save(monitor);
    }
}
