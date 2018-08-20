package com.loiane.cursojava.aula25a27exerc.Classes_e_Metodos.exerc1;

public class Lampada {
	
	
	int id;
	String modelo;
	String marca;
	boolean estado;
	
	void ligar() {
		estado = true;
	}
	
	void desligar() {
		estado = false;
	}
	
	void mudarEstado() {
		if (!estado) {
			ligar();
			System.out.println("A l�mpada foi ligada!  Estado = " + estado);
		}
		else if (estado) {
			desligar();
			System.out.println("A l�mpada foi desligada!  Estado = " + estado);
		}
	}
	
	
	

}
