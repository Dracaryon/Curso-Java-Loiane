package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q11 {

	private static Scanner scan;


	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		
		int resposta = 0;
		String nome = "";
		
		int casa [] = new int [10];

		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			
			System.out.println((i + 1) + " -> " + casa[i]);
		}
		
		System.out.println(" Voc� deseja ver os n�meros armazenados no vetor que s�o pares ou �mpar?? 1 - Par /  2 - �mpar");
		resposta = scan.nextInt();
				
		switch (resposta){
		
		case 1 :
			nome = "pares";
			break;
		case 2 :
			nome = "�mpares";
			break;
		}
			System.out.println("O vetor possui " + casa.length + " espa�os. Os n�meros " + nome + " s�o: ");
			
			if (resposta == 1){
				for (int i=0; i < casa.length; i++){
					
					if (casa[i] % 2 == 0){
	
						System.out.println((i + 1) + " -> " + casa[i]);
					}
				}
			}
			else if (resposta == 2){
				
				for (int i=0; i < casa.length; i++){
					
					if (casa[i] % 2 == 1){
	
						System.out.println((i + 1) + " -> " + casa[i]);
					}
				}
			}
		
		/*for (double cas : casa){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
		}*/
	}
}
