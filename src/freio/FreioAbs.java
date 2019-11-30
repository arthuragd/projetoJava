package freio;

import pecas.Freio;

public class FreioAbs implements Freio{
	
	/**
	 * Freia 2m/s
	 */
	@Override
	public double frear(double velocidade) {
		return (velocidade * velocidade)/(250*0.8);
	}
	
}
