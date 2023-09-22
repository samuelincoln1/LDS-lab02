    package com.projeto.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.sistema.model.Agente;
import com.projeto.sistema.repositories.AgenteRep;


@Controller
public class CadastroAgenteController {

    @Autowired
    private AgenteRep rep;

    @GetMapping("/cadastroAgente")
    public String index() {
        return "cadastro/cadastroAgente";
    }

    @PostMapping("/cadastrarAgente")
    public String cadastrar(Agente agente, Model model) {
        try {
            rep.save(agente);
            return "redirect:/login";
        } catch (Exception e) {
            System.out.println("Erro!");
            model.addAttribute("erro", "Erro ao realizar cadastro");
            e.printStackTrace();
        }
        return "cadastro/cadastroAgente";
    }

}
