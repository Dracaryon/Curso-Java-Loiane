package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao9{
		

	public static void main(String[] args) {
			
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Verifique 3 n�meros em ordem decrescente! Insira os tr�s n�meros: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
				
		if (numero1 > numero2 && numero1 > numero3){
					
			if (numero2 > numero3){
				
				System.out.print( "Em ordem decrescente: " + numero1 + ", " + numero2 + ", " + numero3); 
				
			}
			else if (numero2 < numero3){
				
				System.out.print( "Em ordem decrescente: " + numero1 + ", " + numero3 + ", " + numero2); 
				
			}
			else {
				
				System.out.print( "O segundo e terceiro n�mero t�m o mesmo valor (" + numero2 + "). Em ordem decrescente: " + numero1 + ", " + numero3 + " e/ou " + numero2);
				
			}
		}
		else if (numero2 > numero1 && numero2 > numero3){
						
			if (numero1 > numero3){
					
				System.out.print( "Em ordem decrescente: " + numero2 + ", " + numero1 + ", " + numero3); 
				
			}
			else if (numero1 < numero3){
				
				System.out.print( "Em ordem decrescente: " + numero2 + ", " + numero3 + ", " + numero1); 
				
			}
			else { //caso numero 1 e 3 sejam iguais
				
				System.out.print( "O primeiro e o terceiro n�mero t�m o mesmo valor (" + numero1 + "). Em ordem decrescente: " + numero2 + ", " + numero1 + " e/ou " + numero3);
				
			}
			
		}
		else if (numero3 > numero2 && numero3 > numero1){
						
			if (numero1 > numero2){
				
				System.out.print( "Em ordem decrescente: " + numero3 + ", " + numero1 + ", " + numero2); 
				
			}
			else if (numero1 < numero2){
				
				System.out.print( "Em ordem decrescente: " + numero3 + ", " + numero2 + ", " + numero1); 
				
			}
			else {
				
				System.out.print( "O primeiro e o segundo n�mero t�m o mesmo valor (" + numero1 + "). Em ordem decrescente: " + numero3 + ", " + numero1 + " e/ou " + numero2);
				
			}
		}
		else if ( numero1 == numero2 || numero1 == numero3 || numero2==numero3 ){
			
			//repetir os ifs com mensagens espec�ficas?
			
		}
		else {
			
			System.out.println("Os 3 valores s�o iguais! Insira valores diferentes!");
			 
		}
			
	
		

	}

}
