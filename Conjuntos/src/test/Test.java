package test;

import implementacion.ConjuntoDinamico;
import tda.TDAConjunto;
import algoritmos.Algoritmos;

public class Test {

	public static void main(String[] args) {
		Algoritmos a = new Algoritmos();
		TDAConjunto conjunto = new ConjuntoDinamico();
		int cantidad = 12;
		conjunto.inicializar();
		a.llenarConjunto(conjunto, cantidad);
		a.mostrarConjunto(conjunto);
		int abc = -7;
		
		
		int cba = abc / 2;
		System.out.println(-abc);
	}

}
