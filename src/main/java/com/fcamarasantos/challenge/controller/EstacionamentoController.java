package com.fcamarasantos.challenge.controller;

import com.fcamarasantos.challenge.model.Estabelecimento;
import com.fcamarasantos.challenge.service.EstacionamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gustavo
 */
@RestController
@RequestMapping(path = "/estacionamento")
public class EstacionamentoController {
    
    @Autowired
    private EstacionamentoService estacionamentoService;
    
    @PostMapping("/entrar/{estabelecimentoId}&{veiculoId}")
    public ResponseEntity veiculoEntrando(@PathVariable("estabelecimentoId") Long estabelecimentoId, @PathVariable("veiculoId") Long veiculoId) {
        Estabelecimento estabelecimento = estacionamentoService.adicionaVeiculo(estabelecimentoId, veiculoId);
        if (estabelecimento == null) {
            return ResponseEntity.status(404).body("Alguns dos campos estão incorretos!");
        } else {
            return ResponseEntity.status(200).body("Veículo adicionado ao estabelecimento");
        }
    }
    
    @PostMapping("/sair/{estabelecimentoId}&{veiculoId}")
    public ResponseEntity veiculoSaindo(@PathVariable("estabelecimentoId") Long estabelecimentoId, @PathVariable("veiculoId") Long veiculoId) {
        Estabelecimento estabelecimento = estacionamentoService.removeVeiculo(estabelecimentoId, veiculoId);
        if (estabelecimento == null) {
            return ResponseEntity.status(404).body("Alguns dos campos estão incorretos!");
        } else {
            return ResponseEntity.status(200).body("Veículo adicionado ao estabelecimento");
        }
    }
}
