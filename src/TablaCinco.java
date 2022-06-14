import java.util.HashMap;

public class TablaCinco {

    HashMap<String, Integer> TablaCinco = new HashMap<>();

    public TablaCinco(){

        TablaCinco.put("Cinco por Uno", 5);
        TablaCinco.put("Cinco por Dos", 10);
        TablaCinco.put("Cinco por Tres", 15);
        TablaCinco.put("Cinco por Cuatro", 20);
        TablaCinco.put("Cinco por Cinco", 25);
        TablaCinco.put("Cinco por Seis", 30);
        TablaCinco.put("Cinco por Siete", 35);
        TablaCinco.put("Cinco por Ocho", 40);
        TablaCinco.put("Cinco por Nueve", 45);
        TablaCinco.put("Cinco por Diez", 50);

 }

    public HashMap<String, Integer> getTablaCinco() {
        return TablaCinco;
    }
}
