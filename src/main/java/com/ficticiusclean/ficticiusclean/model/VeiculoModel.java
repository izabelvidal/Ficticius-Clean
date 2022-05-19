package com.ficticiusclean.ficticiusclean.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "veiculo")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class VeiculoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private LocalDate dataFabricação;
    private  Double consumoCombustivelCidade;
    private  Double consumoCombustivelRodovia;

    public VeiculoModel(Long id, String nome, String marca, String modelo,
                        LocalDate dataFabricação,  Double consumoCombustivelCidade,
                        Double consumoCombustivelRodovia) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabricação = dataFabricação;
        this.consumoCombustivelCidade = consumoCombustivelCidade;
        this.consumoCombustivelRodovia = consumoCombustivelRodovia;
    }

    public VeiculoModel(){}

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

    public  Double getConsumoCombustivelCidade() {
        return consumoCombustivelCidade;
    }

    public void setConsumoCombustivelCidade( Double consumoCombustivelCidade) {
        this.consumoCombustivelCidade = consumoCombustivelCidade;
    }

    public  Double getConsumoCombustivelRodovia() {
        return consumoCombustivelRodovia;
    }

    public void setConsumoCombustivelRodovia( Double consumoCombustivelRodovia) {
        this.consumoCombustivelRodovia = consumoCombustivelRodovia;
    }
}
