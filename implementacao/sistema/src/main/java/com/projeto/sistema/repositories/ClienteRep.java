package com.projeto.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.sistema.model.Cliente;

public interface ClienteRep extends JpaRepository<Cliente, Integer>{
        Cliente findByEmail(String email);

    @Query(value="SELECT * FROM cliente WHERE email = :email AND senha = :senha", nativeQuery = true)
    public Cliente Login(String email, String senha);

}
