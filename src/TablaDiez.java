import java.util.HashMap;

public class TablaDiez {

    HashMap<String, Integer> TablaDiez = new HashMap<>();

    public TablaDiez(){

        TablaDiez.put("Diez por Uno", 10);
        TablaDiez.put("Diez por Dos", 20);
        TablaDiez.put("Diez por Tres", 30);
        TablaDiez.put("Diez por Cuatro", 40);
        TablaDiez.put("Diez por Cinco", 50);
        TablaDiez.put("Diez por Seis", 60);
        TablaDiez.put("Diez por Siete", 70);
        TablaDiez.put("Diez por Ocho", 80);
        TablaDiez.put("Diez por Nueve", 90);
        TablaDiez.put("Diez por Diez", 100);

 }

    public HashMap<String, Integer> getTablaDiez() {
        return TablaDiez;
    }
}