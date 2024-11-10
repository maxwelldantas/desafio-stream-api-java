package maxwelldantas.com.github.desafios;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Desafio 2 - Imprima a soma dos números pares da lista:
 * <p>
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 * </p>
 */
public class Desafio2 {

	private static final Logger logger = Logger.getLogger(Desafio2.class.getName());

	public static void main(String[] args) {
		Optional<Integer> resultadoNumerosSomados = DesafioListaNumeros.NUMEROS.stream()
				.filter(n -> n % 2 == 0)
				.reduce(Integer::sum);

		resultadoNumerosSomados.ifPresent(resultado ->
				logger.log(Level.INFO, () -> "O resultado da soma dos números pares da lista é: " + resultado));
	}
}
