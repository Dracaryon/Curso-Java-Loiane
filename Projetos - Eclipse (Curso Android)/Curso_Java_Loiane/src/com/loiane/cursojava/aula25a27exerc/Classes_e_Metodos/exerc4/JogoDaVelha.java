package com.loiane.cursojava.aula25a27exerc.Classes_e_Metodos.exerc4;

import java.util.Scanner;

public class JogoDaVelha {

	int[][] JogoDaVelha = new int[3][3];
	Scanner e = new Scanner(System.in);
	int game = 1;
	int linha = 10;
	int coluna = 10;
	String jogador = "X";
	int noWinner = 0;
	int verify = 0;
	int marcaLinha = 2;
	int marcaColuna = 2;
	int valorJogador = 0;

	void executarJogoDaVelha() {

		System.out.println("Bem vindo ao Jogo da Velha! Jogador X e Y preparados?");

		while (game == 1) {

			System.out.println("\n Jogador " + jogador + ": Digite a linha e a coluna desejada");
			linha = e.nextInt();
			coluna = e.nextInt();
			linha--;
			coluna--;

			// valida��o da inser��o
			if (validacao()) {
				// valida��o se o valor da posi��o � NULL
				Integer posicao = JogoDaVelha[linha][coluna];

				if (posicao == 0) {

					inserirValoresXY();

					System.out.println("\nA rodada acabou com a seguinte tabela da velha: \n");
					exibirTabela();

					// Trocar os jogadores
					trocarJogadores();

					if (noWinner == 9) {
						game = 2;
						System.out.println("N�o houve vencedor dessa vez! Tentem novamente ;D");

						break;
					}

				} else {
					System.out.println("J� existe um valor nessa posi��o! Tente novamente!");
				}
			}
		}
		if (game != 2) {
			System.out.println("N�o se preocupe, " + jogador + "! Nos vemos na revanche!");
		}
	}

	void inserirValoresXY() {

		// PLAYER X
		if (jogador.equals("X")) {
			JogoDaVelha[linha][coluna] = 1;
			noWinner++;
			valorJogador = 1;

			verificarJogadas();
		} // END PLAYER X

		// PLAYER Y
		else if (jogador.equals("Y")) {
			JogoDaVelha[linha][coluna] = 2;
			noWinner++;
			valorJogador = 2;

			verificarJogadas();
		} // END PLAYER Y
	}

	void verificarJogadas() {
		// verifica��o nas linhas X X X
		verificarLinhas();

		// verifica��o nas diagonais
		// com incrementador de coluna diagonal direita esquerda
		verificarDiagonaisDE();

		// verifica��o nas diagonais
		// com incrementador de coluna diagonal esquerda direita
		verificarDiagonaisED();

		// verifica��o nas colunas
		// com incrementador de coluna e linha
		verificarColunas();
	}

	void verificarLinhas() {
		for (int i = 0; i < JogoDaVelha.length; i++) {
			verify = 0; // verify RESETADO na prox linha
			for (int j = 0; j < JogoDaVelha.length; j++) {
				if (JogoDaVelha[i][j] == valorJogador) {
					verify++;
					if (verify == 3) {
						System.out.println("O jogador " + jogador + " preencheu 1 linha e ganhou! Parab�ns! ");
						game = 0;
						break;
					}
				}
			}
		}
	}

	void verificarColunas() {
		marcaLinha = 0;
		marcaColuna = 0;
		verify = 0;
		for (int i = 0; i < JogoDaVelha.length; i++) {
			for (int j = 0; j < JogoDaVelha[i].length; j++) {
				if (JogoDaVelha[j][marcaColuna] == valorJogador) {
					verify++;
					if (verify == 3) {
						System.out.println("O jogador " + jogador + " preencheu 1 coluna e ganhou! Parab�ns! ");
						game = 0;
						break;
					}
				}
				// marcaLinha++;
			}
			marcaColuna++;
			verify = 0;
		}
	}

	void verificarDiagonaisDE() {
		marcaLinha = 2;
		marcaColuna = 2;
		verify = 0;
		for (int i = 0; i < JogoDaVelha.length; i++) {
			if (JogoDaVelha[marcaLinha][marcaColuna] == valorJogador) {
				verify++;
				if (verify == 3) {
					System.out.println("O jogador " + jogador + " preencheu 1 diagonal D-E e ganhou! Parab�ns! ");
					game = 0;
					break;
				}
			}
			marcaLinha--;
			marcaColuna--;
		}
	}

	void verificarDiagonaisED() {
		marcaLinha = 0;
		marcaColuna = 0;
		verify = 0;
		for (int i = 0; i < JogoDaVelha.length; i++) {
			if (JogoDaVelha[marcaLinha][marcaColuna] == valorJogador) {
				verify++;
				if (verify == 3) {
					System.out.println("O jogador " + jogador + " preencheu 1 diagonal E-D e ganhou! Parab�ns! ");
					game = 0;
					break;
				}
			}
			marcaLinha++;
			marcaColuna++;
		}
	}

	boolean validacao() {
		boolean ok = true;
		if (linha > 2 || linha < 0) {
			System.out.println("Linha inv�lida! Tente novamente.");
			ok = false;
		} else if (coluna > 2 || coluna < 0) {
			System.out.println("Coluna inv�lida! Tente novamente.");
			ok = false;
		}
		return ok;
	}

	void exibirTabela() {
		for (int i = 0; i < JogoDaVelha.length; i++) {
			for (int j = 0; j < JogoDaVelha[i].length; j++) {
				System.out.print("| " + JogoDaVelha[i][j] + " |");
			}
			System.out.print(" \n");
		}
	}

	void trocarJogadores() {
		if (jogador.equals("X")) {
			jogador = "Y";
		} else if (jogador.equals("Y")) {
			jogador = "X";
		}
	}
}
