package fundamentos;

import java.util.Date;
//ctrl + shif + O organiza os imports


public class Import {
	
	public static void main(String[] args) {
		//java.lang.String -> seria o caminho inteiro da "String", mas n�o preciso pq � o pacote mais b�sico
		//ficando dispon�vel em todas as suas classes
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		//JButton botao = new JButton();
	}

}
