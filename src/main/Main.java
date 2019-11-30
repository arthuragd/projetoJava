package main;

import carro.Carro;
import freio.FreioAbs;
import freio.FreioComum;
import motor.MotorV6;
import motor.MotorV8;

public class Main {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro(2, false,new MotorV8() , new FreioAbs(),2100);
		Carro lamborghini = new Carro(2,true, new MotorV6(), new FreioAbs(),1800);
		Carro golTunado = new Carro(2,false,new MotorV6(), new FreioComum(),1000);
		
		double ferrariVelocidade = ferrari.getMotor().aceleracao(3000);
		double lamborghiniVelocidade = lamborghini.getMotor().aceleracao(3000);
		double golTunadoVelocidade = golTunado.getMotor().aceleracao(3000);
		
		System.out.println("---------------------------------------------");
		System.out.println("Velocidade dos 3 carros a 3000rpm:");
		System.out.println("Ferrari " + ferrariVelocidade + "km/h");
		System.out.println("Lamborghini " + lamborghiniVelocidade + "km/h");
		System.out.println("Gol Tunado " + golTunadoVelocidade + "km/h");
		System.out.println("---------------------------------------------");
		
		double ferrarioFreio = ferrari.getFreio().frear(ferrariVelocidade);
		double lamborghiniFreio = lamborghini.getFreio().frear(lamborghiniVelocidade);
		double golTunadoFreio = golTunado.getFreio().frear(golTunadoVelocidade);
		System.out.println("Os 3 Freiando ao mesmo tempo percorririam:");
		System.out.println("Ferrari percorreria " + ferrarioFreio + "m");
		System.out.println("Lamborghini percorreria " + lamborghiniFreio + "m");
		System.out.println("Gol Tunado percorreria " + golTunadoFreio + "m");
		
		
	}

}
