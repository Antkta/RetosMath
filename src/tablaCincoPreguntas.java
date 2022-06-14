import java.util.HashMap;
import java.util.Map;

public enum tablaCincoPreguntas {


    CincoporUno(5), CincoporDos(10), CincoporTres(15), CincoporCuatro(20), CincoporCinco(25), CincoporSeis(30), CincoporSiete(35), CincoporOcho(40), CincoporNueve(45), CincoporDiez(50);


    private int value;
    private static Map map = new HashMap<>();

    private tablaCincoPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaCincoPreguntas tablaCincopreguntas : tablaCincoPreguntas.values()) {
            map.put(tablaCincopreguntas.value, tablaCincopreguntas);
        }
    }

    public static tablaCincoPreguntas valueOf(int tablaCincopreguntas) {
        return (tablaCincoPreguntas) map.get(tablaCincopreguntas);
    }

    public int getValue() {
        return value;
    }

    /* Con el código anterior,estamos intentando obtener la el resultado a partir de la pregunta,
    pero también obtener la pregunta a partir del resultado.
    Usamos un mapa internamente que maneje el mapeo de un
    número entero a su pregunta correspondiente.
    Esto se hace en un método estático, que itera a través de los valores dentro de la respuesta
     y los agrega al mapa. También hay un constructor privado donde asignamos el valor pasado a una variable.
    Esto se hace automáticamente al usar una enumeración debido al paréntesis después de cada nombre de enumeración.
     */


}
