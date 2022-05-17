package com.ficticiusclean.ficticiusclean.controller.mapper;

import com.ficticiusclean.ficticiusclean.controller.model.response.VeiculoModelRequest;
import com.ficticiusclean.ficticiusclean.model.VeiculoModel;

public class VeiculoServiceRequestMapper {

    public static VeiculoModel toModel(VeiculoModelRequest request){
        VeiculoModel model = new VeiculoModel();
        model.setNome(request.getNome());
        model.setModelo(request.getModelo());
        model.setMarca(request.getMarca());
        model.setDataFabricação(request.getDataFabricação());
        model.setConsumoCombustivelCidade(request.getConsumoCombustivelCidade());
        model.setConsumoCombustivelRodovia(request.getConsumoCombustivelRodovia());
        return model;
    }
}
