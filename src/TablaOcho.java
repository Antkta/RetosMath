import java.util.HashMap;

public class TablaOcho {

    HashMap<String, Integer> TablaOcho = new HashMap<>();

    public TablaOcho(){

        TablaOcho.put("Ocho por Uno", 8);
        TablaOcho.put("Ocho por Dos", 16);
        TablaOcho.put("Ocho por Tres", 24);
        TablaOcho.put("Ocho por Cuatro", 32);
        TablaOcho.put("Ocho por Cinco", 40);
        TablaOcho.put("Ocho por Seis", 48);
        TablaOcho.put("Ocho por Siete", 56);
        TablaOcho.put("Ocho por Ocho", 64);
        TablaOcho.put("Ocho por Nueve", 72);
        TablaOcho.put("Ocho por Diez", 80);

 }

    public HashMap<String, Integer> getTablaOcho() {
        return TablaOcho;
    }
}