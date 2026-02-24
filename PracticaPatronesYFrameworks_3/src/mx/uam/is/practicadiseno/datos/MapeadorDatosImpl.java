package mx.uam.is.practicadiseno.datos;

import java.util.ArrayList;
import java.util.List;

public class MapeadorDatosImpl implements MapeadorDatos {

    private List<String> datos;

    /**
     * Constructor que inicializa con una lista y algunos datos
     */
    public MapeadorDatosImpl() {
        datos = new ArrayList<>();
        datos.add("Entrada 1");
        datos.add("Entrada 2");
        datos.add("Entrada 3");
    }

    @Override
    public boolean agrega(String dato) {
        if (contiene(dato))
            return false;

        datos.add(dato);
        return true;
    }

    @Override
    public boolean borra(String dato) {
        return datos.remove(dato);
    }

    @Override
    public String[] dameDatos() {
        return datos.toArray(new String[0]);
    }

    

    @Override
    public boolean contiene(String dato) {
        return datos.contains(dato);
    }
}
