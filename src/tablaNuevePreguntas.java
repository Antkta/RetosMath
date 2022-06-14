import java.util.HashMap;
import java.util.Map;

public enum tablaNuevePreguntas {

    NueveporUno(9), NueveporDos(18), NueveporTres(27), NueveporCuatro(36), NueveporCinco(45), NueveporSeis(54), NueveporSiete(63), NueveporOcho(72), NueveporNueve(81), NueveporDiez(90);

    private int value;
    private static Map map = new HashMap<>();

    private tablaNuevePreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaNuevePreguntas tablaNuevepreguntas : tablaNuevePreguntas.values()) {
            map.put(tablaNuevepreguntas.value, tablaNuevepreguntas);
        }
    }

    public static tablaNuevePreguntas valueOf(int tablaNuevepreguntas) {
        return (tablaNuevePreguntas) map.get(tablaNuevepreguntas);
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
