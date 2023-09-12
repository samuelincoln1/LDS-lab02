package com.projeto.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.NonTransientDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.sistema.model.Usuario;
import com.projeto.sistema.repositories.UsuarioRep;

@Controller
public class CadastroController {

    @Autowired
    private UsuarioRep rep;

    @GetMapping("/cadastro")
    public String index() {
        return "cadastro/index";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Usuario usuario, Model model) {
        try {
            rep.save(usuario);
            return "redirect:/login";
        } catch (Exception e) {
            System.out.println("Erro!");
            model.addAttribute("erro", "Erro ao realizar cadastro");
            e.printStackTrace();
        }
        return "cadastro/index";
    }

}
