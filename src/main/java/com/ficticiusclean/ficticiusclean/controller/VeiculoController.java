package com.ficticiusclean.ficticiusclean.controller;

import com.ficticiusclean.ficticiusclean.controller.mapper.VeiculoServiceRequestMapper;
import com.ficticiusclean.ficticiusclean.controller.mapper.VeiculoServiceResponseMapper;
import com.ficticiusclean.ficticiusclean.controller.model.response.VeiculoModelRequest;
import com.ficticiusclean.ficticiusclean.controller.model.response.VeiculoModelResponse;
import com.ficticiusclean.ficticiusclean.model.VeiculoModel;
import com.ficticiusclean.ficticiusclean.service.VeiculoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @ApiOperation("Cadastro de veículos para armazenar os veículos utilizados pela empresa")
    @PostMapping("/insert")
    public ResponseEntity<VeiculoModelResponse>  insert(@RequestBody VeiculoModelRequest request){
        VeiculoModel obj = VeiculoServiceRequestMapper.toModel(request);
        VeiculoModel retorno = service.insert(obj);
        VeiculoModelResponse objRetorno = VeiculoServiceResponseMapper.toResponse(retorno);
        return ResponseEntity.ok().body(objRetorno);
    }

    @ApiOperation("Realiza o cálculo de previsão de gastos")
    @PostMapping("/calcula")
    public ResponseEntity<List<VeiculoModelResponse>> calcula(@RequestParam Double preco,
                                                              @RequestParam Double distanciaCidade,
                                                              @RequestParam Double distanciaEstrada){
        List<VeiculoModelResponse> retorno = service.somaTotal(preco, distanciaCidade, distanciaEstrada);
        return ResponseEntity.ok().body(retorno);
    }
}
