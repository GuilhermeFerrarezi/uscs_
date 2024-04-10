package semana4;

public class TesteComputador {
	
	public static void main(String[] args) {
		
		Computador computador = new Computador();
		Teclado t = new Teclado("1232", "Logitech", "preto");
		Monitor mon = new Monitor("AFB876", "Samsung", "preto");
		Gabinete g = new Gabinete("4587HHY", "Logitech", "preto");
		Mouse m = new Mouse("HGY6654", "Microsft", "preto");
		Computador cp = new Computador("76TRDE35", t, m, mon, g);
		cp.imprimeComputador();
		
	}
}
