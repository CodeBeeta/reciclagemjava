package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//tipos num�ricos inteiros
		
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		//usar o L no final, informa que ele n�o � um inteiro, que � como os n�meros literais s�o interpretados
		//e sim um long
		long pontosAcumulados= 3_134_845_223L; 
		
		//aqui a mesma coisa, F para dizer que � float
		//isso por que o Java n�o analisa o valor e sim o tipo
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = true;
		
		char status = 'A';
		//char unicode = '\u0010'; //pode por que � UM simbolo na tabela Unicode
		
		//Dias de Empresa
		System.out.println(anosEmpresa *365);
		
		//N�mero de viagens
		System.out.println(numeroVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		
		System.out.println("F�rias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
	
}
