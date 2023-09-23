package com.projeto.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.sistema.model.PedidoAluguel;

public interface PedidoAluguelRep extends JpaRepository<PedidoAluguel, Integer>{
    @Query(value= "SELECT * FROM pedido_aluguel WHERE cliente_id = :idCliente", nativeQuery = true)
    public PedidoAluguel[] BuscarPorIdCliente(int idCliente);
}
