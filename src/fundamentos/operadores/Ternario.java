package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.6;
		String resultadoRecuperacao = media >=5.0 ? "em recuperação" : "reprovado";
		String resultado = media >=7.0? 
				"aprovado" : "em recuperação";
		
		System.out.println("O Aluno está " + resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoDesconto = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem Desconto? " + resultadoDesconto);
		
	}
}
