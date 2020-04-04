package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota = 0, total = 0;
		int qtd = 0;
		while (nota!=-1) {
			System.out.println("Digite a Nota: ");
			nota = Double.parseDouble(entrada.nextLine());
			
			if(nota<10&&nota >=0) {
				total += nota;
				qtd++;
			}else if(nota != -1) {
				System.out.println("Nota inválida, digite novamente");
			}
			
			
		}
		System.out.println("Média das Notas: " + total/qtd);

		entrada.close();
	}
}
