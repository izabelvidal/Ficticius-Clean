package com.ficticiusclean.ficticiusclean.service;

import com.ficticiusclean.ficticiusclean.controller.model.response.VeiculoModelResponse;
import com.ficticiusclean.ficticiusclean.model.VeiculoModel;
import com.ficticiusclean.ficticiusclean.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    @Autowired
    private ConsumoService service;

    public VeiculoModel insert(VeiculoModel obj) {
        return repository.save(obj);
    }

    public List<VeiculoModelResponse> somaTotal(Double preco, Double distanciaCidade, Double distanciaEstrada) {
        List<VeiculoModel> veiculos = repository.findAll();

        List<VeiculoModelResponse> calculaVeiculos = veiculos.stream().map(veiculo -> {
            Double consumoEstradaLitros = service.totalLitrosUsados(distanciaEstrada, veiculo.getConsumoCombustivelRodovia());
            Double consumoCidadeLitros = service.totalLitrosUsados(distanciaCidade, veiculo.getConsumoCombustivelCidade());
            Double consumoLitrosTotal = consumoCidadeLitros + consumoEstradaLitros;
            Double precoTotal = service.valorTotalAPagar(preco, consumoLitrosTotal);

            VeiculoModelResponse response = new VeiculoModelResponse();
            response.setNome(veiculo.getNome());
            response.setMarca(veiculo.getMarca());
            response.setModelo(veiculo.getModelo());
            response.setDataFabricação(veiculo.getDataFabricação());
            response.setCombustivelTotal(formataDouble(consumoLitrosTotal));
            response.setPrecoTotal(formataDouble(precoTotal));

            return response;
        }).collect(Collectors.toList());

        Collections.sort(calculaVeiculos);

        return calculaVeiculos;
    }

    private String formataDouble(Double preco) {
        String resultado = String.format("%.2f", preco);
        return resultado;
    }
}
