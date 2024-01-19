package com.fcamarasantos.challenge.service;

import com.fcamarasantos.challenge.enums.TipoVeiculo;
import com.fcamarasantos.challenge.model.Estabelecimento;
import com.fcamarasantos.challenge.model.Veiculo;
import com.fcamarasantos.challenge.repository.EstabelecimentoRepository;
import com.fcamarasantos.challenge.repository.VeiculoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gustavo
 */
@Service
public class EstacionamentoService {
    
    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    
    @Autowired
    private VeiculoRepository veiculoRepository;
    
    public Estabelecimento adicionaVeiculo(Long estabelecimentoId, Long veiculoId) {
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(estabelecimentoId);
        Optional<Veiculo> veiculo = veiculoRepository.findById(veiculoId);
        if (estabelecimento.isPresent() && veiculo.isPresent()) {
            Estabelecimento estabelecimentoSalvo = estabelecimento.get();
            Veiculo veiculoSalvo = veiculo.get();
            if (veiculoSalvo.getTipo().equals(TipoVeiculo.CARRO)) {
                estabelecimentoSalvo.setQntVagasCarros(estabelecimentoSalvo.getQntVagasCarros() + 1);
            } else {
                estabelecimentoSalvo.setQntVagasMotos(estabelecimentoSalvo.getQntVagasMotos() + 1);
            }
            estabelecimentoRepository.save(estabelecimentoSalvo);
            return estabelecimentoSalvo;
        } else {
            return null;
        }
    }
    
    public Estabelecimento removeVeiculo(Long estabelecimentoId, Long veiculoId) {
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(estabelecimentoId);
        Optional<Veiculo> veiculo = veiculoRepository.findById(veiculoId);
        if (estabelecimento.isPresent() && veiculo.isPresent()) {
            Estabelecimento estabelecimentoSalvo = estabelecimento.get();
            Veiculo veiculoSalvo = veiculo.get();
            if (veiculoSalvo.getTipo().equals(TipoVeiculo.CARRO)) {
                estabelecimentoSalvo.setQntVagasCarros(estabelecimentoSalvo.getQntVagasCarros() - 1);
            } else {
                estabelecimentoSalvo.setQntVagasMotos(estabelecimentoSalvo.getQntVagasMotos() - 1);
            }
            estabelecimentoRepository.save(estabelecimentoSalvo);
            return estabelecimentoSalvo;
        } else {
            return null;
        }
    }
}
