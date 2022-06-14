import java.util.HashMap;

public class TablaTres {

    private HashMap<String, Integer> tablaTres = new HashMap<>();

    private void TablaTres(){

        tablaTres.put("Tres por Uno", 3);
        tablaTres.put("Tres por Dos", 6);
        tablaTres.put("Tres por Tres", 9);
        tablaTres.put("Tres por Cuatro", 12);
        tablaTres.put("Tres por Cinco", 15);
        tablaTres.put("Tres por Seis", 18);
        tablaTres.put("Tres por Siete", 21);
        tablaTres.put("Tres por Ocho", 24);
        tablaTres.put("Tres por Nueve", 27);
        tablaTres.put("Tres por Diez", 30);

 }

    public HashMap<String, Integer> getTablaTres() {
        return tablaTres;
    }
}
