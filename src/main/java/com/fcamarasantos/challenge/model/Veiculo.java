package com.fcamarasantos.challenge.model;

import com.fcamarasantos.challenge.enums.TipoVeiculo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author gustavo
 */
@Entity
public class Veiculo extends EntityId {
    @Column(name = "marca", nullable = false)
    @NotNull
    @NotEmpty
    private String marca;
    
    @Column(name = "modelo", nullable = false)
    @NotNull
    @NotEmpty
    private String modelo;
    
    @Column(name = "cor", nullable = false)
    @NotNull
    @NotEmpty
    private String cor;
    
    @Column(name = "placa", nullable = false)
    @NotNull
    @NotEmpty
    private String placa;
    
    @Column(name = "tipo", nullable = false)
    @NotNull
    @NotEmpty
    private TipoVeiculo tipo;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String cor, String placa, TipoVeiculo tipo) {
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
