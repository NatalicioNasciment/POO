package carros;

public class Pirincipal {

	public static void main(String[] args) {
		Carro c1 = new Carro(10);
		c1.potencia = 10;
		c1.nome = "Fusca";
		c1.velocidade = 0;
		c1.acelerar();
		c1.imprimir();

	}

}
