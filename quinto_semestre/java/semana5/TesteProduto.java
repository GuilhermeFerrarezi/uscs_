package semana5;

public class TesteProduto {
	
	public static void main(String[] args) {
		Produto p1 = new Produto("1232", "Celular Samsung S8", 30);
		Produto p2 = new Produto();
		p2.setCod("3456");
		p2.setDescricao("Monitor Samsung SyncMaster");
		p2.setQtd(12);
		p1.retiraEstoque(5);
		p2.retiraEstoque(8);
		p1.imprimeProduto();
		p1.statusEstoque();
		p2.imprimeProduto();
		p2.statusEstoque();
		p1.retiraEstoque(10);
		p2.retiraEstoque(12);
		p1.imprimeProduto();
		p1.statusEstoque();
		p2.imprimeProduto();
		p2.statusEstoque();
	}
	
	static void EntradaValorLimite(int qtd) {
		Produto.alteraLimite(qtd);
	}
}
