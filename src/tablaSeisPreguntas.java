import java.util.HashMap;
import java.util.Map;

public enum tablaSeisPreguntas {

    SeisporUno(6), SeisporDos(12), SeisporTres(18), SeisporCuatro(24), SeisporCinco(30), SeisporSeis(36), SeisporSiete(42), SeisporOcho(48), SeisporNueve(54), SeisporDiez(60);


    private int value;
    private static Map map = new HashMap<>();

    private tablaSeisPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaSeisPreguntas tablaSeispreguntas : tablaSeisPreguntas.values()) {
            map.put(tablaSeispreguntas.value, tablaSeispreguntas);
        }
    }

    public static tablaSeisPreguntas valueOf(int tablaSeispreguntas) {
        return (tablaSeisPreguntas) map.get(tablaSeispreguntas);
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
