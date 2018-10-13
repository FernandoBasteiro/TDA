package implementacion;

import tda.TDAConjunto;
import java.util.Random;

public class Conjunto implements TDAConjunto {
	private int cantidad;
	private int[] valores;
	
	
	public void inicializar() {
		cantidad = 0;
		valores = new int[100];
	}

	public void agregar(int valor) {
		valores[cantidad] = valor;
		cantidad++;
	}

	public void eliminar(int valor) {
		boolean encontrado = false;
		for (int i = 0; i < cantidad; i++) {
			if (encontrado) {
				valores[i-1] = valores[i];
			}
			else {
				if (valores[i] == valor) {
					encontrado = true;
				}
			}
		}
		if (encontrado) {
			cantidad--;
		}
	}

	public int elegir() {
		Random r = new Random();
		return valores[r.nextInt(cantidad)];
	}

	public boolean conjuntoVacio() {
		return (cantidad == 0);
	}

	public boolean pertenece(int valor) {
		int i = 0;
		boolean encontrado = false;
		while (i < cantidad & ! encontrado) {
			encontrado = (valores[i] == valor);
		}
		return encontrado;
	}

}
