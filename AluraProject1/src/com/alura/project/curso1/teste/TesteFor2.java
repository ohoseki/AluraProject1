package com.alura.project.curso1.teste;

public class TesteFor2 {

    public static void main(String[] args){

        for (int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }

}
}