import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		//Instancia um produto 1 e logo em seguida define o valor de seus atributos através dos setters.
		Produto_novo produto1 = new Produto_novo();
		
		produto1.setNome("Manteiga");
		produto1.setPrecoCusto(8.65);
        produto1.setPrecoVenda(8.65 * 1.10);
		produto1.setDataFabricacao(LocalDate.of(2024, 12, 22));
        produto1.setDataValidade(LocalDate.of(2024, 12, 22).plusMonths(1)); // Definindo a validade como 1 mês após fabricação

        /*Instancia um produto 2 apenas com os atributos nome e preço de custo, no qual os outros atributos 
         * serão definidos dentro dos métodos da classe Produto_novo*/
        Produto_novo produto2 = new Produto_novo("Pão", 7.55);
        
        /*Instancia um produto 3 com todos os atributos exceto a data de validade que será determinada
         * de dentro do método na classe produto_novo.*/
        Produto_novo produto3 = new Produto_novo("Queijo", 8.50, (8.50*1.10), LocalDate.of(2024, 9, 23));
		
        
        //Faz a chamada do método de descrição do produto a partir de cada um dos produtos.
		System.out.println(produto1.dadosProduto());
		System.out.println(produto2.dadosProduto());
		System.out.println(produto3.dadosProduto());

	}
	
}
