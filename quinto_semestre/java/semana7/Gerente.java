package semana7;

public class Gerente extends Empregado{
	private String secretaria;
	private double valor_bonus;
	
	Gerente(String nome, String endereco, double valor_hora, double quantidade_hora, String secretaria, double valor_bonus){
		super(nome, endereco, valor_hora, quantidade_hora);
		this.secretaria = secretaria;
		this.valor_bonus = valor_bonus;
	}
	
	Gerente(){
		super();
	}
	
	void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	
	void setValor_bonus(double valor_bonus) {
		this.valor_bonus = valor_bonus;
	}
	
	String getSecretaria() {
		return this.secretaria;
	}
	
	double getValor_bonus() {
		return this.valor_bonus;
	}
	
	void imprimeGerente() {
		String message = super.imprimeEmpregado(false).concat("\nSecretaria: " + this.secretaria + "\nValor bonus: R$" + this.valor_bonus + "\n");
		System.out.println(message);
	}
	
	double calculaSalario() {
		return this.valor_hora * this.quantidade_hora + this.valor_bonus;
	}
	
	void imprimeSalario() {
		String message = "Nome: " + this.nome + "\nSalário: R$" + this.calculaSalario() + "\n";
		System.out.println(message);
	}
}
