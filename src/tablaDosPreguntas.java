import java.util.HashMap;
import java.util.Map;

public enum tablaDosPreguntas {



    DosporUno(2), DosporDos(4), DosporTres(6), DosporCuatro(8), DosporCinco(10), DosporSeis(12), DosporSiete(14), DosporOcho(16), DosporNueve(18), DosporDiez(20);


    private int value;
    private static Map map = new HashMap<>();

    private tablaDosPreguntas(int value) {
        this.value = value;
    }

    static {
        for (tablaDosPreguntas tablaDosPreguntas : tablaDosPreguntas.values()) {
            map.put(tablaDosPreguntas.value, tablaDosPreguntas);
        }
    }

    public static tablaDosPreguntas valueOf(int tablaDosPreguntas) {
        return (tablaDosPreguntas) map.get(tablaDosPreguntas);
    }

    public int getValue() {
        return value;
    }

}
