	package com.loiane.cursojava.aula15exerc;

	import java.util.Scanner;

	public class Questao23 {

		public static void main(String[] args) {
			
			String nomeCarne = ""; 
			int tipoCarne = 0;
			double quantidadeKG = 0;
			int usoCartao = 0;
			double precoCarne = 0;
			double precoTotalCarne = 0;
			double descontoCartao = 5;
			double totalComDesconto = 0;
						
			
			
			Scanner scan = new Scanner(System.in);

			System.out.println ("*--|-|--*   Bem vindo(a) a loja de carnes! Qual carne voc� deseja? \n          1 - Fil� Duplo /// 2 - Alcatra /// 3 - Picanha   *--|-|--*\n");
			tipoCarne = scan.nextInt();
			
			
			System.out.println ("*--|-|--*   E quantos KG voc� deseja?   *--|-|--*\n");
			quantidadeKG = scan.nextInt();
			
			System.out.println ("*--|-|--*   Comprando com o cart�o H.MARKET voc� ganha um desconto de R$" + descontoCartao + "! Deseja utilizar o cart�o? \n          1 - Sim ||| 2 - N�o   *--|-|--*\n");
			usoCartao = scan.nextInt();
			
			if (tipoCarne == 1){
				
				nomeCarne = "Fil� Duplo";
				
				if (quantidadeKG <= 5){
					
					precoCarne = 4.90;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				else if	(quantidadeKG > 5){
					
					precoCarne = 5.80;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				
			}
			else if (tipoCarne == 2){
				
				nomeCarne = "Alcatra";
				
				if (quantidadeKG <= 5){
					
					precoCarne = 5.90;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				else if	(quantidadeKG > 5){
					
					precoCarne = 6.80;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				
			}
			else if (tipoCarne == 3){
				
				nomeCarne = "Picanha";
				
				if (quantidadeKG <= 5){
					
					precoCarne = 6.90;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				else if	(quantidadeKG > 5){
					
					precoCarne = 7.80;
					precoTotalCarne = precoCarne * quantidadeKG;
					
				}
				
			}
			if (usoCartao == 1){
				
				totalComDesconto = precoTotalCarne - ((precoTotalCarne * descontoCartao) / 100);
				
				System.out.println ("*--|-|--*   Voc� comprou " + quantidadeKG + "KG de " + nomeCarne + ", por um valor total de R$" + precoTotalCarne + "! *--|-|--*\n"
						+ "*--|-|--*   Por voc� ter comprado com o cart�o H.MARKET voc� ter� um desconto de " + descontoCartao + "% no valor total. Com isso, voc� pagar� apenas R$" + totalComDesconto + " !!!  *--|-|--*\n"
								+ "\n\n *--|-|--*   SUPERMERCADO H.MARKET. AGRADECEMOS SUA PREFER�NCIA.   *--|-|--* ");
				
			}
			else{
				
				System.out.println ("*--|-|--*   Voc� comprou " + quantidadeKG + "KG de " + nomeCarne + ", por um valor total de R$" + precoTotalCarne + "! *--|-|--*\n"
						+ "*--|-|--*   Por voc� ter comprado a vista, infelizmente vo� n�o ter� o desconto adicional no valor de " + descontoCartao + "% no valor total.   *--|-|--*\n"
								+ "\n\n *--|-|--*   SUPERMERCADO H.MARKET. AGRADECEMOS SUA PREFER�NCIA.   *--|-|--* ");
				
			}
		}	
	}		