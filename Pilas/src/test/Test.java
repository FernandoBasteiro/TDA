package test;

import algoritmos.Algoritmo;
import implementacion.PilaDinamica;
import tda.TDAPila;

public class Test {

	public static void main(String[] args) {
	TDAPila pila = new PilaDinamica();
	pila.inicializar();
	pila.apilar(10);
	pila.apilar(5);
	pila.apilar(33);
	pila.apilar(123);
	pila.apilar(12);
	
	Algoritmo a = new Algoritmo();
	a.mostrarPila(pila);
	}

}
