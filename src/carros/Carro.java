package carros;
public class Carro {
//obs. È importante ressaltar  que a omissão do encapsulamento nas variaveis de instancia foi proposital 
	int potencia;
	int velocidade;
	String nome;
	public Carro(){
		
	}
	public Carro(int potencia) {
		this.potencia = potencia;
		velocidade = 0;
		// TODO Auto-generated constructor stub
	}
	
	void acelerar(){
		velocidade += potencia;
	}
	void frear(){
		velocidade = velocidade/2;
	}
	int getVelocidade(){
		return velocidade;
	}
	void imprimir(){
		System.out.println("O carro "+ nome + "esta a velocidade de " + getVelocidade()+ "Km/h" );
	}

}
