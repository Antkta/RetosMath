import java.util.HashMap;

public class TablaNueve {

    HashMap<String, Integer> TablaNueve = new HashMap<>();

    public TablaNueve(){

        TablaNueve.put("Nueve por Uno", 9);
        TablaNueve.put("Nueve por Dos", 18);
        TablaNueve.put("Nueve por Tres", 27);
        TablaNueve.put("Nueve por Cuatro", 36);
        TablaNueve.put("Nueve por Cinco", 45);
        TablaNueve.put("Nueve por Seis", 54);
        TablaNueve.put("Nueve por Siete", 63);
        TablaNueve.put("Nueve por Ocho", 72);
        TablaNueve.put("Nueve por Nueve", 81);
        TablaNueve.put("Nueve por Diez", 90);

 }

    public HashMap<String, Integer> getTablaNueve() {
        return TablaNueve;
    }
}