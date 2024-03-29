package uscs;

public class Empregado {
	
	private int cod;
	private String nome;
	private String cargo;
	private double salario;
	private static int qtd = 0;
	
	Empregado(int cod, String nome, String cargo, double salario){
		this.cod = cod;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		AddEmpregado();
	}
	
	Empregado(){
		AddEmpregado();
	}
	
	void ImprimeEmpregado() {
		System.out.println("Código do empregado: " + this.cod + "\nNome: " + this.nome + "\ncargo: " + this.cargo + "\nsalário: " + this.salario + "\n");
	}
	
	void AddEmpregado() {
		qtd++;
	}
	
	static void TotalEmpregados() {
		System.out.println("Quantidade de empregados: " + qtd);
	}
}
