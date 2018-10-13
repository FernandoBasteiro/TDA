package tda;

public interface TDAColaPrioridad {
	/** Inicializada */
	public void acolar (int valor, int prioridad);
	
	/** Inicializada y No Vacia */
	public void desacolar();
	
	/** Inicializada y No Vacia */
	public int primero();
	
	/** Inicializada y No Vacia */
	public int prioridad();
	
	public void inicializar();
	
	/** Inicializar */
	public boolean colaVacia();
}
