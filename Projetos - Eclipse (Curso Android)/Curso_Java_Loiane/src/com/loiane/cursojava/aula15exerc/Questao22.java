	package com.loiane.cursojava.aula15exerc;

	import java.util.Scanner;

	public class Questao22 {

		public static void main(String[] args) {
				
			int quantidadeKGMorango = 0;
			int quantidadeKGMaca = 0;
			double precoMorangoKG = 0;
			double precoMacaoKG = 0;
			double precoMorango = 0; 
			double precoMaca = 0; 
			double precoCDesconto = 0; 
			double quantidadeTotal = 0;
			double precoTotal = 0;
			int desconto = 10;
			int quantidadeKGDescontoInfo = 8;
			int quantidadePrecoDescontoInfo = 25;
			
			

			
			Scanner scan = new Scanner(System.in);

			System.out.println ("*--|-|--*   Bem vindo(a) a loja de frutas! Quantos KG de Morango voc� deseja?   *--|-|--*\n");
			quantidadeKGMorango = scan.nextInt();
			
			
			System.out.println ("*--|-|--*   E quantos KG de Ma�� voc� deseja?   *--|-|--*\n");
			quantidadeKGMaca = scan.nextInt();
			
			

			if (quantidadeKGMorango < 5){
				
				precoMorangoKG = 2.50;
				precoMorango = precoMorangoKG * quantidadeKGMorango;
				
			}
			else if	(quantidadeKGMorango >= 5){
				
				precoMorangoKG = 2.20;
				precoMorango = precoMorangoKG * quantidadeKGMorango;
				
			}
			
			if (quantidadeKGMaca < 5){
				
				precoMacaoKG = 1.80;
				precoMaca = precoMacaoKG * quantidadeKGMaca;
				
			}
			else if	(quantidadeKGMaca >= 5){
				
				precoMacaoKG = 1.50;
				precoMaca = precoMacaoKG * quantidadeKGMaca;
				
			}
			
			quantidadeTotal = quantidadeKGMorango + quantidadeKGMaca;
			precoTotal = precoMorango + precoMaca;
			
			
			if (quantidadeTotal > 8 || precoTotal > 25){
				
				
				precoCDesconto = precoTotal - ((precoTotal * desconto) / 100);
				
				System.out.println ("*--|-|--*   Voc� comprou " + quantidadeKGMorango + "KG de Morango(s), por um valor total de R$" + precoMorango + " e voc� comprou " + quantidadeKGMaca + "KG de Ma��(s), por um valor total de R$" + precoMaca + " *--|-|--*\n"
						+ "*--|-|--*   Por voc� ter comprado mais de que R$" + quantidadeKGDescontoInfo + " ou uma quantidade superior a " + quantidadePrecoDescontoInfo + "Kg voc� obteve um desconto de " + desconto + "%!!!  *--|-|--*\n"
						+ "*--|-|--*   O valor total com o desconto � de R$" + precoCDesconto + "!   *--|-|--*\n"
						+ "*--|-|--*   e o valor Total sem o desconto seria de R$" + precoTotal + "! Obrigado pela prefer�ncia.   *--|-|--*"
								+ "\n\n *--|-|--*   SUPERMERCADO H.MARKET   *--|-|--* ");
			
				
			}
			else{
				
				System.out.println ("*--|-|--*   Voc� comprou " + quantidadeKGMorango + "KG de Morango(s), por um valor total de R$" + precoMorango + " e voc� comprou " + quantidadeKGMaca + "KG de Ma��(s), por um valor total de R$" + precoMaca + " *--|-|--*\n"
						+ "\n O valor Total � de R$" + precoTotal + "! Obrigado pela prefer�ncia."
								+ "\n\n *--|-|--*  SUPERMERCADOS H.MARKET  *--|-|--* ");
				
			}
		}	
	}		