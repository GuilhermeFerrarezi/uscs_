package semana4;

public class Computador {
	
	private String n_serie;
	private Teclado teclado;
	private Mouse mouse;
	private Monitor monitor;
	private Gabinete gabinete;
	
	Computador(String n_serie, Teclado teclado, Mouse mouse, Monitor monitor, Gabinete gabinete){
		this.n_serie = n_serie;
		this.teclado = teclado;
		this.mouse = mouse;
		this.monitor = monitor;
		this.gabinete = gabinete;
	}
	
	Computador(){
		
	}
	
	void setN_serie(String n_serie){
		this.n_serie = n_serie;
	}
	
	void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	
	void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
	
	String getN_serie() {
		return this.n_serie;
	}
	
	Teclado getTeclado() {
		return this.teclado;
	}
	
	Mouse getMouse() {
		return this.mouse;
	}
	
	Monitor getMonitor() {
		return this.monitor;
	}
	
	Gabinete getGabinete() {
		return this.gabinete;
	}
	
	void imprimeComputador() {
		System.out.println("Número de série: " + this.n_serie + "\n\nTeclado:" + this.teclado.imprimeTeclado(false) + "\n\nMouse: " + this.mouse.imprimeMouse(false) + "\n\nMonitor: " + this.monitor.imprimeMonitor(false) + "\n\nGabinete: " + this.gabinete.imprimeGabinete(false));
	}
}
