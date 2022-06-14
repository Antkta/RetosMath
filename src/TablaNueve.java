import java.util.HashMap;

public class TablaNueve {

    private HashMap<String, Integer> tablaNueve = new HashMap<>();

    private void TablaNueve(){

        tablaNueve.put("Nueve por Uno", 9);
        tablaNueve.put("Nueve por Dos", 18);
        tablaNueve.put("Nueve por Tres", 27);
        tablaNueve.put("Nueve por Cuatro", 36);
        tablaNueve.put("Nueve por Cinco", 45);
        tablaNueve.put("Nueve por Seis", 54);
        tablaNueve.put("Nueve por Siete", 63);
        tablaNueve.put("Nueve por Ocho", 72);
        tablaNueve.put("Nueve por Nueve", 81);
        tablaNueve.put("Nueve por Diez", 90);

 }

    public static void values() {
    }

    public HashMap<String, Integer> getTablaNueve() {
        return tablaNueve;
    }
}