package tda;

public interface TDAConjunto {

	public void inicializar();
	
	/** Inicializado */
	public void agregar (int valor);
	
	/** Inicializado */
	public void eliminar (int valor);
	
	/** Inicializado y No Vacio */
	public int elegir();
	
	/** Inicializado */
	public boolean conjuntoVacio();
	
	/** Inicializado */
	public boolean pertenece(int valor);
}
