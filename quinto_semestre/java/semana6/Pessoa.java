package semana6;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	private String rg;
	
	Pessoa(String nome, String endereco, String cpf, String rg){
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	Pessoa(){
		
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	void setRg(String rg){
		this.rg = rg;
	}
	
	String getNome() {
		return this.nome;
	}
	
	String getEndereco() {
		return this.endereco;
	}
	
	String getCpf() {
		return this.cpf;
	}
	
	String getRg() {
		return this.rg;
	}
	
	String imprimePessoa(boolean print) {
		String ret = "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nCPF: " + this.cpf + "\nRG: " + this.rg;
		if(print) {
			System.out.println(ret);
			return null;
		}else {
			return ret;
		}
	}
	
}
