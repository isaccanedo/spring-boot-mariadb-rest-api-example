package br.com.isaccanedo.controller;


import br.com.isaccanedo.exception.ResourceNotFoundException;
import br.com.isaccanedo.model.MedicamentoModel;
import br.com.isaccanedo.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AnotacoesController {


    @Autowired
    MedicamentoRepository medicamentoRepository;

    @GetMapping("/medicamentos")
    public List<MedicamentoModel> getMedicamentos() {
       return medicamentoRepository.findAll();
    }

    @PostMapping("/medicamento/novo")
    public MedicamentoModel createMedicamento(@Valid @RequestBody MedicamentoModel medicamento) {
        return medicamentoRepository.save(medicamento) ;
    }

    @GetMapping("/medicamento/{id}")
    public MedicamentoModel getMedicamentoById(@PathVariable(value = "id") Long medicamentoId) {
        return medicamentoRepository.findById(medicamentoId)
                .orElseThrow(() -> new ResourceNotFoundException("Medicamento", "id", medicamentoId));
    }

    @PutMapping("/medicamento/{id}")
    public MedicamentoModel updateMedicamento(@PathVariable(value = "id") Long medicamentoId,
                           @Valid @RequestBody MedicamentoModel medicamentoDetails) {

        MedicamentoModel medicamentoModel = medicamentoRepository.findById(medicamentoId)
                .orElseThrow(() -> new ResourceNotFoundException("Medicamento", "id", medicamentoId));

        medicamentoModel.setTitulo(medicamentoDetails.getTitulo());
        medicamentoModel.setConteudo(medicamentoDetails.getConteudo());

        MedicamentoModel updatedMedicamento = medicamentoRepository.save(medicamentoModel);
        return medicamentoModel;
    }

    @DeleteMapping("/medicamento/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long medicamentoId) {
        MedicamentoModel medicamentoModel = medicamentoRepository.findById(medicamentoId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", medicamentoId));

        medicamentoRepository.delete(medicamentoModel);

        return ResponseEntity.ok().build();
    }




}
