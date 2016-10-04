package carros;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCarro {

	@Test
	public void testCarroParado() {
		Carro c = new Carro();
		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testAcelerar() {
		Carro c = new Carro();
		c.potencia = 10;
		c.velocidade = 10;
		c.acelerar();
		assertEquals(20, c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		Carro c = new Carro();
		c.velocidade = 10;
		c.potencia = 10;
		c.acelerar();
		c.frear();
		assertEquals(10, c.getVelocidade());
	}
	

}
