package semana4;

public class Mouse extends Produto{
	
	Mouse(String n_serie, String fabricante, String cor){
		super(n_serie, fabricante, cor);
	}
	
	Mouse(){
		super();
	}
	
	String imprimeMouse(boolean print) {
		if(print) {
			System.out.println(super.imprime());
			return null;
		}else {
			return super.imprime();
		}
	}
}
