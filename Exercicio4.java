import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio4 {

	/*
	 * Faça um programa que crie peça para o usuário digitar uma frase. Em seguida,
	 * mostre a quantidade de vezes que cada caractere aparece na frase. Utilize a
	 * coleção HashMap para esta tarefa.
	 */

	public static void main(String[] args) {

		Map<Character, Integer> mapa = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();

		for (Character c : frase.toCharArray()) {
			if (mapa.containsKey(mapa)) {
				Integer quantidadeAnterior = mapa.get(c);
				quantidadeAnterior = mapa.get(c);
				mapa.put(c, quantidadeAnterior);
			} else {
				mapa.put(c, 1);
			}

		}
		System.out.println(mapa);
		sc.close();

	}
}

/*
 * Scanner sc = new Scanner(System.in); String f = sc.nextLine(); Map<String,
 * Integer> map = contar(f.replace(" ", "").toLowerCase()); Imprimir(map);
 * sc.close(); }
 * 
 * public static Map<String, Integer> contar(String frase) { Map<String,
 * Integer> map = new TreeMap<>(); for (char item : frase.toCharArray()) {
 * Integer s = map.get(String.valueOf(item)); if (s != null) {
 * map.put(String.valueOf(item), ++s); } else { map.put(String.valueOf(item),
 * 1); } } return map; }
 * 
 * public static void Imprimir(Map<String, Integer> items) { for
 * (Map.Entry<String, Integer> a : items.entrySet()) {
 * System.out.println(a.getKey() + ": " + a.getValue()); } }
 */