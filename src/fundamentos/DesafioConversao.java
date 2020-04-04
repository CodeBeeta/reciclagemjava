package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		String salario1, salario2, salario3;
		double salarioConv1, salarioConv2, salarioConv3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario: ");
		salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario: ");
		salario3 = entrada.nextLine().replace(",", ".");

		salarioConv1 = Double.parseDouble(salario1);
		salarioConv2 = Double.parseDouble(salario2);
		salarioConv3 = Double.parseDouble(salario3);
		
		System.out.println("A Média Salarial é de: R$" + (salarioConv1+salarioConv2+salarioConv3)/3);
		
		
		entrada.close();
		
		
	}

}
