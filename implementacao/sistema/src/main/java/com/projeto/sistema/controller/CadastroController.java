package com.projeto.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.projeto.sistema.model.Cliente;
import com.projeto.sistema.repositories.ClienteRep;

@Controller
public class CadastroController {

    @Autowired
    private ClienteRep rep;

    @GetMapping("/cadastroCliente")
    public String index() {
        return "cadastro/cadastroCliente";
    }

    @PostMapping("/cadastrarCliente")
    public String cadastrar(Cliente cliente, Model model) {
        try {
            rep.save(cliente);
            return "redirect:/login";
        } catch (Exception e) {
            System.out.println("Erro!");
            model.addAttribute("erro", "Erro ao realizar cadastro");
            e.printStackTrace();
        }
        return "cadastro/cadastroCliente";
    }

}
