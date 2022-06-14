import java.util.HashMap;
import java.util.Map;

public enum tablaDiezPreguntas {


    DiezporUno(10), DiezporDos(20), DiezporTres(30), DiezporCuatro(40), DiezporCinco(50), DiezporSeis(60), DiezporSiete(70), DiezporOcho(80), DiezporNueve(90), DiezporDiez(100);


    private int value;
    private static Map map = new HashMap<>();

    private tablaDiezPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaDiezPreguntas tablaDiezpreguntas : tablaDiezPreguntas.values()) {
            map.put(tablaDiezpreguntas.value, tablaDiezpreguntas);
        }
    }

    public static tablaDiezPreguntas valueOf(int tablaDiezpreguntas) {
        return (tablaDiezPreguntas) map.get(tablaDiezpreguntas);
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
