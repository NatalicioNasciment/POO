package encapsulando_objetos;

public class Principal {

	public static void main(String[] args) {
		Atriz roberta = new Atriz();
		roberta.setNome("roberta");
		Ator amante = roberta.getAmante();
		amante.setNome("Natalicio");
	}

}
