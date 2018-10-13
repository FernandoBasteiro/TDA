package tda;

public interface TDADiccionarioMultiple {

	public void inicializar();
	
	/** Inicializado */
	public void agregar (int clave, int valor);
	
	/** Inicializado */
	public void eliminar (int clave);
	
	/** Inicializado */
	public TDAConjunto claves();
	
	/** Inicializado */
	public TDAConjunto recuperar (int clave);
	
	/** Inicializado */
	public void eliminarValor (int clave, int valor);
	
}
