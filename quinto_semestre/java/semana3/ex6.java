package uscs;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		
		Empregado[] empregados = new Empregado[2];
		empregados[0] = new Empregado(1232, "Paulo Silva", "Gerente Financeiro", 15400.00);
		empregados[1] = new Empregado();
		empregados[1].SetCod(4567);
		empregados[1].SetNome("Ana Paula");
		empregados[1].SetCargo("Analista de Sistemas Senior");
		empregados[1].SetSalario(107000.00);
		
		for(int i = 0; i < Empregado.GetQtd(); i++) {
			System.out.printf("%dº empregado:\n", i + 1);
			empregados[i].ImprimeEmpregado();;
		}
		Empregado.TotalEmpregados();
	}
}
