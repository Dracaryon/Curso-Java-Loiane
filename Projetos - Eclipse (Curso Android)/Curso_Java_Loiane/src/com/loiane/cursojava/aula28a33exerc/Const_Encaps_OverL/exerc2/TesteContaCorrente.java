package com.loiane.cursojava.aula28a33exerc.Const_Encaps_OverL.exerc2;

import java.util.Scanner;

public class TesteContaCorrente {

	private static ContaCorrente Pessoa1 = new ContaCorrente();
	private static ContaCorrente Pessoa2 = new ContaCorrente(14898, 300, true, 400);
	private static String nomePessoa;

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		Pessoa1.setIdConta(131);
		Pessoa1.setSaldo(10);
		Pessoa1.setLimite(500);
		Pessoa1.setContaEspecial(false);

		/*
		 * Pessoa2.setIdConta(14898); Pessoa2.setSaldo(300); Pessoa2.setLimite(400);
		 * Pessoa2.setContaEspecial (true);
		 */

		/////// Teste dos MET�DOS

		loop();

	}

	private static void loop() {

		boolean loop = true;
		int opcao = 0;

		ContaCorrente variavelPessoa = Pessoa1;
		nomePessoa = "Pessoa 1";

		while (loop) {

			System.out.println("\nQual opera��o deseja executar " + nomePessoa + "?");
			System.out.println("1 - Saque");
			System.out.println("2 - Dep�sito");
			System.out.println("3 - Consulta");
			System.out.println("4 - Informa��es sobre Conta Especial");
			System.out.println("5 - Trocar de Usu�rio");
			System.out.println("6 - Sair");

			opcao = e.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o valor do saque: ");
				variavelPessoa.sacar(e.nextDouble());
			} else if (opcao == 2) {
				System.out.println("Digite o valor do dep�sito: ");
				variavelPessoa.depositar(e.nextDouble());
			} else if (opcao == 3) {
				variavelPessoa.consultar();
			} else if (opcao == 4) {
				variavelPessoa.verificarChequeEspecial();
			} else if (opcao == 5) {
				variavelPessoa = verificarPessoa(variavelPessoa);
			} else if (opcao == 6) {
				loop = false;
				System.out.println("Agradecemos a sua prefer�ncia. Queremos te ver de novo em breve!");

			}
		}
	}

	private static ContaCorrente verificarPessoa(ContaCorrente variavelPessoa) {
		if (variavelPessoa == Pessoa1) {
			variavelPessoa = Pessoa2;
			nomePessoa = "Pessoa 2";
		} else {
			variavelPessoa = Pessoa1;
			nomePessoa = "Pessoa 1";
		}
		System.out.println("Usu�rio alterado!");
		return variavelPessoa;
	}

	public static ContaCorrente getPessoa1() {
		return Pessoa1;
	}

	public static void setPessoa1(ContaCorrente pessoa1) {
		Pessoa1 = pessoa1;
	}

	public static ContaCorrente getPessoa2() {
		return Pessoa2;
	}

	public static void setPessoa2(ContaCorrente pessoa2) {
		Pessoa2 = pessoa2;
	}

	public static String getNomePessoa() {
		return nomePessoa;
	}

	public static void setNomePessoa(String nomePessoa) {
		TesteContaCorrente.nomePessoa = nomePessoa;
	}
}
