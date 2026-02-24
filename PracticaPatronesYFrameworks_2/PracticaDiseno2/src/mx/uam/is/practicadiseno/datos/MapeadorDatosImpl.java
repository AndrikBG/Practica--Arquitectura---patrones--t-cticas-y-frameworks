package mx.uam.is.practicadiseno.datos;

public class MapeadorDatosImpl implements MapeadorDatos {


    private String[] datos;
    private int contador;

    /**
     * Constructor que inicializa con un arreglo y algunos datos
     */
    public MapeadorDatosImpl() {
        datos = new String[10]; // Capacidad inicial
        contador = 0;
        agrega("Entrada 1");
        agrega("Entrada 2");
        agrega("Entrada 3");
    }

    @Override
    public boolean agrega(String dato) {
        if (contiene(dato))
            return false;

        // Redimensionar si está lleno
        if (contador == datos.length) {
            String[] nuevoArreglo = new String[datos.length * 2];
            System.arraycopy(datos, 0, nuevoArreglo, 0, datos.length);
            datos = nuevoArreglo;
        }

        datos[contador++] = dato;
        return true;
    }

    @Override
    public boolean borra(String dato) {
        for (int i = 0; i < contador; i++) {
            if (datos[i].equals(dato)) {
                // Desplazar elementos a la izquierda
                for (int j = i; j < contador - 1; j++) {
                    datos[j] = datos[j + 1];
                }
                datos[--contador] = null; // Limpiar última posición
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] dameDatos() {

        String[] copia = new String[contador];
        System.arraycopy(datos, 0, copia, 0, contador);
        return copia;
    }

    @Override
    public boolean contiene(String dato) {
        for (int i = 0; i < contador; i++) {
            if (datos[i].equals(dato))
                return true;
        }
        return false;
    }
}
