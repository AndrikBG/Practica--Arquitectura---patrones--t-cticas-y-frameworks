package mx.uam.is.practicadiseno;

public class Manejador {

	// La estructura que contiene los datos
	private String[] datos;
	private int i = 3;

	/**
	 * Constructor que inicializa con algunos datos
	 *
	 */
	public Manejador() {
		datos = new String[10];
		datos[0] = "Dato 1";
		datos[1] = "Dato 2";
		datos[2] = "Dato 3";
	}

	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		return datos;
	}

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
		// Validar que el dato no esté vacío
		if (dato == null || dato.isEmpty()) {
			return false;
		}

		// Validar que no esté ya en la lista
		for (int j = 0; j < i; j++) {
			if (datos[j] != null && datos[j].equals(dato)) {
				return false;
			}
		}

		// Validar que haya espacio
		if (i < datos.length) {
			datos[i] = dato;
			i++;
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
		for (int j = 0; j < i; j++) {
			if (datos[j] != null && datos[j].equals(dato)) {
				// Desplazar elementos hacia la izquierda
				for (int k = j; k < i - 1; k++) {
					datos[k] = datos[k + 1];
				}
				datos[i - 1] = null;
				i--;
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza() {
		System.exit(0);
	}
}
