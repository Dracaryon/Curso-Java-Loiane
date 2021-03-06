package com.loiane.cursojava.aula28a33exerc.Const_Encaps_OverL.exerc1;

public class Lampada {

	private int id;
	private String modelo;
	private String marca;
	private boolean estado;
	
//Met�dos getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	//Constructors
	
	public Lampada(){
		System.out.println("Classe instanciada");
	}
	
	
	public Lampada(int id, String modelo, String marca, boolean estado) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.estado = estado;
	}

	public void ligar() {
		estado = true;
	}
	
	public void desligar() {
		estado = false;
	}
	
	public void mudarEstado() {
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
