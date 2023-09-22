package com.projeto.sistema.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.sistema.model.Cliente;
import com.projeto.sistema.model.Agente;
import com.projeto.sistema.repositories.ClienteRep;
import com.projeto.sistema.repositories.AgenteRep;

import com.projeto.sistema.services.CookieService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

@Controller
public class LoginController {
    
    @Autowired
    private ClienteRep repC;

    @Autowired
    private AgenteRep repA;

    @GetMapping("/login")
    public String login() {
        return "login/index";
    }

    @PostMapping("/logar")
    public String logar(Model model, Cliente clienteparam, Agente agenteparam, String lembrar, HttpServletResponse response) {
        Cliente cliente = this.repC.Login(clienteparam.getEmail() , clienteparam.getSenha());
        Agente agente = this.repA.Login(agenteparam.getEmail(), agenteparam.getSenha());
        
        if (cliente != null || agente != null) {
            int tempoLogado = 60 * 60;
            if (lembrar != null) tempoLogado = (60 * 60 * 24 * 365);
            
            if (cliente != null) {
                CookieService.setCookie(response, "id", String.valueOf(cliente.getId()), tempoLogado);
                CookieService.setCookie(response, "emailUsuario", cliente.getEmail(), tempoLogado);
                CookieService.setCookie(response, "nomeUsuario", cliente.getNome(), tempoLogado);

                
            } else if (agente != null) {
                CookieService.setCookie(response, "id", String.valueOf(agente.getId()), tempoLogado);
                CookieService.setCookie(response, "emailUsuario", agente.getEmail(), tempoLogado);
                CookieService.setCookie(response, "nomeUsuario", agente.getNome(), tempoLogado);
            }
    
            return "redirect:/servicos";
        }

        model.addAttribute("erro", "Usuário ou senha inválidos");
        
        return "login/index";
    }
}
