package banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestContaEspecial extends TestContaCorrent {
	ContaEspecial ce;

	@Before
	public void inicializarContaEspecial() {
		ce = new ContaEspecial(100);
		ce.depositar(200);
	}

	@Test
	public void saqueMaiorQueSaldo() {
		int valorSacado = ce.sacar(350);
		assertEquals(valorSacado, 0);
	}

	@Test
	public void saqueMaiorQueSaldoNoLimite() {
		int valorSacado = ce.sacar(300);
		assertEquals(valorSacado, 300);
	}

}
