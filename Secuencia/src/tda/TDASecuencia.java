package tda;

public interface TDASecuencia {
	/** Inicializada */
	public void agregar (int valor);

	/** Inicializada */
	public void modificar (int posicion, int valor);

	/** Inicializada */
	public void concatenar (TDASecuencia secuencia);

	/** Inicializada */
	public int valor (int posicion);

	/** Inicializada */
	public TDASecuencia subsecuencia (int posInicial, int posFinal);

	/** Inicializada */
	public int tamano ();

	public void inicializar();
	}
