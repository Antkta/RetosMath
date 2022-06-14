import java.util.HashMap;

public class TablaSiete {

    HashMap<String, Integer> TablaSiete = new HashMap<>();

    public TablaSiete(){

        TablaSiete.put("Siete por Uno", 7);
        TablaSiete.put("Siete por Dos", 14);
        TablaSiete.put("Siete por Tres", 21);
        TablaSiete.put("Siete por Cuatro", 28);
        TablaSiete.put("Siete por Cinco", 35);
        TablaSiete.put("Siete por Seis", 42);
        TablaSiete.put("Siete por Siete", 49);
        TablaSiete.put("Siete por Ocho", 56);
        TablaSiete.put("Siete por Nueve", 63);
        TablaSiete.put("Siete por Diez", 70);

 }

    public HashMap<String, Integer> getTablaSiete() {
        return TablaSiete;
    }
}