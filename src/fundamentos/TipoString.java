package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.087;
		
		System.out.println("Nome: "+nome+" Sobrenome: "+sobrenome);
		System.out.printf("O Senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome,idade,salario);
		
		System.out.println(String.format("\n 2 - O Senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome,idade,salario));
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,10));
		
		
		
	}

}
