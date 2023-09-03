package com.validarcpf;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidarCPF {
    
    
    String cpfCalc (String cpf){
	    
        if (cpf.length() != 11) {
           return "CPF faltando número.";
       }
           
           String n1 = String.valueOf(cpf.charAt(0));
           String n2 = String.valueOf(cpf.charAt(1));
           String n3 = String.valueOf(cpf.charAt(2));
           String n4 = String.valueOf(cpf.charAt(3));
           String n5 = String.valueOf(cpf.charAt(4));
           String n6 = String.valueOf(cpf.charAt(5));
           String n7 = String.valueOf(cpf.charAt(6));
           String n8 = String.valueOf(cpf.charAt(7));
           String n9 = String.valueOf(cpf.charAt(8));
           String n10 = String.valueOf(cpf.charAt(9));
           String n11 = String.valueOf(cpf.charAt(10));
          
           int cpf1 = Integer.parseInt(n1);
           int cpf2 = Integer.parseInt(n2);
           int cpf3 = Integer.parseInt(n3);
           int cpf4 = Integer.parseInt(n4);
           int cpf5 = Integer.parseInt(n5);
           int cpf6 = Integer.parseInt(n6);
           int cpf7 = Integer.parseInt(n7);
           int cpf8 = Integer.parseInt(n8);
           int cpf9 = Integer.parseInt(n9);
           int cpf10 = Integer.parseInt(n10);
           int cpf11 = Integer.parseInt(n11);
       
           int mult1 = cpf1 * 10, mult12 = cpf1 * 11;
           int mult2 = cpf2 * 9, mult13 = cpf2 * 10;
           int mult3 = cpf3 * 8, mult14 = cpf3 * 9;
           int mult4 = cpf4 * 7, mult15 = cpf4 * 8;
           int mult5 = cpf5 * 6, mult16 = cpf5 * 7;
           int mult6 = cpf6 * 5, mult17 = cpf6 * 6;
           int mult7 = cpf7 * 4, mult18 = cpf7 * 5;
           int mult8 = cpf8 * 3, mult19 = cpf8 * 4;
           int mult9 = cpf9 * 2, mult20 = cpf9 * 3;
           int mult21 = cpf10 * 2;
       
           int mult101 = cpf10;
           int mult11 = cpf11;
           
           int calculo9 = mult1+mult2+mult3+mult4+mult5+mult6+mult7+mult8+mult9;
           int calculo10 = mult12+mult13+mult14+mult15+mult16+mult17+mult18+mult19+mult20+mult21;
           
           int c9 = calculo9 % 11;
           int c10 = calculo10 % 11;
           int validar1 = 11 - c9;
           int validar2 = 11 - c10;
           
           if(validar1 == mult101 & validar2 == mult11){
               
              return "CPF "+cpf+" é válido!";
           }else{
               
               return "CPF inválido!";
           }

   }
}
