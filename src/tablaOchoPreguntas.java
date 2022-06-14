import java.util.HashMap;
import java.util.Map;

public enum tablaOchoPreguntas {

    OchoporUno(8), OchoporDos(16), OchoporTres(24), OchoporCuatro(32), OchoporCinco(40), OchoporSeis(48), OchoporSiete(56), OchoporOcho(64), OchoporNueve(72), OchoporDiez(80);


    private int value;
    private static Map map = new HashMap<>();

    private tablaOchoPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaOchoPreguntas tablaOchopreguntas : tablaOchoPreguntas.values()) {
            map.put(tablaOchopreguntas.value, tablaOchopreguntas);
        }
    }

    public static tablaOchoPreguntas valueOf(int tablaOchopreguntas) {
        return (tablaOchoPreguntas) map.get(tablaOchopreguntas);
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
