package mx.uam.is.practicadiseno.negocio;

public class ManejadorProxy implements  Manejador{
Manejador manejador;

    public ManejadorProxy(Manejador manejador) {
        this.manejador = manejador;
    }

    @Override
    public String[] dameDatos() {
        System.out.println("Se invoco el metodo dameDatos");
        return manejador.dameDatos();
    }

    @Override
    public boolean agrega(String dato) {
        System.out.println("Se invoco el metodo agrega");
        return manejador.agrega(dato);
    }

    @Override
    public boolean borra(String dato) {
        System.out.println("Se invoco el metodo borra");

        return manejador.borra(dato);
    }

    @Override
    public void finaliza() {
manejador.finaliza();
    }

    @Override
    public boolean agregaObservador(Observador o) {
        System.out.println("Se invoco el metodo agregaObservador");
        return manejador.agregaObservador(o);
    }

    @Override
    public boolean quitarObservador(Observador o) {
        System.out.println("Se invoco el metodo quitarObservador");
        return manejador.quitarObservador(o);
    }
}
