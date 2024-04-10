package semana4;

public class Gabinete extends Produto{
	
	Gabinete(String n_serie, String fornecedor, String cor){
		super(n_serie, fornecedor, cor);
	}
	
	Gabinete(){
		super();
	}
	
	String imprimeGabinete(boolean print) {
		if(print) {
			System.out.println(super.imprime());
			return null;
		}else {
			return super.imprime();
		}
	}
}
