package semana8;

public class Quadrado implements FormaGeometrica{
	
	private double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	Quadrado(){
		
	}
	
	public double area() {
		return lado * lado;
	}
	
	public double comprimento() {
		return lado * 4;
	}
	
	void setLado(double lado) {
		this.lado = lado;
	}
	
	double getLado() {
		return this.lado;
	}
}
