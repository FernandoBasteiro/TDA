package tda;

public interface TDADiccionarioSimple {
	
	public void inicializar();
	
	/** Inicializado */
	public void agregar (int clave, int valor);
	
	/** Inicializado */
	public void eliminar (int clave);
	
	/** Inicializado y la Clave existe */
	public int recuperar (int clave);
	
	/** Inicializado */
	public TDAConjunto claves();
	

}
