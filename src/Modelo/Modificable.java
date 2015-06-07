package Modelo;

import java.io.Serializable;

public interface Modificable extends Serializable {

	/**
	 * Objeto que identifica a este {@link Modificable}
	 * 
	 * @return
	 */
	public Object identificador();

}
