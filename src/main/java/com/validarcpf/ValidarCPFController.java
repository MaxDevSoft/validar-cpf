package com.validarcpf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidarCPFController {
    
    @Autowired
    private ValidarCPF validarCpf;

    @GetMapping("/validar")
    public String validar (@RequestParam String cpf){

        return validarCpf.cpfCalc(cpf);

    }

}
