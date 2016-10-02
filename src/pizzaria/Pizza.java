package pizzaria;

import org.junit.experimental.theories.Theories;

/*
Crie uma classe Pizza que possua o m�todo adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado.
 Essa classe tamb�m deve possuir o m�todo getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, 
 de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.
 
 � preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma vari�vel est�tica na classe Pizza para guardar
  esse tipo de informa��o (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). 
  Crie o m�todo est�tico contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.
  
  Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um m�todo que retorna 
  o valor total de todas as pizzas adicionadas. O Carrinho n�o pode aceitar que seja adicionada uma pizza sem ingredientes.

Crie uma classe Principal com o m�todo main() que faz o seguinte:
Cria 3 pizzas com ingredientes diferentes 
Adiciona essas Pizzas em um CarrinhoDeCompra 
Imprime o total do CarrinhoDeCompra 
Imprime a quantidade utilizada de cada ingrediente


 * */
public class Pizza {
	private String ingrediente;
	private static int contaIngredientes = 0;
	private static int valor = 0;

	public void adicionaIgrediente(String ingrediente) {
		this.ingrediente = ingrediente;
		contabilizaIngrediente();

	}

	public static void contabilizaIngrediente() {
		contaIngredientes++;
		if (contaIngredientes <= 2) {
			valor = 15;
		} else if (contaIngredientes >= 3 || contaIngredientes <= 5) {
			valor = 20;
		} else {
			valor = 23;
		}
	}

	public int getPreco() {
		return 0;
	}
}
