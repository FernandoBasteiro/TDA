package implementacion;

import tda.TDAConjunto;
import tda.TDADiccionarioMultiple;

public class DiccionarioMultipleDinamico implements TDADiccionarioMultiple {
	nodoClave primero;

	public void inicializar() {
		primero = null;
	}

	public void agregar(int clave, int valor) {
		if (primero == null) {
			primero = new nodoClave();
			primero.clave = clave;
			primero.sig = null;
			primero.primervalor = new nodoValor();
			primero.primervalor.valor = valor;
			primero.primervalor.sig = null;
		}
		else {
			nodoClave recorrer = primero;
			while (recorrer != null && recorrer.clave != clave)
				recorrer = recorrer.sig;
			if (recorrer == null) {
				recorrer = new nodoClave();
				recorrer.clave = clave;
				recorrer.sig = primero;
				recorrer.primervalor = new nodoValor();
				recorrer.primervalor.valor = valor;
				recorrer.primervalor.sig = null;
				primero = recorrer;
			}
			else {
				nodoValor valores = recorrer.primervalor;
				while (valores != null && valores.valor != valor)
					valores = valores.sig;
				if (valores == null) {
					valores = new nodoValor();
					valores.valor = valor;
					valores.sig = recorrer.primervalor;
					recorrer.primervalor = valores;
				}
			}
		}
	}

	public void eliminar(int clave) {
		if (primero != null) {
			if (primero.clave == clave)
				primero = primero.sig;
			else {
				nodoClave recorrer = primero;
				while (recorrer.sig != null && recorrer.sig.clave != clave)
					recorrer = recorrer.sig;
				if (recorrer.sig != null)
					recorrer.sig = recorrer.sig.sig;
			}
		}

	}

	public TDAConjunto claves() {
		TDAConjunto conjunto = new ConjuntoDinamico();
		conjunto.inicializar();
		nodoClave recorrer = primero;
		while (recorrer != null) {
			conjunto.agregar(recorrer.clave);
			recorrer = recorrer.sig;
		}
		return conjunto;
	}

	public TDAConjunto recuperar(int clave) {
		TDAConjunto conjunto = new ConjuntoDinamico();
		conjunto.inicializar();
		nodoClave recorrer = primero;
		while (recorrer != null && recorrer.clave != clave) {
			recorrer = recorrer.sig;
		}
		if (recorrer != null) {
			nodoValor valores = recorrer.primervalor;
			while (valores != null) {
				conjunto.agregar(valores.valor);
				valores = valores.sig;
			}
		}
		return conjunto;
	}

	public void eliminarValor(int clave, int valor) {

	}

}

class nodoValor {
	int valor;
	nodoValor sig;
}
class nodoClave {
	int clave;
	nodoValor primervalor;
	nodoClave sig;
}