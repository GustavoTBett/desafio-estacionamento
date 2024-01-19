package com.fcamarasantos.challenge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author gustavo
 */
@Entity
@Table
public class Estabelecimento extends EntityId {
    @Column(name = "nome", nullable = false)
    @NotNull
    @NotEmpty
    private String nome;
    
    @Column(name = "cnpj", nullable = false)
    @NotNull
    @NotEmpty
    private String cnpj;
    
    @Column(name = "endereco", nullable = false)
    @NotNull
    @NotEmpty
    private String endereco;
    
    @Column(name = "telefone", nullable = false)
    @NotNull
    @NotEmpty
    private String telefone;
    
    @Column(name = "qntVagasMotos", nullable = false)
    @NotNull
    @NotEmpty
    private Long qntVagasMotos;
    
    @Column(name = "qntVagasCarros", nullable = false)
    @NotNull
    @NotEmpty
    private Long qntVagasCarros;

    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String cnpj, String endereco, String telefone, Long qntVagasMotos, Long qntVagasCarros) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.qntVagasMotos = qntVagasMotos;
        this.qntVagasCarros = qntVagasCarros;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
