package freio;

import pecas.Freio;

public class FreioComum implements Freio{
	
	/**
	 * Freia 5m/s
	 */
	@Override
	public double frear(double velocidade) {
		return (velocidade * velocidade)/(250 * 0.5);
	}

}
