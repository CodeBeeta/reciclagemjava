package Arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;

		System.out.println("Quantas notas: ");
		int quantidade = Integer.parseInt(entrada.nextLine());
		
		double[] nota = new double[quantidade];

		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota");
			nota[i] = Double.parseDouble(entrada.nextLine());
		}

		for (double notas : nota) {
			total += notas;
		}

		System.out.println("A média do aluno é: " + (total / nota.length));
		
		entrada.close();

	}

}
