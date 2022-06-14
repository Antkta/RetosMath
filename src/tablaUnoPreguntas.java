import java.util.HashMap;
import java.util.Map;

public enum tablaUnoPreguntas {

    UnoporUno(1), UnoporDos(2), UnoporTres(3), UnoporCuatro(4), UnoporCinco(5), UnoporSeis(6), UnoporSiete(7), UnoporOcho(8), UnoporNueve(9), UnoporDiez(10);


    private int value;
    private static Map map = new HashMap<>();

    private tablaUnoPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaUnoPreguntas tablaUnopreguntas : tablaUnoPreguntas.values()) {
            map.put(tablaUnopreguntas.value, tablaUnopreguntas);
        }
    }

    public static tablaUnoPreguntas valueOf(int tablaUnopreguntas) {
        return (tablaUnoPreguntas) map.get(tablaUnopreguntas);
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
