
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {

	/*
	 * Faça um programa que crie uma lista com 50 números inteiros com valor máximo
	 * 10. Mostre a lista e, em seguida, mostre apenas os números não repetidos
	 * contidos na lista. Não utilize nenhuma estrutura de repetição para fazer essa
	 * tarefa.
	 */

	public static void main(String[] args) {
		Set<Integer> lista2 = new HashSet<>();

		Random r = new Random();

		for (int i = 0; i < 50; i++) {
			lista2.add(r.nextInt(10));
		}

		System.out.println(lista2);

	}

}
