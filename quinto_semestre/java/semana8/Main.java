package semana8;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(12.5);
		Quadrado q1 = new Quadrado(12.5);
		
		System.out.println(c1.area());
		System.out.println(c1.comprimento());
		System.out.println();
		System.out.println(q1.area());
		System.out.println(q1.comprimento());
	}
}
