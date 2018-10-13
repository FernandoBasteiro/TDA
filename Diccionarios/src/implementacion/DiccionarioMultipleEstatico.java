package implementacion;

import tda.TDAConjunto;
import tda.TDADiccionarioMultiple;

public class DiccionarioMultipleEstatico implements TDADiccionarioMultiple {
	private int cantidad;
	private int[] claves;
	private int[] cant_valores;
	private int[][] valores;
	
	public void inicializar() {
	cantidad = 0;
	claves = new int[100];
	valores = new int[100][100];
	cant_valores = new int[100];
	}

	public void agregar(int clave, int valor) {
		int i = 0;
		while (i < cantidad && claves[i] != clave)
			i++;
		if (i == cantidad) {
			claves[i] = clave;
			cant_valores[i] = 0;
			cantidad++;
		}
		valores[i][cant_valores[i]] = valor;
		cant_valores[i]++;
	}

	public void eliminar(int clave) {
		int i = 0;
		while (i < cantidad && claves[i] != clave)
			i++;
		if (i < cantidad) {
			claves[i] = claves[cantidad-1];
			for (int j = 0; j < cant_valores[cantidad -1]; j++)
				valores[i][j] = valores[cantidad - 1][j];
			cant_valores[i] = cant_valores[cantidad -1];
			cantidad--;
		}
	}

	public TDAConjunto claves() {
		TDAConjunto aux = new Conjunto();
		aux.inicializar();
		for (int i = 0; i < cantidad; i++)
			aux.agregar(claves[i]);
		return aux;
	}

	public TDAConjunto recuperar(int clave) {
		int i = 0;
		TDAConjunto aux = new Conjunto();
		aux.inicializar();
		while (i < cantidad && claves[i] != clave)
			i++;
		if (i < cantidad) {
			for (int j = 0; j < cant_valores[i]; j++) {
				aux.agregar(valores[i][j]);
			}
		}
		return aux;
		
	}

	public void eliminarValor(int clave, int valor) {
		int i = 0;
		int j = 0;
		while (i < cantidad && claves[i] != clave)
			i++;
		if (i < cantidad) {
			if (cant_valores[i] == 1) {
				eliminar(clave);
			}
			else {
				while (j < cant_valores[i] && valores[i][j] != valor)
					j++;
				if (j < cant_valores[i]) {
					valores[i][j] = valores[i][cant_valores[i] - 1];
					cant_valores[i]--;
				}
			}
		}
	}

}
