package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//tipos numéricos inteiros
		
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		//usar o L no final, informa que ele não é um inteiro, que é como os números literais são interpretados
		//e sim um long
		long pontosAcumulados= 3_134_845_223L; 
		
		//aqui a mesma coisa, F para dizer que é float
		//isso por que o Java não analisa o valor e sim o tipo
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = true;
		
		char status = 'A';
		//char unicode = '\u0010'; //pode por que é UM simbolo na tabela Unicode
		
		//Dias de Empresa
		System.out.println(anosEmpresa *365);
		
		//Número de viagens
		System.out.println(numeroVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
	
}
