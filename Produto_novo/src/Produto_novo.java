import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*Classe do produto que define seus atributos como privados para serem acessados diretamente apenas
 * de dentro da classe.*/
public class Produto_novo {
	private String nome;
	private double precoCusto;
    private double precoVenda;
	private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    
    
    /*Construtor vazio para inicializar o objeto sem argumentos que vão ser informados e atribuidos pelos setters.*/
    public Produto_novo() {
    }

	
    /*Construtor que cria o objeto a partir de todos os dados sendo informados na classe Main.*/
    public Produto_novo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
    	setNome(nome);
    	setPrecoCusto(precoCusto);
        setPrecoVenda(precoVenda);
    	setDataFabricacao(dataFabricacao);
        setDataValidade(dataValidade);
    }
    
    /*Construtor que cria o objeto a partir de todos os dados, exceto a data de validade, na qual é definida
     * adicionando um més ao mês informado na data de fabricação.*/
    public Produto_novo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        setNome(nome);
        setPrecoCusto(precoCusto);
        setPrecoVenda(precoVenda);
        setDataFabricacao(dataFabricacao);
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }
    
    /*Método contrutor que recebe apenas o nome e o preço de custo, e faz o cálculo do preço de venda multiplicando
     * o preço de custo por 1.10, e determina a data de fabricação como a data atual e a data de validade como um mês
     * a mais da data de fabricação.*/
    public Produto_novo(String nome, double precoCusto) {
        setNome(nome);
        setPrecoCusto(precoCusto);
        setPrecoVenda(precoCusto * 1.10);
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }
      
    
    /*Setters para atribuir os valores vindos da classe Main nos atributos desta classe.*/
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    
    public void setPrecoCusto(double precoCusto) {
    	this.precoCusto = precoCusto;
    }
    
    public void setPrecoVenda(double precoVenda) {
    	this.precoVenda = precoVenda;
    }
    
    
    public void setDataFabricacao(LocalDate dataFabricacao) {
    	this.dataFabricacao = dataFabricacao;
    }
    
    public void setDataValidade(LocalDate dataValidade) {
    	this.dataValidade = dataValidade;
    }
      
    
    
    /*Getters para serem acessados no método descrição e retornar os valores das variáveis.*/
    public String getNome() {
    	return
    			nome;
    }
    
    public double getPrecoCusto() {
    	return
    			precoCusto;
    }
    
    public double getPrecoVenda() {
    	return
    			precoVenda;
    }
    
    public LocalDate getDataFabricacao() {
    	return
    			dataFabricacao;
    }
    
    public LocalDate getDataValidade() {
    	return
    			dataValidade;
    }
    
    
    /*Método de descrição para retornar a String com a formatação dos dados do produto, padronizada.*/
	public String dadosProduto() {
		//Formatador da data, para seguir o padrão brasileiro
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return
			"Produto:" + "\n" +
			"  Nome: " + getNome() + "\n" +
			"  Preço de Custo: " + getPrecoCusto() + "\n" +
			"  Preço de venda: " + getPrecoVenda() + "\n" +			
			"  Data de Fabricação: " + getDataFabricacao().format(formatter) + "\n" +
			"  Data de validade: " + getDataValidade().format(formatter) + "\n";
	}
}
