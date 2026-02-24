package mx.uam.is.practicadiseno;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Crea el manejador
		Manejador manejador = new Manejador();

		// Crea la ventana y le pasa referencia
		Ventana ventana = new Ventana(manejador);

		// Muestra la ventana arrancando asi el programa
		ventana.setVisible(true);
	}

}
