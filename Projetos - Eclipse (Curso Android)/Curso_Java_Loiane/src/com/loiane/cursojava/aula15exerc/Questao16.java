package com.loiane.cursojava.aula15exerc;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		
		float a;
		float b;
		float c;	
		float delta;
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Calcule uma equa��o de 2� grau! \nDigite o primeiro valor: ");
		a = scan.nextFloat();
		
		if (a==0){
			
			System.out.println ("Essa equa��o n�o � de segundo grau! o A n�o pode ser igual a 0. O programa ser� encerrado."); 
			
		}
		else {
		System.out.print("Digite o segundo valor: ");
		b = scan.nextFloat();
		System.out.print("Digite o terceiro valor: ");
		c = scan.nextFloat();
		
		delta =  (float) ((b * b) - (4 * a * c));  // ((-b + Math.sqrt( b*b - 4 * a * c )) / 2 *a);		
		
			System.out.println ("Delta = " + delta);
		
			if (delta < 0){
				
				System.out.print("A equa��o n�o possui ra�zes reais.");
				
			}
			else if (delta == 0){
				
				float resultadoUmaRaiz = (float) (((b * (-1)) - Math.sqrt(delta)) / (2 * a));
				System.out.println(" Seu sistema possui apenas uma raiz. Raiz: " + resultadoUmaRaiz);				
				
			}
			else if (delta > 0){
			
			System.out.println ("1� raiz = " + ((b * (-1)) / (2 * a)) + " - " + (Math.sqrt(delta * (-1)) / (2 * a)) + "i");
			//Eu estava fazendo o seguinte
			System.out.println ("1� raiz = " + ((b * (-1)) / (2 * a)) + "-" + (Math.sqrt(delta * (-1)) / (2 * a)) + "i");
		
			}
		}
	}
}
