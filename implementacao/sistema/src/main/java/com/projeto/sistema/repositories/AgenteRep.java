package com.projeto.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.sistema.model.Agente;

public interface AgenteRep extends JpaRepository<Agente, Integer>{
        Agente findByEmail(String email);

    @Query(value="SELECT * FROM agente WHERE email = :email AND senha = :senha", nativeQuery = true)
    public Agente Login(String email, String senha);

}
