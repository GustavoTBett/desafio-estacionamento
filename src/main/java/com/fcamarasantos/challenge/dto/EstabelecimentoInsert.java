package com.fcamarasantos.challenge.dto;

/**
 *
 * @author gustavo
 */
public class EstabelecimentoInsert {
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private Long qntVagasMotos;
    private Long qntVagasCarros;

    public EstabelecimentoInsert(String nome, String cnpj, String endereco, String telefone, Long qntVagasMotos, Long qntVagasCarros) {
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
