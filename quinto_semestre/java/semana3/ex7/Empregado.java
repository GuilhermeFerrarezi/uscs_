package uscs;

public class Empregado {
	
	private static int qtdcod = 0;
	private int cod;
	private String nome;
	private String cargo;
	private double salario;
	private static int qtd = 0;
	
	Empregado(String nome, String cargo, double salario){
		this.cod = CreateCod();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		AddEmpregado();
	}
	
	Empregado() {
		this.cod = CreateCod();
		AddEmpregado();
	}
	
	int CreateCod() {
		return ++qtdcod;
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
	
	static int GetQtd() {
		return qtd;
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
