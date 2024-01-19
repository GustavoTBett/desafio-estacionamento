package com.fcamarasantos.challenge.dto;

import com.fcamarasantos.challenge.enums.TipoVeiculo;

/**
 *
 * @author gustavo
 */
public class VeiculoInsert {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private TipoVeiculo tipo;

    public VeiculoInsert(String marca, String modelo, String cor, String placa, TipoVeiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
    
    
}
