package algoritmos;

import tda.TDAPila;

public class Algoritmo {
	/** Inicializada */
	public void mostrarPila(TDAPila pila) {
		while (! pila.pilaVacia()) {
			System.out.println(pila.tope());
			pila.desapilar();
		}
			
	}
	
}
