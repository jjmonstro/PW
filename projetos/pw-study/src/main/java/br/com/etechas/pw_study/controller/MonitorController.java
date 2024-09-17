package br.com.etechas.pw_study.controller;

import br.com.etechas.pw_study.entity.Monitor;
import br.com.etechas.pw_study.repository.MonitorRepository;
import br.com.etechas.pw_study.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//MATHEUS BERNARDINO
//JOAO PEDRO CORREIA

@RestController
@RequestMapping("/monitores")
public class MonitorController {
    @Autowired
    private MonitorService service;

    @GetMapping
    public List<Monitor> listar(){
        return service.listar();
    }

    @PostMapping
    public Monitor cadastrar(@RequestBody Monitor monitor){
        return service.cadastrar(monitor);
    }

}