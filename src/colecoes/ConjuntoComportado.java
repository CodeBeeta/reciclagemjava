package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		SortedSet<String> listaAprovados = new TreeSet<>(); //minha lista obrigatóriamente é do tipo String
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.err.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>(); //minha lista obrigatóriamente é do tipo String
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (Integer n : nums) {
			System.out.println(n);
		}
		
		
	}

}
