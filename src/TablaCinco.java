import java.util.HashMap;

public class TablaCinco {

    private HashMap<String, Integer> tablaCinco = new HashMap<>();

    private void TablaCinco(){

        tablaCinco.put("Cinco por Uno", 5);
        tablaCinco.put("Cinco por Dos", 10);
        tablaCinco.put("Cinco por Tres", 15);
        tablaCinco.put("Cinco por Cuatro", 20);
        tablaCinco.put("Cinco por Cinco", 25);
        tablaCinco.put("Cinco por Seis", 30);
        tablaCinco.put("Cinco por Siete", 35);
        tablaCinco.put("Cinco por Ocho", 40);
        tablaCinco.put("Cinco por Nueve", 45);
        tablaCinco.put("Cinco por Diez", 50);

 }

    public HashMap<String, Integer> getTablaCinco() {
        return tablaCinco;
    }
}
