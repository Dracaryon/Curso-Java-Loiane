package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao5 {
	
	public static void main(String[] args) {
		
		int populacaoA = 80000;
		int populacaoB = 200000;
		double taxaPaisA = 3;
		double taxaPaisB = 1.5;
		int anos = 0;
		
		
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("Insira a popula��o do pa�s A: ");
		populacaoA = scan.nextInt();
		System.out.print("Qual a taxa de crescismento anual do pa�s A? ");
		taxaPaisA = scan.nextInt();
		System.out.print("Insira a popula��o do pa�s B: ");
		populacaoB = scan.nextInt();
		System.out.print("Qual a taxa de crescismento anual do pa�s B? ");
		taxaPaisB = scan.nextInt();
		
		
		for ( ; populacaoA < populacaoB ; anos++){
			
			populacaoA = (int) (populacaoA + ((populacaoA * taxaPaisA) /100));
			populacaoB = (int) (populacaoB + ((populacaoB * taxaPaisB) /100));
		}
		
		
		System.out.println("Levaram " + anos + " anos para a cidade A ultrapassar ou igualar a B\n"
				+ "Popula��o de A: " + populacaoA + "\n"
				+ "Popula��o de B " + populacaoB + "\n"
				);
		
		
	}
}
