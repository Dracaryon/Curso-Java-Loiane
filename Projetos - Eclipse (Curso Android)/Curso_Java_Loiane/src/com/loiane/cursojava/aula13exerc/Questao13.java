package com.loiane.cursojava.aula13exerc;


import java.util.Scanner;

public class Questao13 {
	
	private static Scanner scan;
		
	public static void main(String[] args) {
		
	
		float descInss = 8;
		float descSindic = 5;
		float descImpostoDeRenda = 11;
		
		scan = new Scanner (System.in);
		System.out.println("Calcule o seu sal�rio com os descontos!\n Quanto voc� ganha por hora?");
		float salarioHora = scan.nextFloat();
		System.out.println("Quantas horas voc� trabalha por m�s?");
		float horasMes = scan.nextFloat();
		float salarioBruto = salarioHora * horasMes; //sal�rio bruto
		float salarioDescInss = (salarioBruto * descInss) / 100;
		float salarioDescSindic = (salarioBruto * descSindic) / 100;
		float salarioDescImpostoDeRenda = (salarioBruto * descImpostoDeRenda) / 100;
		float salarioLiquido = (salarioBruto - (salarioDescInss + salarioDescSindic + salarioDescImpostoDeRenda)) ;
		
						
		System.out.println(" O seu Sal�rio bruto � R$" + salarioBruto);
		System.out.println(" Voc� paga R$" + salarioDescInss + " para o INSS");
		System.out.println(" Voc� paga R$" + salarioDescSindic + " para o sindicato");
		System.out.println(" Voc� paga R$" + salarioDescImpostoDeRenda + " para a receita federal");
		System.out.println(" O seu Sal�rio l�quido � R$" + salarioLiquido);
	}

}
