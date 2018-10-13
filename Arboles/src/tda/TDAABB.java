package tda;

public interface TDAABB {
	
	public void inicializar();
	
	/** Inicializado */
	public void agregar (int valor);
	
	/** Inicializado */
	public void eliminar (int valor);
	
	/** Inicializado y No vacio */
	public int raiz();
	
	/** Inicializado */
	public boolean arbolVacio();
	
	/** Inicializado y No vacio */
	public TDAABB hijoIzquierdo();
	
	/** Inicializado y No vacio */
	public TDAABB hijoDerecho();
	
}
