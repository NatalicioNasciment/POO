package heranca;

public class Carro extends Automovel{

	public Carro(double potencia, double velocidadeMax) {
		super(potencia, velocidadeMax);
	}
	
	//codigo duplicado
	@Override
	public void ligar(String x) {
		String sms = "abestado";
		super.ligar(sms);
	}
	
	//mesmo que eu n�o tenha chamado o metodo parar caso eu precise redefinir um novo comportamento eu 
//	eu preciso conhecer a implementa��o da classe ancestral e isso "quebra" o encapsulamento e gera
//	acoplamento no software
}
