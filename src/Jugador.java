public class Jugador {

    private String nombre;
    private int puntaje;
    private int retosSuperados;

    private int tablasSuperadas;

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre=" + nombre +
                ", puntaje=" + puntaje +
                ", retosSuperados=" + retosSuperados +
                ", tablasSuperadas=" + tablasSuperadas +
                '}';
    }
}
