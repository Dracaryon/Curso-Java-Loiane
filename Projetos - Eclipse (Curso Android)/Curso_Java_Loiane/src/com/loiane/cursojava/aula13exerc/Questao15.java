package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		int diaDaSemana;
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o n�mero equivalente ao dia de semana de hoje: ");
		diaDaSemana = scan.nextInt();
				
		switch (diaDaSemana) {
		
		case 1 : System.out.println (" Hoje � Segunda-Feira ! "); break;
		case 2 : System.out.println (" Hoje � Ter�a-Feira ! "); break;
		case 3 : System.out.println (" Hoje � Quarta-Feira ! "); break;
		case 4 : System.out.println (" Hoje � Quinta-Feira ! "); break;
		case 5 : System.out.println (" Hoje � Sexta-Feira ! "); break;
		case 6 : System.out.println (" Hoje � Sab�do ! "); break;
		case 7 : System.out.println (" Hoje � Domingo ! "); break;
		default : System.out.println("Digite um n�mero entre 1 e 7 !");
		
		
		}
	}
}
