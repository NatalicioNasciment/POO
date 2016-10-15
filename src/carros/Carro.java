package carros;

public class Carro {

	private int potencia;
	private int velocidade;
	private int velocidadeMaxima;
	private String nome;

	public Carro() {

	}

	public Carro(String nome, int potencia, int velocidadeMaxima) {
		this.nome = nome;
		this.potencia = potencia;
		this.velocidadeMaxima = velocidadeMaxima;
		velocidade = 0;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;
	}

	public void frear() {
		velocidade = velocidade / 2;
	}

}
