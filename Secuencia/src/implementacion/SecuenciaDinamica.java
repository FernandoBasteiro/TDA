package implementacion;

import tda.TDASecuencia;

public class SecuenciaDinamica implements TDASecuencia {
	
	NodoSecuencia primero;
	int cantidad;

	public void agregar(int valor) {
		NodoSecuencia nuevo = new NodoSecuencia();
		NodoSecuencia aux = primero;
		nuevo.valor = valor;
		nuevo.siguiente = null;
		while (aux.siguiente != null) {
			aux = aux.siguiente;
		}
		aux.siguiente = nuevo;
	}

	public void modificar(int posicion, int valor) {
		NodoSecuencia aux = primero; 
		for (int i = 1; i < posicion; i++){
			aux = aux.siguiente;
		}
		aux.valor = valor;
	}

	public void concatenar(TDASecuencia secuencia) {
		for (int i = 1; i <= secuencia.tamano();i++) {
			agregar(secuencia.valor(i));
		}
	}

	public int valor(int posicion) {
		NodoSecuencia aux = primero; 
		for (int i = 1; i < posicion; i++) {
			aux = aux.siguiente;
		}
		return aux.valor;
	}

	public TDASecuencia subsecuencia(int posInicial, int posFinal) {
		TDASecuencia subsec = new SecuenciaDinamica();
		NodoSecuencia aux = primero;
		int ultimo;
		if (posFinal > cantidad) {
			ultimo = cantidad;
		}
		else {
			ultimo = posFinal;
		}
		for (int i = 1; i < posInicial; i++) {
			aux = aux.siguiente;
		}
		subsec.inicializar();
		for (int j = posInicial; j <= ultimo; j++) {
			subsec.agregar(aux.valor);
			aux = aux.siguiente;
		}
		return subsec;
	}

	public int tamano() {
		return cantidad;
	}

	public void inicializar() {
		primero = null;
		cantidad = 0;
	}
}

class NodoSecuencia {
	int valor;
	NodoSecuencia siguiente;
}