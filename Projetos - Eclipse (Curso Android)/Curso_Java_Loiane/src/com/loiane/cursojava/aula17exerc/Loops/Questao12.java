package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao12 {
	
	public static void main(String[] args) {
		
		int numero = 10;
		int numeroInserido = 0;
		int soma = 0;
		int media = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o n�mero que voc� deseja ver a tabuada e calcularemos para voc�: ");
		numeroInserido = scan.nextInt();
		
		while (numeroInserido > 10 || numeroInserido < 0){
			
			System.out.println("N�mero inv�lido! Digite um n�mero de 1 � 10.");
			numeroInserido = scan.nextInt();
		}
		
	 	for ( int count = 0; count <= numero ; count++){
				
				System.out.println(numeroInserido + " x " + count + " = " + numeroInserido * count);			
		}
	}
}
