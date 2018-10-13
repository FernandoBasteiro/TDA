package implementacion;

import tda.TDACola;

public class ColaDinamica implements TDACola {
	NodoCola primero;
	public void acolar(int valor) {
		NodoCola aux = new NodoCola();
		aux.valor = valor;
		aux.sig = null;
		if (primero == null) {
			primero = aux;
		}
		else {
			NodoCola recorre = primero;
			while (recorre.sig != null)
				recorre = recorre.sig;
			recorre.sig = aux;
		}
		
	}

	public void desacolar() {
		primero = primero.sig;

	}

	public int primero() {
		return primero.valor;
	}

	public void inicializar() {
		primero = null;

	}

	public boolean colaVacia() {
		return primero == null;
	}

}

class NodoCola {
	int valor;
	NodoCola sig;
}
