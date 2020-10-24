package br.edu.usj.ads.lii.hellonameemailthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloNameEmail {
    
    @GetMapping(value="olaPessoa")
    public ModelAndView postHelloNameEmail(@RequestParam String nome, @RequestParam String email) {
        
        ModelAndView modelAndView = new ModelAndView("name-email");

        modelAndView.addObject("nome", nome);
        modelAndView.addObject("email", email);
        
        return modelAndView;
    }
    
}
