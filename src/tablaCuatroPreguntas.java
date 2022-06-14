import java.util.HashMap;
import java.util.Map;

public enum tablaCuatroPreguntas {

    CuatroporUno(4), CuatroporDos(8), CuatroporTres(12), CuatroporCuatro(16), CuatroporCinco(20), CuatroporSeis(24), CuatroporSiete(28), CuatroporOcho(32), CuatroporNueve(36), CuatroporDiez(40);


    private int value;
    private static Map map = new HashMap<>();

    private tablaCuatroPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaCuatroPreguntas tablaCuatropreguntas : tablaCuatroPreguntas.values()) {
            map.put(tablaCuatropreguntas.value, tablaCuatropreguntas);
        }
    }

    public static tablaCuatroPreguntas valueOf(int tablaCuatropreguntas) {
        return (tablaCuatroPreguntas) map.get(tablaCuatropreguntas);
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
