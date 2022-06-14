import java.util.HashMap;

public class TablaTres {

    HashMap<String, Integer> TablaTres = new HashMap<>();

    public TablaTres(){

        TablaTres.put("Tres por Uno", 3);
        TablaTres.put("Tres por Dos", 6);
        TablaTres.put("Tres por Tres", 9);
        TablaTres.put("Tres por Cuatro", 12);
        TablaTres.put("Tres por Cinco", 15);
        TablaTres.put("Tres por Seis", 18);
        TablaTres.put("Tres por Siete", 21);
        TablaTres.put("Tres por Ocho", 24);
        TablaTres.put("Tres por Nueve", 27);
        TablaTres.put("Tres por Diez", 30);

 }

    public HashMap<String, Integer> getTablaTres() {
        return TablaTres;
    }
}
