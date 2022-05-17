package com.ficticiusclean.ficticiusclean.controller.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VeiculoModelResponse implements Comparable {

    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private LocalDate dataFabricação;
    private BigDecimal consumoCombustivelCidade;
    private BigDecimal consumoCombustivelRodovia;
    private BigDecimal precoTotal;

    public VeiculoModelResponse(Long id, String nome, String marca, String modelo, LocalDate dataFabricação,
                                BigDecimal consumoCombustivelCidade, BigDecimal consumoCombustivelRodovia, BigDecimal precoTotal) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabricação = dataFabricação;
        this.consumoCombustivelCidade = consumoCombustivelCidade;
        this.consumoCombustivelRodovia = consumoCombustivelRodovia;
        this.precoTotal = precoTotal;
    }

    public VeiculoModelResponse(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public LocalDate getDataFabricação() {
        return dataFabricação;
    }

    public void setDataFabricação(LocalDate dataFabricação) {
        this.dataFabricação = dataFabricação;
    }

    public BigDecimal getConsumoCombustivelCidade() {
        return consumoCombustivelCidade;
    }

    public void setConsumoCombustivelCidade(BigDecimal consumoCombustivelCidade) {
        this.consumoCombustivelCidade = consumoCombustivelCidade;
    }

    public BigDecimal getConsumoCombustivelRodovia() {
        return consumoCombustivelRodovia;
    }

    public void setConsumoCombustivelRodovia(BigDecimal consumoCombustivelRodovia) {
        this.consumoCombustivelRodovia = consumoCombustivelRodovia;
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(BigDecimal precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public int compareTo(Object o) {
        VeiculoModelResponse other = (VeiculoModelResponse) o;
        if (other == null) return 0;
        if (this.getPrecoTotal().compareTo(other.getPrecoTotal()) > 1) {
            return 1;
        } else if (this.getPrecoTotal().compareTo(other.getPrecoTotal()) < -1) {
            return -1;
        }
        return 0;
    }
}
