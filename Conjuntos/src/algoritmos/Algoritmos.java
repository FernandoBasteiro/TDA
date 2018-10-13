package algoritmos;

import java.util.Random;

import tda.TDAConjunto;

public class Algoritmos {
	
	/** Muestra todos los elementos del conjunto. Destruye el conjunto */
	public void mostrarConjunto(TDAConjunto conjunto) {
		int temp;
		while (! conjunto.conjuntoVacio()) {
			temp = conjunto.elegir();
			System.out.println(temp);
			conjunto.eliminar(temp);
		}
	}
	
	/** Agrega "cantValores" elementos (Entre 0 y 63) al conjunto */
	public void llenarConjunto(TDAConjunto conjunto, int cantValores) {
		Random r = new Random();
		int aux;
		for (int i = 0; i < cantValores; i++){
			aux = r.nextInt(64);
			System.out.println("Agregando: " + aux);
			conjunto.agregar(aux);
		}
	}
	

}
