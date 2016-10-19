package heranca;

//Exemplificando que herança "quebra o encapsulamento" é que é preferivel a composição à herança.
public class Automovel {

	private String descricao;
	private String cor;
	private double potencia;
	private double velocidadeMaxima;
	
	public Automovel(String descricao, double velocidadeMax){
		
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPotencia() {
		return potencia;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	
	
}
