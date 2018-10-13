package implementacion;

import tda.TDAColaPrioridad;

public class ColaPrioridadEstatica implements TDAColaPrioridad {
	
	private int cantidad;
	private int[] valores;
	private int[] prioridades;
	
	public void acolar(int valor, int prioridad) {
		for (int i = 0; i < cantidad; i++) {
			if (prioridades[i] < prioridad) {
				for (int j = cantidad; j>i; j--) {
					valores[j] = valores[j-1];
					prioridades[j] = prioridades[j-1];
				}
				valores[i] = valor;
				prioridades[i] = prioridad;
				cantidad++;
				return;
			}
		}
		valores[cantidad] = valor;
		prioridades[cantidad] = prioridad;
		cantidad++;
	}

	public void desacolar() {
		for (int i = 0; i < cantidad -1; i++) {
			valores[i] = valores[i+1];
			prioridades[i] = prioridades[i+1];
		}
		cantidad--;

	}

	public int primero() {
		// TODO Auto-generated method stub
		return valores[0];
	}

	public int prioridad() {
		// TODO Auto-generated method stub
		return prioridades[0];
	}

	public void inicializar() {
		// TODO Auto-generated method stub
		cantidad = 0;
		valores = new int[100];
		prioridades = new int[100];
	}

	public boolean colaVacia() {
		// TODO Auto-generated method stub
		return cantidad == 0;
	}

}
