package com.projeto.sistema.services.authentication;

import org.springframework.web.servlet.HandlerInterceptor;
// import org.springframework.web.servlet.ModelAndView;

import com.projeto.sistema.services.CookieService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor{
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       
        if (CookieService.getCookie(request, "id") != null) {
            return true;
        }
        response.sendError(403, "Acesso negado");
        return false;
        
    }

    

    // @Override
    // public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    //     System.out.println("chamado posthandle");
        
    // }

    // @Override
    // public void afterCompletion (HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {
    //     System.out.println("request e response completado");
    // }
}
