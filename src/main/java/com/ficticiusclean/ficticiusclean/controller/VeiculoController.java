package com.ficticiusclean.ficticiusclean.controller;

import com.ficticiusclean.ficticiusclean.controller.model.response.VeiculoModelRequest;
import com.ficticiusclean.ficticiusclean.controller.model.response.VeiculoModelResponse;
import com.ficticiusclean.ficticiusclean.model.VeiculoModel;
import com.ficticiusclean.ficticiusclean.service.VeiculoService;
import com.ficticiusclean.ficticiusclean.controller.mapper.VeiculoServiceRequestMapper;
import com.ficticiusclean.ficticiusclean.controller.mapper.VeiculoServiceResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @PostMapping("/insert")
    public ResponseEntity<VeiculoModelResponse>  insert(@RequestBody VeiculoModelRequest request){
        VeiculoModel obj = VeiculoServiceRequestMapper.toModel(request);
        VeiculoModel retorno = service.insert(obj);
        VeiculoModelResponse objRetorno = VeiculoServiceResponseMapper.toResponse(retorno);
        return ResponseEntity.ok().body(objRetorno);
    }

    @PostMapping("/calcula")
    public ResponseEntity<List<VeiculoModelResponse>> calcula(@RequestParam BigDecimal preco,
                                                              @RequestParam BigDecimal distanciaCidade,
                                                              @RequestParam BigDecimal distanciaEstrada){
        List<VeiculoModelResponse> retorno = service.somaTotal(preco, distanciaCidade, distanciaEstrada);
        return ResponseEntity.ok().body(retorno);
    }
}
