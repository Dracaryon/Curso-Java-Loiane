package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		boolean valida = true;
		int valor = 0;
		int resposta; 
		
		Scanner scan = new Scanner (System.in);
				
		while (valida == true){
			
			System.out.println("Insira um n�mero de 1 � 10");
			valor = scan.nextInt();
			
			if (valor < 0 || valor > 10){
				
				System.out.println("Voc� n�o inseriu um valor entre 0 � 10! Deseja inserir novamente? 1 - Sim  2 - N�o");
				resposta = scan.nextInt();
			
				if (resposta == 2){
					valida = false;
				}
			}
			else {
				valida = false;
			}
		}
		
		System.out.print("O valor inserido foi " + valor);
		
	}
}
