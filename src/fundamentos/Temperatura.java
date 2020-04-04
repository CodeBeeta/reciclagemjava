package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(F - 32) x 5/9 = C
		final double AJUSTE = 32;
		final double FATOR = 5.0/9;
		
		double f = 86;
		double c = (f - AJUSTE) * FATOR;
		System.out.println("O Resultado é "+c+"º");
		
		f=150;
		c = (f - AJUSTE) * FATOR;
		System.out.println("O Resultado é "+c+"º");
		
		
		
	}
	
}
