package com.loiane.cursojava.aula35exerc.MetodosRecursivos.exerc2;

public class SomatorioTest {

	public static void main(String[] args) {
		
		for (int i = 0;i < 20;i++) {
			System.out.println(i + " = " + Somatorio.calcularSomatorio(i));
		}
	}
}