package br.com.etechas.pw_study.controller;

import br.com.etechas.pw_study.entity.Monitor;
import br.com.etechas.pw_study.service.ConexaoService;
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

    @Autowired
    private ConexaoService Cservice;

    @GetMapping
    public List<Monitor> listar(){
        return service.listar();
    }

    @PostMapping
    public Monitor cadastrar(@RequestBody Monitor monitor){
        return service.cadastrar(monitor);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id){
        var existe = service.buscaPorId(id);
        if (existe.isPresent()){
           var existe2 = Cservice.buscaPorMonitor(service.buscaPorId(id).get());
           if (existe2 != null){
                service.deletar(id);
           }
           else {

           }
        }
        else{
            throw new RuntimeException("Monitor não esxiste");
        }
    }

}