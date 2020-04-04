package Arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Quantas notas por aluno? ");
		int qtdeNotas = Integer.parseInt(entrada.nextLine());
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		double total = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma.length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
				notasDaTurma[a][n] = Double.parseDouble(entrada.nextLine());
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);
		entrada.close();
		
	}
	
}
