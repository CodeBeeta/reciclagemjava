package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		//%n também pula linha
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		
		System.out.printf("Salário: %.1f %n", 123.5678);
		
		Scanner entrada = new Scanner(System.in); //define que estou escaneando o que entrar no teclado
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
	
		System.out.println("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos %n ", nome, sobrenome, idade);
		entrada.close();
	}

}
