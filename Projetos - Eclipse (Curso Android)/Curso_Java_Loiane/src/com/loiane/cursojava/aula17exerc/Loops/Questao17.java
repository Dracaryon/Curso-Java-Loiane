package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		
		int numInserido = 0;
		int resultado = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println (" Insira um n�mero: ");
		numInserido = scan.nextInt();

		resultado = numInserido;
		int countResult = numInserido;

		if (numInserido != 0){

			for ( int i = numInserido; countResult > 1; i--){
				
				countResult--;
				int total = 0;
				resultado =+ resultado * countResult;
				
				System.out.println ("resultado " + resultado);
				//System.out.println ("total " + total);
				System.out.println ("countResult " + countResult + "\n");
			}//fim do for
			
			System.out.println ("O resultado do fatorial do n�mero " + numInserido + " � " + resultado );
			
		} //fim do if     atendente - 9

		else{
			
			System.out.println ("Insira um valor diferente de 0!");
		}


		}//fim do main


	}

