package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao5 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Digite o n�mero em metros que dever� ser convertido em cent�metros: ");
		double numero = Double.parseDouble(scan.nextLine());;
		double resultado =  numero * 100;
		
		
		System.out.println("O n�mero digitado em cent�metros �: " + resultado);
		
		

	}

}
