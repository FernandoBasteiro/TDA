package implementacion;

import tda.TDACola;

public class ColaEstatica implements TDACola {

	private int cantidad;
	private int[] valores;
	
	public void acolar(int valor) {
		valores[cantidad++] = valor;
	}

	public void desacolar() {
		cantidad--;
		for (int i = 0; i < cantidad; i++) {
			valores[i] = valores[i+1];
		}
	}

	public int primero() {
		return valores[0];
	}

	public void inicializar() {
		cantidad = 0;
		valores = new int[100];
	}

	public boolean colaVacia() {
		return cantidad == 0;
	}

}
