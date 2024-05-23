package semana7;

public class Empregado {
	protected String nome;
	protected String endereco;
	protected double valor_hora;
	protected double quantidade_hora;
	
	Empregado(String nome, String endereco, double valor_hora, double quantidade_hora){
		this.nome = nome;
		this.endereco = endereco;
		this.valor_hora = valor_hora;
		this.quantidade_hora = quantidade_hora;
	}
	
	Empregado(){
		
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}
	
	void setQuantidade_Hora(double quantidade_hora) {
		this.quantidade_hora = quantidade_hora;
	}
	
	String getNome() {
		return this.nome;		
	}
	
	String getEndereco() {
		return this.endereco;
	}
	
	double getValor_hora() {
		return this.valor_hora;
	}
	
	double getQuantidade_hora() {
		return this.quantidade_hora;
	}
	
	String imprimeEmpregado(boolean print) {
		String message = "Nome: " + this.nome + "\nEndereco: " + this.endereco + "\nValor da hora: R$" + this.valor_hora + "\nQuantidade de horas: " + this.quantidade_hora;
		if (!print){
			message = "\n" + message;
			return message;			
		}
		System.out.println(message);
		return null;
	}
	
	String imprimeSalario(boolean print) {
		String message = "Nome: " + this.nome + "\nSalário: R$" + this.calculaSalario();
		if(!print) {
			message = "\n" + message;
			return message;
		}
		System.out.println(message);
		return null;
	}
	
	double calculaSalario() {
		return this.quantidade_hora * this.valor_hora;
	}
}
