package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao7{
	
	

	public static void main(String[] args) {
		
		int media;
				
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira tr�s n�meros!");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
				
		if (numero1 > numero2 && numero1 > numero3){
			
			System.out.print( "O n�mero " + numero1 + " � maior que o n�mero "  + numero2 + " e o n�mero " + numero3 + "! " ); 
			
			if (numero2 > numero3){
				
				System.out.print( "O n�mero " + numero3 + " � o menor entre eles." ); 
				
			}
			else if (numero2 < numero3){
				
				System.out.print( "O n�mero " + numero2 + " � o menor entre eles." ); 
				
			}
			else {
				
				System.out.print( "O n�mero " + numero2 + " e o n�mero " + numero3 + " s�o iguais! " );
				
			}
		}
		else if (numero2 > numero1 && numero2 > numero3){
			
			System.out.print( "O n�mero " + numero2 + " � maior que o n�mero "  + numero1 + " e o n�mero " + numero3 + "! " ); 
			
			if (numero1 > numero3){
					
				System.out.print( "O n�mero " + numero3 + " � o menor entre eles." ); 
					
			}
			else if (numero1 < numero3){
				
				System.out.print( "O n�mero " + numero1 + " � o menor entre eles." ); 
	
			}
			else {
				
				System.out.print( "O n�mero " + numero1 + " e o n�mero " + numero3 + " s�o iguais! " );
				
			}
			
		}
		else if (numero3 > numero2 && numero3 > numero1){
			
			System.out.print( "O n�mero " + numero3 + " � maior que o n�mero "  + numero1 + " e o n�mero " + numero2 + "! "); 
			
			if (numero1 > numero2){
				
				System.out.print( "O n�mero " + numero2 + " � o menor entre eles." ); 
				
			}
			else if (numero1 < numero2){
				
				System.out.print( "O n�mero " + numero1 + " � o menor entre eles." ); 
				
			}
			else {
				
				System.out.print( "O n�mero " + numero1 + " e o n�mero " + numero2 + " s�o iguais! " );
				
			}
		}
		else {
			
			System.out.println("Os 3 n�meros s�o iguais! Insira n�meros diferentes!");
		}
			
	
		

	}

}
