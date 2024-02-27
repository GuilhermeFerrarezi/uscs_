package ex8;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de registros desejados:");
		int qtd = entrada.nextInt();
		int soma = 0;
		for(int i = qtd; i > 0; i--){
			int idade = entrada.nextInt();
			entrada.next();
			soma += idade;
		}
		entrada.close();
		System.out.println(soma / qtd);
	}
}
