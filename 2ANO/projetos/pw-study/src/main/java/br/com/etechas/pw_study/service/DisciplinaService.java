package br.com.etechas.pw_study.service;

import br.com.etechas.pw_study.entity.Disciplina;
import br.com.etechas.pw_study.repository.DisciplinaRepository;
import br.com.etechas.pw_study.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//aqui ficarão asregras de negócio
@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;
    @Autowired
    private MonitorRepository Monitor_Repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Optional<Disciplina> buscaPorId(Long id){
        var disciplina = repository.findById(id);
        return disciplina;
    }
    public List<Disciplina> buscaPorNome(String nome){
        var disciplina = repository.findByNome(nome);
        return disciplina;
    }
    public Disciplina cadastrar(Disciplina disciplina)
    {
        var existe = repository.findByNome(disciplina.getNome());
        if (!existe.isEmpty()){
            throw new RuntimeException("Nome da disciplina já cadastrado");
        }
        return repository.save(disciplina);}

        public void deletarPorId(Long id){
        var busca = new Disciplina();
        busca.setId(id);
        var existe = Monitor_Repository.findByDisciplina(busca);
            if (!existe.isEmpty()){
                throw new RuntimeException("Disciplina está sendo usada");
            }
        repository.deleteById(id);
        }


        public Disciplina editarDisciplina(Disciplina disciplina){
            return repository.save(disciplina);
        }
    }
