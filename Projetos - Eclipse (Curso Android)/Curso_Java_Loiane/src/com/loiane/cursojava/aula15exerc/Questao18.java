package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
			
		int numero;
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira um n�mero para verificar se � �mpar ou par!: ");
		numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("O n�mero inserido � par!");
			
		}
		else if (numero % 2 != 0){
				
				System.out.println("O n�mero inserido � �mpar!");
				
		}
		else {
			
			System.out.println("Erro. Tente novamente.");
			
		}
					
	}
}
