package com.projeto.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.sistema.model.PedidoAluguel;
import com.projeto.sistema.repositories.PedidoAluguelRep;

@RestController
public class PedidoAluguelController {
    @Autowired
    public PedidoAluguelRep pedidoAluguelRepository;

    @GetMapping("/listar-pedidos")
    public PedidoAluguel[] ListarPedidosAluguel(@RequestParam int idCliente){
        PedidoAluguel[] pedidos = pedidoAluguelRepository.BuscarPorIdCliente(idCliente);
        return pedidos;
    }
}
