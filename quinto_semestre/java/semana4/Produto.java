package semana4;

public abstract class Produto {
	
	private String n_serie;
	private String fabricante;
	private String cor;
	
	Produto(String n_serie, String fabricante, String cor) {
		this.n_serie = n_serie;
		this.fabricante = fabricante;
		this.cor = cor;
	}
	
	Produto() {
		
	}
	
	String getN_serie(){
		return this.n_serie;
	}
	
	String getFabricante() {
		return this.fabricante;
	}
	
	String getCor() {
		return this.cor;
	}
	
	void setN_serie(String n_serie){
		this.n_serie = n_serie;
	}
	
	void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String imprime() {
		return "\nNúmero de série: " + this.n_serie + "\nFabricante: " + this.fabricante + "\nCor: " + this.cor;
	}

}
