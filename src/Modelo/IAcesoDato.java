package Modelo;

import java.io.File;
import java.util.ArrayList;

public interface IAcesoDato extends AutoCloseable {

	/**
	 * Guardar� los {@link Modificable} a�adidos mediante el metodo
	 * {@link #addObjeto(Modificable)} en un archivo.
	 * 
	 * @param archivo
	 *            donde guardar los objetos
	 * @return true en caso de exito.
	 */
	public boolean guardarArray(File archivo);

	/**
	 * A�ade un objeto {@link Modificable} para ser guardado posteriormente.
	 * 
	 * @param objeto
	 *            a guardar
	 * @return true en caso de exito.
	 */
	public boolean addObjeto(Modificable objeto);

	/**
	 * Modifica un objeto
	 * 
	 * @param objeto
	 *            a modificar
	 * @return
	 */
	public boolean modificarObjeto(Modificable objeto, Object identificador);

	/**
	 * Carga todos los objetos leidos de archivo y los almacena internamente
	 * 
	 * @param archivo
	 *            a leer
	 */
	public void cargarObjetos(File archivo);

	/**
	 * Devuelve la lista de objetos
	 * 
	 * @return
	 */
	public ArrayList<Modificable> listarObjetos();
}
