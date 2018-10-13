package implementacion;

import tda.TDAConjunto;
import tda.TDADiccionarioSimple;

public class DiccionarioSimpleEstatico implements TDADiccionarioSimple {
	private int cantidad;
	private int[] claves;
	private int[] valores;
	
	public void inicializar() {
		cantidad = 0;
		valores = new int[100];
		claves = new int[100];
	}

	public void agregar(int clave, int valor) {
		boolean encontrado;
		encontrado = false;
		for (int i = 0; i < cantidad; i++) {
			if (claves[i] == clave) {
				encontrado = true;
				valores[i] = valor;
			}
		}
		if (! encontrado) {
			claves[cantidad] = clave;
			valores[cantidad] = valor;
			cantidad++;
		}
	}

	public void eliminar(int clave) {
		for (int i = 0; i < cantidad; i++) {
			if (claves[i] == clave) {
				claves[i] = claves[cantidad - 1];
				valores[i] = valores[cantidad - 1];
				cantidad--;
			}
		}
	}

	public int recuperar(int clave) {
		for (int i = 0; i < cantidad; i++) {
			if (claves[i] == clave)
				return valores[i];
		}
		return 0;
	}

	public TDAConjunto claves() {
		TDAConjunto cjtoclaves = new Conjunto();
		cjtoclaves.inicializar();
		for (int i = 0; i < cantidad; i++)
			cjtoclaves.agregar(claves[i]);
		return cjtoclaves;
	}
}
