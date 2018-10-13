package tda;

public interface TDACola {
	/** Inicializada */
	public void acolar (int valor);
	
	/** Inicializada y No Vacia */
	public void desacolar();
	
	/** Inicializada y No Vacia */
	public int primero();
	
	public void inicializar();
	
	/** Inicializar */
	public boolean colaVacia();
}
