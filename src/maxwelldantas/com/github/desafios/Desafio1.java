package maxwelldantas.com.github.desafios;

import java.util.logging.Logger;

/**
 * Desafio 1 - Mostre a lista na ordem numérica:
 * <p>
 * Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */
public class Desafio1 {

	private static final Logger logger = Logger.getLogger(Desafio1.class.getName());

	public static void main(String[] args) {
		DesafioListaNumeros.NUMEROS.stream()
				.sorted()
				.forEach(n -> logger.info(String.valueOf(n)));
	}
}
