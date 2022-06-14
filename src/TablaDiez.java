import java.util.HashMap;

public class TablaDiez {

    private HashMap<String, Integer> tablaDiez = new HashMap<>();

    private void TablaDiez(){

        tablaDiez.put("Diez por Uno", 10);
        tablaDiez.put("Diez por Dos", 20);
        tablaDiez.put("Diez por Tres", 30);
        tablaDiez.put("Diez por Cuatro", 40);
        tablaDiez.put("Diez por Cinco", 50);
        tablaDiez.put("Diez por Seis", 60);
        tablaDiez.put("Diez por Siete", 70);
        tablaDiez.put("Diez por Ocho", 80);
        tablaDiez.put("Diez por Nueve", 90);
        tablaDiez.put("Diez por Diez", 100);

 }

    public HashMap<String, Integer> getTablaDiez() {
        return tablaDiez;
    }
}