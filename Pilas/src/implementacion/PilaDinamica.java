package implementacion;

import tda.TDAPila;

public class PilaDinamica implements TDAPila {
	
	NodoPila tope;
	
	public void apilar(int valor) {
		NodoPila aux = new NodoPila();
		aux.valor = valor;
		aux.sig = tope;
		tope = aux;
	}

	public void desapilar() {
		tope = tope.sig;
	}

	public int tope() {
		return tope.valor;
	}

	public void inicializar() {
		tope = null;

	}

	public boolean pilaVacia() {
		return tope == null;
	}

}

class NodoPila {
	int valor;
	NodoPila sig;
}