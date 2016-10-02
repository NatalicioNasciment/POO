package comercio;

public class Compra {
	int valorTotal;
	int numeroParcelas;
//	a vista
	public Compra(int valor){
		valorTotal = valor;
		numeroParcelas = 1;
	}
//	parcelado
	public Compra(int quantParcelas, int valorParcela){
		numeroParcelas = quantParcelas;
		valorTotal = valorParcela * quantParcelas;
	}
	public int getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	public int getValorParcela(){
		return valorTotal / numeroParcelas;
	}

}
