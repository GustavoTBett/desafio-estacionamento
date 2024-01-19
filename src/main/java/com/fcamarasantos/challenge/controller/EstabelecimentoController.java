package com.fcamarasantos.challenge.controller;

import com.fcamarasantos.challenge.dto.EstabelecimentoInsert;
import com.fcamarasantos.challenge.model.Estabelecimento;
import com.fcamarasantos.challenge.repository.EstabelecimentoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gustavo
 */
@RestController
@RequestMapping(path = "/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @GetMapping
    public ResponseEntity findAll() {
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
        return ResponseEntity.status(200).body(estabelecimentos);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity findById(@PathVariable("id") Long estabelecimentoId) {
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(estabelecimentoId);
        if (estabelecimento.isPresent()) {
            return ResponseEntity.status(200).body(estabelecimento.get());
        } else {
            return ResponseEntity.status(404).body("O item com o id " + estabelecimentoId + " não foi encontrado");
        }
    }

    @PostMapping
    public ResponseEntity create(@RequestBody EstabelecimentoInsert estabelecimentoInsert) {
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setNome(estabelecimentoInsert.getNome());
        estabelecimento.setCnpj(estabelecimentoInsert.getCnpj());
        estabelecimento.setEndereco(estabelecimentoInsert.getEndereco());
        estabelecimento.setTelefone(estabelecimentoInsert.getTelefone());
        estabelecimento.setQntVagasMotos(estabelecimentoInsert.getQntVagasMotos());
        estabelecimento.setQntVagasCarros(estabelecimentoInsert.getQntVagasCarros());
        estabelecimentoRepository.save(estabelecimento);
        return ResponseEntity.status(201).body(estabelecimento);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody EstabelecimentoInsert estabelecimentoInsert) {
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);
        if (estabelecimento.isPresent()) {
            Estabelecimento estabelecimentoSave = estabelecimento.get();
            estabelecimentoSave.setNome(estabelecimentoInsert.getNome());
            estabelecimentoSave.setCnpj(estabelecimentoInsert.getCnpj());
            estabelecimentoSave.setEndereco(estabelecimentoInsert.getEndereco());
            estabelecimentoSave.setTelefone(estabelecimentoInsert.getTelefone());
            estabelecimentoSave.setQntVagasMotos(estabelecimentoInsert.getQntVagasMotos());
            estabelecimentoSave.setQntVagasCarros(estabelecimentoInsert.getQntVagasCarros());
            estabelecimentoRepository.save(estabelecimentoSave);
            return ResponseEntity.status(200).body(estabelecimentoSave);
        } else {
            return ResponseEntity.status(404).body("O item com o id " + id + " não foi encontrado");
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id) {
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);
        if (estabelecimento.isPresent()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.status(404).body("O item com o id " + id + " não foi encontrado");
        }
    }
}
