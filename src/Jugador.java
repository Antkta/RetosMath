public class Jugador {

    private final String nombre;
    private int puntaje;
    private int retosSuperados;

    private int tablasSuperadas;

    public Jugador(String nombre) {
        this.nombre = nombre;
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
