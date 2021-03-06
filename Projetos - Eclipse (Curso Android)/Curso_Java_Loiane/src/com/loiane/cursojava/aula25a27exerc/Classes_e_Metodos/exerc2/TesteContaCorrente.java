package com.loiane.cursojava.aula25a27exerc.Classes_e_Metodos.exerc2;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);

		ContaCorrente Pessoa1 = new ContaCorrente();
		
		Pessoa1.idConta = 131;
		Pessoa1.saldo = 10;
		Pessoa1.limite = 500;
		Pessoa1.contaEspecial = false;
		
		ContaCorrente Pessoa2 = new ContaCorrente();

		Pessoa2.idConta = 14898;
		Pessoa2.saldo = 300;
		Pessoa2.limite = 400;
		Pessoa2.contaEspecial = true;
		
		/////// Teste dos MET�DOS
		
		boolean loop = true;
		int opcao = 0;
		
		ContaCorrente variavelPessoa = Pessoa1;
		
			while (loop){
				
			System.out.println("\nQual opera��o deseja executar? ");
			System.out.println("1 - Saque");
			System.out.println("2 - Dep�sito");
			System.out.println("3 - Consulta");
			System.out.println("4 - Informa��es sobre Conta Especial");
			System.out.println("5 - Sair");
			
			opcao = e.nextInt();
	
			if (opcao == 1) {
				System.out.println("Digite o valor do saque: ");
				variavelPessoa.sacar(e.nextDouble());
			}
			else if (opcao == 2) {
				System.out.println("Digite o valor do dep�sito: ");
				variavelPessoa.depositar(e.nextDouble());
			}
			else if (opcao == 3) {
				variavelPessoa.consultar();
			}
			else if (opcao == 4) {
				variavelPessoa.verificarChequeEspecial();
			}
			else if (opcao == 5) {
				loop = false;
			}
		}
	}
}
