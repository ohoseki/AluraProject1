package com.alura.project.curso1.teste;

public class TestaFatorial {

	public static void main (String[] args) {
	
		for (int i=1;i <= 10; i++ ) {
			
			int fat = 1;
			
			for (int z=1; z<=i; z++) {
				
				fat = fat *z ;
				
			}
			
			System.out.println ("o Fasorial de "+ i + " é " +  fat);		
		}
	
	}
	
}
