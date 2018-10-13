package implementacion;

import java.util.Random;

import tda.TDAConjunto;

public class ConjuntoDinamico implements TDAConjunto {
	NodoConjunto primero;
	int cantidad;
	
	public void inicializar() {
	primero = null;
	cantidad = 0;
	}

	public void agregar(int valor) {
		if (! pertenece(valor)) {
			NodoConjunto aux = new NodoConjunto();
			aux.valor = valor;
			aux.sig = primero;
			primero = aux;
			cantidad++;
		}
	}

	public void eliminar(int valor) {
		if (primero != null) {
			if (primero.valor == valor) {
				primero = primero.sig;
				cantidad--;
			}
			else {
				NodoConjunto recorre = primero;
				while (recorre.sig != null) {
					if (recorre.sig.valor == valor) {
						recorre.sig = recorre.sig.sig;
						cantidad--;
					}
					else {
					recorre = recorre.sig;
					}
				}
			}
		}
	}

	public int elegir() {
		Random r = new Random();
		int aux = r.nextInt(cantidad);
		NodoConjunto recorre = primero;
		for (int i = 0; i < aux; i++) {
			recorre = recorre.sig;
		}
		return recorre.valor;
	}

	public boolean conjuntoVacio() {
		return (primero == null);
	}

	public boolean pertenece(int valor) {
		boolean encontrado = false;
		NodoConjunto recorre = primero;
		while (! encontrado && recorre != null) {
			
			if (recorre.valor == valor) {
				encontrado = true;
			}
			else {
				recorre = recorre.sig;
			}
			
		}
		return encontrado;
	}

}

class NodoConjunto {
	int valor;
	NodoConjunto sig;
}