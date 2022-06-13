import java.util.HashMap;

public class TablaSeis {

    HashMap<String, Integer> TablaSeis = new HashMap<>();

    public TablaSeis(){

        TablaSeis.put("Seis por Uno", 6);
        TablaSeis.put("Seis por Dos", 12);
        TablaSeis.put("Seis por Tres", 18);
        TablaSeis.put("Seis por Cuatro", 24);
        TablaSeis.put("Seis por Cinco", 30);
        TablaSeis.put("Seis por Seis", 36);
        TablaSeis.put("Seis por Siete", 42);
        TablaSeis.put("Seis por Ocho", 48);
        TablaSeis.put("Seis por Nueve", 54);
        TablaSeis.put("Seis por Diez", 60);

 }

    public HashMap<String, Integer> getTablaSeis() {
        return TablaSeis;
    }
}