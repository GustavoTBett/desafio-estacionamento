package com.fcamarasantos.challenge.controller;

import com.fcamarasantos.challenge.dto.RelatorioGeral;
import com.fcamarasantos.challenge.dto.RelatorioUnico;
import com.fcamarasantos.challenge.model.Estabelecimento;
import com.fcamarasantos.challenge.repository.EstabelecimentoRepository;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gustavo
 */
@RestController
@RequestMapping(path = "/relatorio")
public class RelatorioController {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @GetMapping
    public ResponseEntity findAll() {
        RelatorioGeral relatorio = new RelatorioGeral();
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
        relatorio.setQntVagasCarros(estabelecimentos.stream().mapToLong(x -> x.getQntVagasCarros()).sum());
        relatorio.setQntVagasMotos(estabelecimentos.stream().mapToLong(x -> x.getQntVagasMotos()).sum());

        return ResponseEntity.status(200).body(relatorio);
    }

    @GetMapping("/{id}")
    public ResponseEntity findAll(@PathVariable("id") Long id) {
        RelatorioUnico relatorio = new RelatorioUnico();
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);
        if (estabelecimento.isPresent()) {
            Estabelecimento e = estabelecimento.get();
            relatorio.setId(e.getId());
            relatorio.setNome(e.getNome());
            relatorio.setCnpj(e.getCnpj());
            relatorio.setQntVagasCarros(e.getQntVagasCarros());
            relatorio.setQntVagasMotos(e.getQntVagasMotos());
            LocalDate now = LocalDate.now();
            long diff = now.until(relatorio.getCreatedAt(), ChronoUnit.HOURS);
            relatorio.setQntVagasCarrosPorHora(e.getQntVagasCarros() / diff);
            relatorio.setQntVagasMotosPorHora(e.getQntVagasMotos() / diff);

            return ResponseEntity.status(200).body(relatorio);
        } else {
            return ResponseEntity.status(404).body("O item com o id " + id + " não foi encontrado");
        }
    }
}
