package com.projeto.sistema.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.sistema.model.Usuario;
import com.projeto.sistema.repositories.UsuarioRep;
import com.projeto.sistema.services.CookieService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

@Controller
public class LoginController {
    
    @Autowired
    private UsuarioRep rep;

    @GetMapping("/login")
    public String login() {
        return "login/index";
    }

    @PostMapping("/logar")
    public String logar(Model model, Usuario usuarioParam, String lembrar, HttpServletResponse response) {
        Usuario usuario = this.rep.Login(usuarioParam.getEmail(), usuarioParam.getSenha());
        if (usuario != null) {
            int tempoLogado = 60*60;
            if (lembrar != null) tempoLogado = (60*60*24*365); // se lembrar senha, dura 1 ano
            CookieService.setCookie(response, "id", String.valueOf(usuario.getId()), tempoLogado);
            CookieService.setCookie(response, "emailUsuario", usuario.getEmail(), tempoLogado);
            CookieService.setCookie(response, "nomeUsuario", usuario.getNome(), tempoLogado);
            CookieService.setCookie(response, "sobrenomeUsuario", usuario.getSobrenome(), tempoLogado);
            return "redirect:/servicos";
        }

        model.addAttribute("erro", "Usuário ou senha inválidos");
        
        return "login/index";
    }
}
