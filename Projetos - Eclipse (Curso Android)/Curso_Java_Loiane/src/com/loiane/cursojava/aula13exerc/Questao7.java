package com.loiane.cursojava.aula13exerc;

import java.util.Scanner;

public class Questao7 {
	
	private static Scanner scan;
	private static Double ladoQuadrado;
	private static Double areaQuadrado;
	private static Double dobroArea;

	public static void main(String[] args) {
			
		scan = new Scanner(System.in);
		
		System.out.println("Calcule a �rea do Quadrado! \n \nDigite o valor do lado do quadrado: ");
		ladoQuadrado = scan.nextDouble();
		areaQuadrado = ladoQuadrado * ladoQuadrado;
		dobroArea = areaQuadrado * 2;
		
		System.out.println("A �rea do quadrado que possui o valor " + ladoQuadrado + " em seus lados � " + areaQuadrado + ". O dobro da �rea � " + dobroArea );

		}

}
