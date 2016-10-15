package banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestContaCorrent {
	ContaCorrent cc;

	@Before
	public void inicializarConta() {
		cc = new ContaCorrent();
		cc.depositar(200);
	}

	@Test
	public void deposito() {
		assertEquals(cc.saldo, 200);
	}

	@Test
	public void sacar() {
		cc.sacar(200);
		assertEquals(cc.saldo, 0);
	}

	@Test
	public void saqueMaiorQueSaldo() {
		cc.sacar(200);
		assertEquals(cc.saldo, 0);
	}
}
