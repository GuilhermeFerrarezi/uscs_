package semana2;

public class Pessoa {
	
	String nome;
	int idade;
	
	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	void Imprime(){
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
}
