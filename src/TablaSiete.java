import java.util.HashMap;

public class TablaSiete {

    private HashMap<String, Integer> tablaSiete = new HashMap<>();

    private void TablaSiete(){

        tablaSiete.put("Siete por Uno", 7);
        tablaSiete.put("Siete por Dos", 14);
        tablaSiete.put("Siete por Tres", 21);
        tablaSiete.put("Siete por Cuatro", 28);
        tablaSiete.put("Siete por Cinco", 35);
        tablaSiete.put("Siete por Seis", 42);
        tablaSiete.put("Siete por Siete", 49);
        tablaSiete.put("Siete por Ocho", 56);
        tablaSiete.put("Siete por Nueve", 63);
        tablaSiete.put("Siete por Diez", 70);

 }

    public HashMap<String, Integer> getTablaSiete() {
        return tablaSiete;
    }
}