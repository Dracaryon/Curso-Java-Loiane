package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		
		int  numero1;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um valor");
		numero1 = scan.nextInt();
				
		if ( 0 > numero1 ){
			
			System.out.println( numero1 + " � negativo" );
		
		}else if (0 < numero1 ){
			
			System.out.println( numero1 + "� positivo" );
			
		}else {
			
			System.out.println( numero1 + " � igual a 0" );
			
		}
	}
}