package semana5;

public class Produto {
	
	private String cod;
	private String descricao;
	private int qtd;
	private static int total;
	private static int limite_estoque = 10;
	
	Produto(String cod, String descricao, int qtd){
		this.cod = cod;
		this.descricao = descricao;
		this.qtd = qtd;
		Produto.total++;
	}
	
	Produto(){
		Produto.total++;
	}
	
	void setCod(String cod) {
		this.cod = cod;
	}
	
	void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	String getCod(String cod) {
		return this.cod;
	}
	
	String getDescricao(String descricao) {
		return this.descricao;
	}
	
	int getQtd(int qtd) {
		return this.qtd;
	}
	
	void retiraEstoque(int qtd) {
		if(this.qtd - qtd < 0){
			System.out.println("Faltam " + (-(this.qtd - qtd)) + ' ' + this.descricao + "\n");
			this.qtd = 0;
		}else{
			this.qtd -= qtd;
		}
	}
	
	void adicionaEstoque(int qtd) {
		this.qtd += qtd;
	}
	
	void imprimeProduto() {
		System.out.println("Código: " + this.cod + "\nDescrição: " + this.descricao + "\nQuantidade: " + this.qtd);
	}
	
	void imprimeTotalDeProdutos() {
		System.out.println("Quantidade total de produtos: " + Produto.total);
	}
	
	void statusEstoque() {
		if(this.qtd == 0) {
			System.out.println("Estoque Nulo" + "\n");
		}else if(this.qtd > Produto.limite_estoque) {
			System.out.println("Estoque Regular" + "\n");
		}else {
			System.out.println("Estoque Restrito" + "\n");
		}
	}
	
	static void alteraLimite(int limite) {
		Produto.limite_estoque = limite;
	}
}
