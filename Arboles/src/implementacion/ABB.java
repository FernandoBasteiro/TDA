package implementacion;

import tda.TDAABB;

public class ABB implements TDAABB {
	private NodoABB raiz;
	
	public void inicializar() {
		raiz = null;
	}

	public void agregar(int valor) {
		if (raiz == null) {
			raiz = new NodoABB();
			raiz.valor = valor;
			raiz.hI = new ABB();
			raiz.hD = new ABB();
			raiz.hI.inicializar();
			raiz.hD.inicializar();
		}
		else {
			if (raiz.valor > valor)
				raiz.hI.agregar(valor);
			else
				if (raiz.valor < valor)
					raiz.hD.agregar(valor);
		}
	}

	public void eliminar(int valor) {
		if (raiz != null) {
			if (raiz.valor == valor && raiz.hI.arbolVacio() && raiz.hD.arbolVacio())
				raiz = null;
			else {
				if (raiz.valor == valor && ! raiz.hI.arbolVacio()) {
					raiz.valor = mayor(raiz.hI);
					raiz.hI.eliminar(raiz.valor);
				}
				else {
					if (raiz.valor == valor && ! raiz.hD.arbolVacio()) {
						raiz.valor = menor (raiz.hD);
						raiz.hD.eliminar(raiz.valor);
					}
					else {
						if (raiz.valor > valor)
							raiz.hI.eliminar(valor);
						else {
							if (raiz.valor < valor)
								raiz.hD.eliminar(valor);
						}
					}
				}
			}
		}
	}
	
	public int raiz() {
		return raiz.valor;
	}

	public boolean arbolVacio() {
		return raiz == null;
	}

	public TDAABB hijoIzquierdo() {
		return raiz.hI;
	}

	public TDAABB hijoDerecho() {
		return raiz.hD;
	}
	
	private int mayor (TDAABB arbol) {
		if (arbol.hijoDerecho().arbolVacio())
			return arbol.raiz();
		else
			return mayor(arbol.hijoDerecho());
	}
	
	private int menor (TDAABB arbol) {
		if (arbol.hijoIzquierdo().arbolVacio())
			return arbol.raiz();
		else
			return menor(arbol.hijoIzquierdo());
	}
}

class NodoABB {
	int valor;
	TDAABB hI;
	TDAABB hD;
}
