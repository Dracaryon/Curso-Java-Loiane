package com.loiane.cursojava.aula34exerc.variav_e_method_static.exerc1;

public class TesteIncrementado {

	static Contador count1 = new Contador();
	
	public static void main(String[] args) {
		
		
		
		System.out.println(count1.getIncrementador());
		
		count1.zerarIncrement();
		
		System.out.println(count1.getIncrementador());

		count1.incrementar();
		count1.incrementar();
		count1.incrementar();
		count1.incrementar();
		count1.incrementar();
		
		System.out.println(count1.getIncrementador());

		
	}

}