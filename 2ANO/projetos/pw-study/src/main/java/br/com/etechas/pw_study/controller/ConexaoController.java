package br.com.etechas.pw_study.controller;

import br.com.etechas.pw_study.entity.Conexao;
import br.com.etechas.pw_study.entity.Monitor;
import br.com.etechas.pw_study.service.ConexaoService;
import br.com.etechas.pw_study.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conexoes")
public class ConexaoController {
    @Autowired
    private ConexaoService service;

    @GetMapping
    public Long listar(){
        return service.listar();
    }

    @PostMapping
    public Conexao cadastrar(@RequestBody Monitor monitor) {
        return service.cadastrar(monitor);
    }
}
