package com.loiane.cursojava.aula34exerc.variav_e_method_static.exerc2;

import java.util.Scanner;

public class TesteCalculadora {

	private static Scanner e;

	public static void main(String[] args) {

		e = new Scanner(System.in);

		double num1;
		double num2;

		System.out.println();

		boolean loop = true;
		int opcao = 0;

		while (loop) {

			System.out.println("\nQual opera��o deseja executar?");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Potencia��o");
			System.out.println("6 - Fatorial");
			System.out.println("7 - Sair");

			opcao = e.nextInt();
			
			if(opcao < 6) {
			
				System.out.println("Quais os dois n�meros?");
				num1 = e.nextDouble();
				num2 = e.nextDouble();
	
				if (opcao == 1) {
					System.out.println("Soma: " + Calculadora.somar(num1, num2));
				} 
				else if (opcao == 2) {
					System.out.println("Subtra��o: " + Calculadora.subtrair(num1, num2));
				} 
				else if (opcao == 3) {
					System.out.println("Multiplica��o: " + Calculadora.multiplicar(num1, num2));
				}
				else if (opcao == 4) {
					System.out.println("Divis�o: " + Calculadora.dividir(num1, num2));
				} 
				else if (opcao == 5) {
					System.out.println("Potencia��o: " + Calculadora.pontencia(num1, num2));
				} 
				
			} //QUEST�O 3 - ADICIONAR FATORIAL:
			else if (opcao == 6) { 
				
				System.out.println("Qual o n�mero do fatorial?");
				num1 = e.nextDouble();
				
				System.out.println("Fatorial: ");
				System.out.println(Calculadora.fatorial(num1));
			} 
			else {
				loop = false;
				System.out.println("Espero que tenha se divertido! Queremos te ver de novo em breve!");
			}
		}
	}
}
