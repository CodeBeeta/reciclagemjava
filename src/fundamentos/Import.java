package fundamentos;

import java.util.Date;
//ctrl + shif + O organiza os imports


public class Import {
	
	public static void main(String[] args) {
		//java.lang.String -> seria o caminho inteiro da "String", mas não preciso pq é o pacote mais básico
		//ficando disponível em todas as suas classes
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		//JButton botao = new JButton();
	}

}
