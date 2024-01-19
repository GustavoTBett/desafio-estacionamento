package com.fcamarasantos.challenge.dto;

/**
 *
 * @author gustavo
 */
public class RelatorioGeral {
    private Long qntVagasMotos;
    private Long qntVagasCarros;

    public RelatorioGeral() {
    }

    public RelatorioGeral(Long qntVagasMotos, Long qntVagasCarros) {
        this.qntVagasMotos = qntVagasMotos;
        this.qntVagasCarros = qntVagasCarros;
    }

    public Long getQntVagasMotos() {
        return qntVagasMotos;
    }

    public void setQntVagasMotos(Long qntVagasMotos) {
        this.qntVagasMotos = qntVagasMotos;
    }

    public Long getQntVagasCarros() {
        return qntVagasCarros;
    }

    public void setQntVagasCarros(Long qntVagasCarros) {
        this.qntVagasCarros = qntVagasCarros;
    }
}
