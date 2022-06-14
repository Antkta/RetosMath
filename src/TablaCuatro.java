import java.util.HashMap;

public class TablaCuatro {

    private HashMap<String, Integer> tablaCuatro = new HashMap<>();

    private void TablaCuatro(){

        tablaCuatro.put("Cuatro por Uno", 4);
        tablaCuatro.put("Cuatro por Dos", 8);
        tablaCuatro.put("Cuatro por Tres", 12);
        tablaCuatro.put("Cuatro por Cuatro", 16);
        tablaCuatro.put("Cuatro por Cinco", 20);
        tablaCuatro.put("Cuatro por Seis", 24);
        tablaCuatro.put("Cuatro por Siete", 28);
        tablaCuatro.put("Cuatro por Ocho", 32);
        tablaCuatro.put("Cuatro por Nueve", 36);
        tablaCuatro.put("Cuatro por Diez", 40);

 }

    public HashMap<String, Integer> getTablaCuatro() {
        return tablaCuatro;
    }
}
