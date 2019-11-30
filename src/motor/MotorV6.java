package motor;

import pecas.Motor;

public class MotorV6 implements Motor{
	
	@Override
	public double aceleracao(int rotacao) {
		return (rotacao/1000) * 20;	
	}
}
