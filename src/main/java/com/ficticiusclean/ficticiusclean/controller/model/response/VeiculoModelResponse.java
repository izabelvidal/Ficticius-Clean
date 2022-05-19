package com.ficticiusclean.ficticiusclean.controller.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VeiculoModelResponse implements Comparable {

    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private LocalDate dataFabricação;
    private Double consumoCombustivelCidade;
    private Double consumoCombustivelRodovia;
    private String precoTotal;
    private String combustivelTotal;

    public VeiculoModelResponse(Long id, String nome, String marca, String modelo, LocalDate dataFabricação,
                                Double consumoCombustivelCidade,  Double consumoCombustivelRodovia,  String precoTotal, String combustivelTotal) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabricação = dataFabricação;
        this.consumoCombustivelCidade = consumoCombustivelCidade;
        this.consumoCombustivelRodovia = consumoCombustivelRodovia;
        this.precoTotal = precoTotal;
        this.combustivelTotal = combustivelTotal;
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

    public Double getConsumoCombustivelCidade() {
        return consumoCombustivelCidade;
    }

    public void setConsumoCombustivelCidade(Double consumoCombustivelCidade) {
        this.consumoCombustivelCidade = consumoCombustivelCidade;
    }

    public Double getConsumoCombustivelRodovia() {
        return consumoCombustivelRodovia;
    }

    public void setConsumoCombustivelRodovia(Double consumoCombustivelRodovia) {
        this.consumoCombustivelRodovia = consumoCombustivelRodovia;
    }

    public String getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(String precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getCombustivelTotal() {
        return combustivelTotal;
    }

    public void setCombustivelTotal(String combustivelTotal) {
        this.combustivelTotal = combustivelTotal;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
