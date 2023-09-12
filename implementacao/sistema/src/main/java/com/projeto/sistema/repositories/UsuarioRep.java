package com.projeto.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.sistema.model.Usuario;


public interface UsuarioRep extends JpaRepository<Usuario, Integer>{
    Usuario findByEmail(String email);

    @Query(value="SELECT * FROM usuario WHERE email = :email AND senha = :senha", nativeQuery = true)
    public Usuario Login(String email, String senha);
}
