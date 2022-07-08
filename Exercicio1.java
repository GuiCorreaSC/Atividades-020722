import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	/*
	 * Faça um programa que crie uma lista com 50 números inteiros aleatórios e
	 * depois exiba-os ordenados do menor para o maior
	 */

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		Random r = new Random();

		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
		}

		Collections.sort(lista);

		System.out.println(lista);

	}

}
