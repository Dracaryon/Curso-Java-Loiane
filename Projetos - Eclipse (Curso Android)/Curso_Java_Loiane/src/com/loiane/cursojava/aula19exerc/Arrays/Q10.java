package com.loiane.cursojava.aula19exerc.Arrays;

import java.util.Scanner;

public class Q10 {

	private static Scanner scan;

	// B[i] := A[i] % 2

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int casa [] = new int [10];
		int moveis [] = new int [10];

		for (int i=0; i < casa.length; i++){
			
			System.out.print("Insira os valores na casa " + (i + 1) + " do Array: ");
			casa[i] = scan.nextInt();
			moveis[i] = casa[i] % 2;
			
			
			System.out.println((i + 1) + " -> " + casa[i]);
			System.out.println((i + 1) + " -> " + moveis[i]);
		}
		
		for (double cas : moveis){
			
			int i = 0;
			i =+ 1;
			System.out.println((i+1) + " -> " + cas);
			
		}
	}
}

