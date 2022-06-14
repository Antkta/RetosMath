import java.util.HashMap;
import java.util.Map;

public enum tablaSietePreguntas {


    SieteporUno(7), SieteporDos(14), SieteporTres(21), SieteporCuatro(28), SieteporCinco(35), SieteporSeis(42), SieteporSiete(49), SieteporOcho(56), SieteporNueve(63), SieteporDiez(70);


    private int value;
    private static Map map = new HashMap<>();

    private tablaSietePreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaSietePreguntas tablaSietepreguntas : tablaSietePreguntas.values()) {
            map.put(tablaSietepreguntas.value, tablaSietepreguntas);
        }
    }

    public static tablaSietePreguntas valueOf(int tablaSietepreguntas) {
        return (tablaSietePreguntas) map.get(tablaSietepreguntas);
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
