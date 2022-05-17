package com.ficticiusclean.ficticiusclean.controller.mapper;

import com.ficticiusclean.ficticiusclean.controller.model.response.VeiculoModelResponse;
import com.ficticiusclean.ficticiusclean.model.VeiculoModel;

public class VeiculoServiceResponseMapper {

    public static VeiculoModelResponse toResponse(VeiculoModel model){
        VeiculoModelResponse response = new VeiculoModelResponse();
        response.setNome(model.getNome());
        response.setModelo(model.getModelo());
        response.setMarca(model.getMarca());
        response.setDataFabricação(model.getDataFabricação());
        response.setConsumoCombustivelRodovia(model.getConsumoCombustivelRodovia());
        response.setConsumoCombustivelCidade(model.getConsumoCombustivelCidade());
        return response;
    }
}
