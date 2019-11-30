package carro;

import pecas.Freio;
import pecas.Motor;

public class Carro {

	private int porta;
	
	private boolean conversivel;
	
	private Motor motor;
	
	private Freio freio;
	
	private int peso;
	
	

	public Carro(int porta, boolean conversivel, Motor motor, Freio freio,int peso) {
		this.porta = porta;
		this.conversivel = conversivel;
		this.motor = motor;
		this.freio = freio;
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public boolean isConversivel() {
		return conversivel;
	}

	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Freio getFreio() {
		return freio;
	}

	public void setFreio(Freio freio) {
		this.freio = freio;
	}		
}
