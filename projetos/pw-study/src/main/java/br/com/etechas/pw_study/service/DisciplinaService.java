package br.com.etechas.pw_study.service;

import br.com.etechas.pw_study.entity.Disciplina;
import br.com.etechas.pw_study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//aqui ficarão asregras de negócio
@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Disciplina cadastrar(Disciplina disciplina){
        return repository.save(disciplina);
    }
}
