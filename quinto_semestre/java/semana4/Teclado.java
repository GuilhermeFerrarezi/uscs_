package semana4;

public class Teclado extends Produto{
	
	Teclado(String n_serie, String fabricante, String cor){
		super(n_serie, fabricante, cor);
	}
	
	Teclado(){
		super();
	}
	
	String imprimeTeclado(boolean print) {
		if(print) {
			System.out.println(super.imprime());
			return null;
		}else {
			return super.imprime();
		}
	}
}
