package com.projeto.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.sistema.model.ContratoAluguel;

public interface ContratoAluguelRep extends JpaRepository<ContratoAluguel, Integer>{
    @Query(value= "SELECT * FROM contrato_aluguel WHERE cliente_id = :idCliente", nativeQuery = true)
    public ContratoAluguel[] BuscarPorIdUsuario(int idCliente);
}
