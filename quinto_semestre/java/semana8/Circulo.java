package semana8;

public class Circulo implements FormaGeometrica{
	
	private double raio;
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	Circulo(){
		
	}
	
	public double area(){
		return Math.PI * Math.sqrt(this.raio);
	}
	
	public double comprimento() {
		return 2 * Math.PI * this.raio;
	}
	
	void setRaio(double raio) {
		this.raio = raio;
	}
	
	double getRaio() {
		return this.raio;
	}
}
