package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
			
		float numero1;
		float numero2;
		String nomeOperacao = "";
		String posOrNeg = "positivo";
		float resultado = 0;
		int operacao;
		int resulParOrImpar = 0;
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insira dois n�meros: ");
		numero1 = scan.nextFloat();
		numero2 = scan.nextFloat();
		
		System.out.println("Escolha uma opera��o: \n" 
				+ " 1 - Multiplica��o \n"
				+ " 2 - Subtra��o \n"
				+ " 3 - Soma \n"
				+ " 4 - Divis�o \n");
		
		operacao = scan.nextInt();
		
				
		if (operacao == 1){
			
			nomeOperacao = "Multiplica��o";
			resultado = numero1 * numero2;
			
		}
		else if (operacao == 2){
			
			nomeOperacao = "Subtra��o";
			resultado = numero1 - numero2;
			
		}else if (operacao == 3){
			
			nomeOperacao = "Soma";
			resultado = numero1 + numero2;
			
		}if (operacao == 4){
			
			nomeOperacao = "Divis�o";
			resultado = numero1 / numero2;
			
		}
		
		if (resultado % 2 == 0) {
			
			resulParOrImpar = 0;
			
		}
		else if (resultado % 2 != 0){
				
			resulParOrImpar = 1;
				
		}
		
		else {
			
			resulParOrImpar = 3;
			
		}
		
		if (resultado < 0){
			
			posOrNeg = "negativo";
			
		}
		
		switch (resulParOrImpar){
			case 0 : System.out.println("O resultado da " + nomeOperacao + " do n�mero " + numero1 + " e do n�mero " + numero2 + " � " + resultado + ". Este resultado � par e " + posOrNeg + "!"); break;  
			case 1 : System.out.println("O resultado da " + nomeOperacao + " do n�mero " + numero1 + " e do n�mero " + numero2 + " � " + resultado + ". Este resultado � �mpar e " + posOrNeg + "!"); break;
			
			default : System.out.println("Erro. Tente novamente.");
			
		}
		
			
		}
}
