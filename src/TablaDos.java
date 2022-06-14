import java.util.HashMap;

public class TablaDos {

    private HashMap<String, Integer> tablaDos = new HashMap<>();

    private void TablaDos(){

        tablaDos.put("Dos por Uno", 2);
        tablaDos.put("Dos por Dos", 4);
        tablaDos.put("Dos por Tres", 6);
        tablaDos.put("Dos por Cuatro", 8);
        tablaDos.put("Dos por Cinco", 10);
        tablaDos.put("Dos por Seis", 12);
        tablaDos.put("Dos por Siete", 14);
        tablaDos.put("Dos por Ocho", 16);
        tablaDos.put("Dos por Nueve", 18);
        tablaDos.put("Dos por Diez", 20);


    }

    public HashMap<String, Integer> getTablaDos() {
        return tablaDos;
    }

}
