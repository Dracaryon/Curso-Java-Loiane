package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao8 {

	//private static Scanner scan;
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Calcule o seu sal�rio no m�s atual! \n  Quanto voc� ganha por hora?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Qual o n�mero de horas trabalhadas durante o m�s?");
		double horasMes = scan.nextDouble();

		double totalSalario = (salarioHora * horasMes) * 30;
		
		System.out.println("O seu sal�rio mensal � de R$" + totalSalario);
	}

}
