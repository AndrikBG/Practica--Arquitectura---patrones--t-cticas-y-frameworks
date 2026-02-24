package mx.uam.is.practicadiseno.negocio;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;

import java.util.ArrayList;
import java.util.List;

public class ManejadorImpl implements Manejador {
	List<Observador> observadores = new ArrayList<Observador>();
	private MapeadorDatos mapeador;

	/**
	 * Constructor que recibe el mapeador
	 */
	public ManejadorImpl(MapeadorDatos mapeador) {
		this.mapeador = mapeador;
	}

	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		System.out.println("Se invoco el metodo dameDatos desde ManejadorImpl");
		return mapeador.dameDatos();
	}

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
		System.out.println("Se invoco el metodo agrega desde ManejadorImpl");
		if (!dato.equals("") && !mapeador.contiene(dato)) {
			mapeador.agrega(dato);
			notifica();
			return true;
		}
		return false;
	}

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato) {
		System.out.println("Se invoco el metodo borra desde ManejadorImpl");
		boolean resultado = mapeador.borra(dato);
		if (resultado) {
			notifica();
		}
		return resultado;
	}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza() {
		System.out.println("Se invoco el metodo finaliza desde ManejadorImpl");
		System.exit(0);
	}

	public boolean agregaObservador(Observador o) {
		System.out.println("Se invoco el metodo agregaObservador desde ManejadorImpl");
		if (observadores.contains(o))
			return false;

		return observadores.add(o);
	}

	public boolean quitarObservador(Observador o) {
		System.out.println("Se invoco el metodo quitarObservador desde ManejadorImpl");
		if (observadores.isEmpty())
			return false;

		return observadores.remove(o);
	}

	public void notifica() {
		System.out.println("Se invoco el metodo notifica desde ManejadorImpl");
		for (Observador obsevador : observadores) {
			obsevador.actualiza();
		}
	}
}