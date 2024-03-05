package semana2;

public class TestaPessoa {
	
	public static void main(String[] args){
		
		Pessoa pessoa1 = new Pessoa("Ana Souza", 31);
		Pessoa pessoa2 = new Pessoa("Bia Nunes", 25);
		Pessoa pessoa3 = new Pessoa("Paulo Santos", 45);
		
		System.out.println("Primeira pessoa:");
		pessoa1.Imprime();
		System.out.println();
		System.out.println("Segunda pessoa:");
		pessoa2.Imprime();
		System.out.println();
		System.out.println("Terceira pessoa:");
		pessoa3.Imprime();
	}
}
