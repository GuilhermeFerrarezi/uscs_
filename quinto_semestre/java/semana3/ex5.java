package uscs;

public class Empregado {
	
	private int cod;
	private String nome;
	private String cargo;
	private double salario;
	private static int qtd;
	
	Empregado(int cod, String nome, String cargo, double salario){
		this.cod = cod;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		AddEmpregado();
	}
	
	void SetCod(int cod) {
		this.cod = cod;
	}
	
	void SetNome(String nome) {
		this.nome = nome;
	}
	
	void SetCargo(String cargo) {
		this.cargo = cargo;
	}
	
	void SetSalario(double salario) {
		this.salario = salario;
	}
	
	int GetCod() {
		return this.cod;
	}
	
	String GetNome() {
		return this.nome;
	}
	
	String GetCargo() {
		return this.cargo;
	}
	
	double GetSalario() {
		return this.salario;
	}
	
	Empregado() {
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
