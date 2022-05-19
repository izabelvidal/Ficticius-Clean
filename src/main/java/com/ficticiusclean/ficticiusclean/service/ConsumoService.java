package com.ficticiusclean.ficticiusclean.service;

import org.springframework.stereotype.Service;

@Service
public class ConsumoService {

    public  Double valorTotalAPagar( Double gasolinaPreco, Double consumoLitrosGasolina) {
        return gasolinaPreco*consumoLitrosGasolina;
    }

    public Double totalLitrosUsados( Double distancia,  Double mediaConsumida) {
        return distancia/mediaConsumida;
    }
}
