package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.6;
		String resultadoRecuperacao = media >=5.0 ? "em recupera��o" : "reprovado";
		String resultado = media >=7.0? 
				"aprovado" : "em recupera��o";
		
		System.out.println("O Aluno est� " + resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoDesconto = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("Tem Desconto? " + resultadoDesconto);
		
	}
}
