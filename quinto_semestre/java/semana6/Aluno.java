package semana6;

public class Aluno extends Pessoa{
	
	private String cod;
	private double p1;
	private double p2;
	private int faltas;
	final private static int limite_faltas = 10;
	final private static double media_de_aprovacao = 7.0;
	final private static double media_de_reprovacao = 3.0;
	static int total_faltas;
	
	Aluno(String nome, String endereco, String cpf, String rg, String cod, double p1, double p2, int faltas){
		super(nome, endereco, cpf, rg);
		this.cod = cod;
		this.p1 = p1;
		this.p2 = p2;
		this.faltas = faltas;
		Aluno.total_faltas += faltas;
	}
	
	Aluno(){
		
	}
	
	void setCod(String cod) {
		this.cod = cod;
	}
	
	void setP1(double p1) {
		this.p1 = p1 * 1.0;
	}
	
	void setP2(double p2) {
		this.p2 = p2 * 1.0;
	}
	
	void setFaltas(int faltas) {
		Aluno.total_faltas -= this.faltas;
		this.faltas = faltas;
		Aluno.total_faltas += faltas;
	}
	
	String getCod() {
		return this.cod;
	}
	
	double get_P1(){
		return this.p1;
	}
	
	double get_P2() {
		return this.p2;
	}
	
	int get_faltas() {
		return this.faltas;
	}
	
	void imprimeAluno(){
		System.out.println(super.imprimePessoa(false) + "\nCódigo: " + this.cod + "\nNota 1: " + this.p1 + "\nNota 2: " + this.p2 + "\nFaltas: " + this.faltas);
	}
	
	void imprimeFaltas() {
		System.out.println("\nTotal de faltas: " + Aluno.total_faltas);
	}
	
	void resultado() {
		double media = this.media();
		if(media < Aluno.media_de_reprovacao || this.faltas > Aluno.limite_faltas ) {
			System.out.println("Reprovado\n");
		}else if(media >= Aluno.media_de_aprovacao) {
			System.out.println("Aprovado\n");
		}else {
			System.out.println("Reavaliação (exame)\n");
		}
	}
	
	double media() {
		return (((this.p1 + this.p2) / 2) * 1.0);
	}

}
