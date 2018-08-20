package com.loiane.cursojava.aula20exerc.Matriz;

public class Q1 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		
		int min = 0;
		int max = 10;
		
		int maior = 0;
		int linhaMaior = 0;
		int colunaMaior = 0;

		min = (int) Math.ceil(min);
		max = (int) Math.ceil(max);
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz.length; j++) {
				matriz[i][j] = (int)( Math.random() * (max - min) + min) ;
				
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaMaior = i+1;
					colunaMaior = j+1;
				}
				
			}
		}
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz.length; j++) {
				System.out.println("O valor da posi��o da linha " + (i+1) + " e coluna " + (j+1) + " � " + matriz [i][j] + ""
						+ ". O maior n�mero da Matriz � " + maior + " que encontra-se na linha " + linhaMaior + " e coluna " + colunaMaior + ".");
			}
			System.out.println("");
		}
		System.out.println("");
		
	}

}
