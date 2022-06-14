import java.util.HashMap;
import java.util.Map;

public enum tablaTresPreguntas {


    TresporUno(3), TresporDos(6), TresporTres(9), TresporCuatro(12), TresporCinco(15), TresporSeis(18), TresporSiete(21), TresporOcho(24), TresporNueve(27), TresporDiez(30);


    private int value;
    private static Map map = new HashMap<>();

    private tablaTresPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaTresPreguntas tablaTrespreguntas : tablaTresPreguntas.values()) {
            map.put(tablaTrespreguntas.value, tablaTrespreguntas);
        }
    }

    public static tablaTresPreguntas valueOf(int tablaTrespreguntas) {
        return (tablaTresPreguntas) map.get(tablaTrespreguntas);
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
