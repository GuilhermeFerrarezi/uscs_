package semana6;

public class TesteAluno {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("José", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");
		Aluno a1 = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", "59751", 4.5, 8.0, 10);
		a1.imprimeAluno();
		a1.resultado();
		Aluno a2 = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", "59751", 4.5, 8.0, 10);
		a2.setNome("Francisco");
		a2.setP1(9.0);
		a2.setP2(9.5);
		a2.imprimeAluno();
		a2.resultado();
		a2.setFaltas(11);
		a2.imprimeAluno();
		a2.resultado();
		a2.setP1(8.0);
		a2.setP2(8.5);
		a2.resultado();
	}

}
