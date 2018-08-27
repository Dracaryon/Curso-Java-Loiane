package com.loiane.cursojava.aula34exerc.variav_e_method_static.exerc2;

public class Calculadora {
	
	static double soma;
	static double subtracao;
	static double multiplicacao;
	static double divisao;
	static double potenciacao;
	static double fatorial;
	
	
	static double somar(double num1, double num2) {
		soma = num1 + num2;
		return soma;
	}
	
	static double subtrair(double num1, double num2) {
		subtracao = num1 - num2;
		return subtracao;
	}
	
	static double multiplicar(double num1, double num2) {
		multiplicacao = num1 * num2;
		return multiplicacao;
	}
	
	static double dividir(double num1, double num2) {
		divisao = num1 / num2;
		return divisao;
	}
	
	static double pontencia(double num1, double num2) {
		potenciacao = Math.pow(num1, num2);
		return potenciacao;
	}
	
	//QUEST�O 3 - ADICIONAR FATORIAL:
	
	static double fatorial(double num1) {
		
		if (num1 == 0) {
			System.out.print(" = ");
			return 1;
		}
		System.out.print(" * " + num1);
		return(num1 * fatorial(num1-1));
	}
}
