package semana4;

public class Monitor extends Produto{
	
	Monitor(String n_serie, String fabricante, String cor){
		super(n_serie, fabricante, cor);
	}
	
	Monitor(){
		super();
	}
	
	String imprimeMonitor(boolean print) {
		if(print) {
			System.out.println(super.imprime());
			return null;
		}else {
			return super.imprime();
		}
	}
}
