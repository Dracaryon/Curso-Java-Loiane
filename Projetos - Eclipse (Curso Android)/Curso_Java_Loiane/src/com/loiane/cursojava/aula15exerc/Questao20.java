	package com.loiane.cursojava.aula15exerc;

	import java.util.Scanner;

	public class Questao20 {

		public static void main(String[] args) {
				
			int resposta;
			int resultado = 0;

			Scanner scan = new Scanner(System.in);

			System.out.println ("*--|-|--*   Voc� � Culpado? Descubra com essas 5 perguntas!   *--|-|--*");

			System.out.println ("Voc� telefonou para a v�tima? \n 1 - Sim    2 - N�o");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Voc� esteve no local do crime? \n 1 - Sim    2 - N�o");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Voc� mora perto da v�tima? \n 1 - Sim    2 - N�o");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Voc� devia para a v�tima? \n 1 - Sim    2 - N�o");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			System.out.println ("Voc� j� trabalhou com a v�tima? \n 1 - Sim    2 - N�o");
			resposta = scan.nextInt();

			if (resposta == 1){
				
				resultado++;

			}

			// Verifica��o final - Levantamento dos pontos ------------------------------

			if (resultado == 2) {

				System.out.println ("Voc� � um suspeito do crime!");

			}
			else if (resultado == 3 ||resultado == 4){
				
				System.out.println ("Voc� foi considerado um c�mplice do crime!");

			}
			else if (resultado == 5){
				
				System.out.println ("Pelas suas respostas voc� foi considerado culpado! :o Por favor, permane�a onde est�; a pol�cia chegar� em 5 minutos.");

			}

			else if (resultado < 2){
				
				System.out.println ("Voc� foi considerado inocente! (Por enquanto :})");

			}
			else {
				
				System.out.println ("Erro desconhecido. Voc� escapou desta vez...Efetue o teste novamente.");

			}
		}
	}
	

	


