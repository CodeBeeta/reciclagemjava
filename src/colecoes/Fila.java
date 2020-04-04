package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //ele gera erro se não consegue adicionar
		fila.offer("Bia");// ele vê o tamanho da fila e só adiciona quando tem espaço, retorna boolean
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // retorna nulo em caso de fila vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //estoura erro em caso de fila vazia
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll()); //pega o primeiro elemento da fila, removendo
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.poll()); //caso vazio retorna null
		//System.out.println(fila.remove); //caso vazio estoura erro;
		
		
	}
}
