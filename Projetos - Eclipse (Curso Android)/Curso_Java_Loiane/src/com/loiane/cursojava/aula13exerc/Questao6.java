package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao6 {

	private static Scanner scan;
	private static Double raioCirculo;
	private static Double areaCirculo;
	
	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		System.out.print("Calcule a �rea do c�rculo! \n Digite o raio do c�rculo:");
		raioCirculo = scan.nextDouble();
		
		areaCirculo = (raioCirculo * raioCirculo) * 3.14;
		System.out.println("A �rea do circulo que possui um raio " + raioCirculo + " ser� de " + areaCirculo);
		
		
		

	}

}
