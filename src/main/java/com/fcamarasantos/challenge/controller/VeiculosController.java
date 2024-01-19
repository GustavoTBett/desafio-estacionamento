package com.fcamarasantos.challenge.controller;

import com.fcamarasantos.challenge.dto.VeiculoInsert;
import com.fcamarasantos.challenge.model.Veiculo;
import com.fcamarasantos.challenge.repository.VeiculoRepository;
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
@RequestMapping(path = "/veiculo")
public class VeiculosController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public ResponseEntity findAll() {
        List<Veiculo> veiculos = veiculoRepository.findAll();
        return ResponseEntity.status(200).body(veiculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        if (veiculo.isPresent()) {
            return ResponseEntity.status(200).body(veiculo.get());
        } else {
            return ResponseEntity.status(404).body("O item com o id " + id + " não foi encontrado");
        }
    }

    @PostMapping
    public ResponseEntity create(@RequestBody VeiculoInsert veiculoInsert) {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca(veiculoInsert.getMarca());
        veiculo.setModelo(veiculoInsert.getModelo());
        veiculo.setCor(veiculoInsert.getCor());
        veiculo.setPlaca(veiculoInsert.getPlaca());
        veiculo.setTipo(veiculoInsert.getTipo());
        veiculoRepository.save(veiculo);
        return ResponseEntity.status(201).body(veiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody VeiculoInsert veiculoInsert) {
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        if (veiculo.isPresent()) {
            Veiculo veiculoSave = new Veiculo();
            veiculoSave.setMarca(veiculoInsert.getMarca());
            veiculoSave.setModelo(veiculoInsert.getModelo());
            veiculoSave.setCor(veiculoInsert.getCor());
            veiculoSave.setPlaca(veiculoInsert.getPlaca());
            veiculoSave.setTipo(veiculoInsert.getTipo());
            veiculoRepository.save(veiculoSave);
            return ResponseEntity.status(201).body(veiculoSave);
        } else {
            return ResponseEntity.status(404).body("O item com o id " + id + " não foi encontrado");
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id) {
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        if (veiculo.isPresent()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.status(404).body("O item com o id " + id + " não foi encontrado");
        }
    }
}
