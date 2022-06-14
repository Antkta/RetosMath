import java.util.HashMap;

public class TablaSeis {

    private HashMap<String, Integer> tablaSeis = new HashMap<>();

    private void TablaSeis(){

        tablaSeis.put("Seis por Uno", 6);
        tablaSeis.put("Seis por Dos", 12);
        tablaSeis.put("Seis por Tres", 18);
        tablaSeis.put("Seis por Cuatro", 24);
        tablaSeis.put("Seis por Cinco", 30);
        tablaSeis.put("Seis por Seis", 36);
        tablaSeis.put("Seis por Siete", 42);
        tablaSeis.put("Seis por Ocho", 48);
        tablaSeis.put("Seis por Nueve", 54);
        tablaSeis.put("Seis por Diez", 60);

 }

    public HashMap<String, Integer> getTablaSeis() {
        return tablaSeis;
    }
}