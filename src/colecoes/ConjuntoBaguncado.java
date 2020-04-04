package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// converte automaticamente do tipo primitivo pro wrapper

		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho é" + conjunto.size());

		conjunto.add("Teste");
		System.out.println("Tamanho é" + conjunto.size()); // é igual, n aceita repetição

		System.out.println(conjunto.remove("teste")); // retorna falso, teste com t minusculo n existe
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains("Teste"));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//conjunto.addAll(nums); //união entre conjuntos
		conjunto.retainAll(nums); //intercecção, apenas valor que tem nos dois
		System.out.println(conjunto);
		
		
	}

}
