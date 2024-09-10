package br.com.etechas.pw_study.controller;

import br.com.etechas.pw_study.entity.Disciplina;
import br.com.etechas.pw_study.repository.DisciplinaRepository;
import br.com.etechas.pw_study.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//aqui ele ficaouvindo asrequisições http e ve se é pra ele
@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<Disciplina> listar(){
        return service.listar();
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return service.cadastrar(disciplina);
    }

}
