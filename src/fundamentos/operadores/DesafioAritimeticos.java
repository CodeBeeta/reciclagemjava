package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		//int a = 3 * 4 - 10;
		//double b = Math.pow(a, 3);
		//System.out.println(b);
		
		double parteCimaA, parteBaixoA, resultadoA, parteCimaB, parteBaixoB, resultadoB, divisorFinal, resultadoFinal;
		
		parteCimaA = 6 * (3+2);
		parteCimaA = Math.pow(parteCimaA, 2);
		parteBaixoA = 3*2;
		resultadoA = parteCimaA / parteBaixoA;
		
		parteCimaB = (1-5) * (2-7);
		parteBaixoB= 2;
		resultadoB = Math.pow((parteCimaB / parteBaixoB), 2);
		
		divisorFinal = Math.pow(10, 3);
		
		resultadoFinal = Math.pow((resultadoA - resultadoB), 3) / divisorFinal;
		
		System.out.println(resultadoFinal);
		
		
	}
}
