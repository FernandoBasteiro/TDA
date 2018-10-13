package implementacion;

import tda.TDAColaPrioridad;

public class ColaPrioridadDinamica implements TDAColaPrioridad {
	NodoColaPrioridad primero;

	public void acolar(int valor, int prioridad) {
		NodoColaPrioridad aux = new NodoColaPrioridad();
		aux.valor = valor;
		aux.prioridad = prioridad;
		
		if (primero == null || primero.prioridad < aux.prioridad) {
			aux.sig = primero;
			primero = aux;
		}
		else {
			NodoColaPrioridad recorre = primero;
			while (recorre.sig != null && aux.prioridad < recorre.sig.prioridad) {
				recorre = recorre.sig;
			}
			aux.sig = recorre.sig;
			recorre.sig = aux;
		}
	}

	public void desacolar() {
		primero = primero.sig;
	}

	public int primero() {
		return primero.valor;
	}

	public int prioridad() {
		return primero.prioridad;
	}

	public void inicializar() {
		primero = null;
	}

	public boolean colaVacia() {
		return (primero == null);
	}
	
}

class NodoColaPrioridad {
	int valor;
	int prioridad;
	NodoColaPrioridad sig;
}
