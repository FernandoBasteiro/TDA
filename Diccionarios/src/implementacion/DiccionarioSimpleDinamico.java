package implementacion;

import tda.TDAConjunto;
import tda.TDADiccionarioSimple;

public class DiccionarioSimpleDinamico implements TDADiccionarioSimple {
	nodoDiccionario primero;

	public void inicializar() {
		primero = null;
	}

	public void agregar(int clave, int valor) {
		if (primero == null) {
			primero = new nodoDiccionario();
			primero.clave = clave;
			primero.valor = valor;
			primero.sig = null;
		}
		else {
			nodoDiccionario recorrer = primero;
			while (recorrer.sig != null && recorrer.clave != clave) {
				recorrer = recorrer.sig;
			}
			if (recorrer.clave == clave) {
				recorrer.valor = valor;
			}
			else {
				nodoDiccionario aux = new nodoDiccionario();
				aux.clave = clave;
				aux.valor = valor;
				aux.sig = null;
				recorrer.sig = aux;
			}
		}
	}

	public void eliminar(int clave) {
		if (primero != null) {
			if (primero.clave == clave)
				primero = primero.sig;
			else {
				nodoDiccionario recorrer = primero;
				while (recorrer.sig != null && recorrer.sig.clave != clave)
					recorrer = recorrer.sig;
				if (recorrer.sig != null)
					recorrer.sig = recorrer.sig.sig;
			}
		}
	}
	

	public int recuperar(int clave) {
		nodoDiccionario recorrer = primero;
		while (recorrer.clave != clave) {
			recorrer = recorrer.sig;
		}
		return recorrer.valor;
	}

	public TDAConjunto claves() {
		TDAConjunto conjunto = new ConjuntoDinamico();
		conjunto.inicializar();
		nodoDiccionario recorrer = primero;
		while (recorrer != null) {
			conjunto.agregar(recorrer.valor);
			recorrer = recorrer.sig;
		}
		return conjunto;
	}

}

class nodoDiccionario {
	int clave;
	int valor;
	nodoDiccionario sig;
}