package com.fcamarasantos.challenge.dto;

import java.time.LocalDate;

/**
 *
 * @author gustavo
 */
public class RelatorioUnico {
    private Long id;
    private LocalDate createdAt;
    private String nome;
    private String cnpj;
    private Long qntVagasMotos;
    private Long qntVagasCarros;
    private Long qntVagasMotosPorHora;
    private Long qntVagasCarrosPorHora;

    public RelatorioUnico() {
    }

    public RelatorioUnico(Long id, LocalDate createdAt, String nome, String cnpj, Long qntVagasMotos, Long qntVagasCarros, Long qntVagasMotosPorHora, Long qntVagasCarrosPorHora) {
        this.id = id;
        this.createdAt = createdAt;
        this.nome = nome;
        this.cnpj = cnpj;
        this.qntVagasMotos = qntVagasMotos;
        this.qntVagasCarros = qntVagasCarros;
        this.qntVagasMotosPorHora = qntVagasMotosPorHora;
        this.qntVagasCarrosPorHora = qntVagasCarrosPorHora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public Long getQntVagasMotosPorHora() {
        return qntVagasMotosPorHora;
    }

    public void setQntVagasMotosPorHora(Long qntVagasMotosPorHora) {
        this.qntVagasMotosPorHora = qntVagasMotosPorHora;
    }

    public Long getQntVagasCarrosPorHora() {
        return qntVagasCarrosPorHora;
    }

    public void setQntVagasCarrosPorHora(Long qntVagasCarrosPorHora) {
        this.qntVagasCarrosPorHora = qntVagasCarrosPorHora;
    }
}
