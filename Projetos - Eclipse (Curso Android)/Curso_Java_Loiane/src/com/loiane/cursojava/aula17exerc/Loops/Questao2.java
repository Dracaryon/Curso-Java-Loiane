package com.loiane.cursojava.aula17exerc.Loops;

import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		
		boolean valida = true;
		//String user = "";
		//String password = "";
		int resposta; 
		
		Scanner scan = new Scanner (System.in);
				
		while (valida == true){
			
			String user = "";
			String password = "";
			
			System.out.println("Insira um Usu�rio: ");
			user = scan.nextLine();
			System.out.println("Insira uma Senha: ");
			password = scan.nextLine();
			
			if (user.equals(password)){
				
				System.out.println("Voc� inseriu senha e usu�rio iguais! Deseja tentar novamente? 1 - Sim  2 - N�o");
				resposta = scan.nextInt();
			
				if (resposta == 2){
					valida = false;
				}
			}
			else {
				System.out.print("Seu usu�rio e senha foram cadastrados com sucesso.\n"
						+ "User: " + user
						+ "\nPassword: " + password + "\n");
				valida = false;
			}
		}
		
		System.out.print("Programa finalizado.");
		
	}
}
