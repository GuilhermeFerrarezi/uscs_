package semana7;

public class TesteGerente {
	
	public static void main(String[] args) {
		Empregado e1 = new Empregado("Antonio", "Rua Brasil, 130", 50.00, 230);
		Gerente g1 = new Gerente("Carlos", "Rua Silvio Torres, 36", 50.00, 230, "Ana", 2000.00);
		e1.imprimeEmpregado(true);
		e1.imprimeSalario(true);
		
		g1.imprimeGerente();
		g1.imprimeSalario();
	}
}
