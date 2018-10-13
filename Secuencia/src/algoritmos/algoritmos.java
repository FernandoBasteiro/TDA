package algoritmos;
import tda.TDASecuencia;
import implementacion.SecuenciaDinamica;


public class algoritmos {
	public boolean busquedaBinaria(TDASecuencia secuencia, int valor) {
		boolean encontrado = false;
		if (secuencia.tamano() == 1) {
			if (valor == secuencia.valor(1)) {
				encontrado = true;
			}
		}
		else {
			if (valor <= secuencia.valor(secuencia.tamano() / 2)) {
				encontrado = busquedaBinaria(secuencia.subsecuencia(1, secuencia.tamano()/2), valor);
			}
			else {
				encontrado = busquedaBinaria(secuencia.subsecuencia((secuencia.tamano()/2)+1, secuencia.tamano()),valor);
			}
		}
		return encontrado;
	}
}
