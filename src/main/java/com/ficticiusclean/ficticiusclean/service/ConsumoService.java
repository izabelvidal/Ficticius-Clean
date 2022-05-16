package com.ficticiusclean.ficticiusclean.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ConsumoService {

    public BigDecimal valorTotalAPagar(BigDecimal gasolinaPreco, BigDecimal consumoLitrosGasolina) {
        return gasolinaPreco.multiply(consumoLitrosGasolina);
    }

    public BigDecimal totalLitrosUsados(BigDecimal distancia, BigDecimal mediaConsumida) {
        return distancia.divide(mediaConsumida, RoundingMode.HALF_UP);
    }
}
