package algoritmos;

import tda.TDAColaPrioridad;

public class Algoritmo {
	
	public void mostrarColaDinamica(TDAColaPrioridad cola) {
		while (! cola.colaVacia()) {
			System.out.println("Valor " + cola.primero());
			System.out.println("Prioridad " + cola.prioridad());
			cola.desacolar();
		}
	}
}
