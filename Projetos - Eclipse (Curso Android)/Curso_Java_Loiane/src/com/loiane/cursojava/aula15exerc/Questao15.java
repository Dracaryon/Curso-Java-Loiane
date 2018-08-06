package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		int lado1;
		int lado2;
		int lado3;
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o primeiro lado do tri�ngulo: ");
		lado1 = scan.nextInt();
		System.out.print("Digite o segundo lado do tri�ngulo: ");
		lado2 = scan.nextInt();
		System.out.print("Digite o terceiro lado do tri�ngulo: ");
		lado3 = scan.nextInt();
		
		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1){
			
			System.out.println ("Agora vamos verificar qual o tipo do tri�ngulo...");
			
			if (lado1 == lado2 && lado1 == lado3){
				
				System.out.println ("Voc� inseriu um tri�ngulo Equil�tero!!! Seu tri�ngulo possui os 3 lados iguais.");
				
			}
			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
				
				System.out.println ("Voc� inseriu um tri�ngulo Is�sceles!!! Seu tri�ngulo possui 2 lados iguais.");
				
			}
			else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
				
				System.out.println ("Voc� inseriu um tri�ngulo Escaleno!!! Seu tri�ngulo possui os 3 lados diferentes.");
				
			}
		}		
		else {
			
			System.out.println("Voc� n�o inseriu um tri�ngulo! O tri�ngulo existe quando  a  soma  de  quaisquer dois lados for maior que o terceiro.");
			
		}
		
		
		}
	}

