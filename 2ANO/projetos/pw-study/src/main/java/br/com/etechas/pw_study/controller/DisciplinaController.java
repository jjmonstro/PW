package br.com.etechas.pw_study.controller;

import br.com.etechas.pw_study.entity.Disciplina;
import br.com.etechas.pw_study.repository.DisciplinaRepository;
import br.com.etechas.pw_study.service.DisciplinaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.el.lang.ELSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//aqui ele ficaouvindo asrequisições http e ve se é pra ele
@Tag(description = "gerencia disciplina", name = "Disciplina")
@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    @Operation(summary = "Lista de disciplinas")
    @GetMapping
    public List<Disciplina> listar(){
        return service.listar();
    }

    @ApiResponse(responseCode = "200", description = "OK")
    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarporId(@PathVariable Long id){
        var existe = service.buscaPorId(id);
// return service.buscaPorId(id).map(e-> ResponseEntity.ok(e)).orElse(ResponseEntity.notFound().build());
// Jeito mais curto para executar essa operação
        if(existe.isPresent()){
            return ResponseEntity.ok(existe.get());
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return service.cadastrar(disciplina);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Disciplina> deletarPorId(@PathVariable Long id){
        var existe = service.buscaPorId(id);
        if (existe.isPresent()){
            service.deletarPorId(id);
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Disciplina> Editar(@RequestBody Disciplina disciplina, @PathVariable Long id) {
        var existe = service.buscaPorId(id);
        if (existe.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        if(disciplina.getId() != id){
            throw new RuntimeException("Id da url diferente do budy");
        }

        List findNome = service.buscaPorNome(disciplina.getNome());

        var editado = service.editarDisciplina(disciplina);
        return ResponseEntity.ok(editado);
    }
}
