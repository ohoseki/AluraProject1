package com.alura.project.curso1.teste;

public class TestaConversao{

    public static void main(String[] args){

        double salario = 1270.50;
        int valor = (int) salario; // casting
        
        System.out.println(valor);
            
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);    

        float pontoFlutuante = 3.14f;   // aqui! -- ponto flutuante

        double salarioTeste2 = 1270.50;
        int valorTeste2 = (int) salarioTeste2;
        System.out.println(valorTeste2);

        double valor1Teste2 = 0.2;
        double valor2Teste2 = 0.1;
        double totalTeste2 = valor1 + valor2;

        System.out.println(totalTeste2);        
        
        
        
        
    }
}