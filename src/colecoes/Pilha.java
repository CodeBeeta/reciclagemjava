package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O pequeno príncipe"); //retorna true ou false
		livros.push("Don Quixote"); //retorna erro caso a pilha estiver cheia
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros);
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
	}

}
