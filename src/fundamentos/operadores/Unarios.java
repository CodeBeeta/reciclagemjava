package fundamentos.operadores;

public class Unarios {
	
 public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; //a = a+1;
		a--; // a = a-1;
		
		++b; // b = b=1;
		--b; //b = b+1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio");
		System.out.println(++a == b--);
		// o b--, posfixado, só será decremendado DEPOIS da comparação. por isso, dando true
		System.out.println(a);
		System.out.println(b);
		
}

}
