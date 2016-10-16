package pilhaEncapsulada;

public class Pilha {
	private Object [] elementos;
	private int topo;
	public Pilha(int quantidade) {
		this.elementos = new Object[quantidade];
	}
	public void empilhar(Object elemento){
		this.elementos[topo] = elemento;
			topo++;
	}
	public Object desempilhar(){
		topo--;
		return this.elementos[topo];
	}
	public Object topo(){
		return this.elementos[topo -1];
	}
	public int tamanho(){
		return topo;
	}
	public Object[] getElementos() {
		return elementos;
	}
	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}
	public void setTopo(int topo) {
		this.topo = topo;
	}

}
