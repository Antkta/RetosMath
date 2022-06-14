import java.util.HashMap;

public class TablaOcho {

    private HashMap<String, Integer> tablaOcho = new HashMap<>();

    private void TablaOcho(){

        tablaOcho.put("Ocho por Uno", 8);
        tablaOcho.put("Ocho por Dos", 16);
        tablaOcho.put("Ocho por Tres", 24);
        tablaOcho.put("Ocho por Cuatro", 32);
        tablaOcho.put("Ocho por Cinco", 40);
        tablaOcho.put("Ocho por Seis", 48);
        tablaOcho.put("Ocho por Siete", 56);
        tablaOcho.put("Ocho por Ocho", 64);
        tablaOcho.put("Ocho por Nueve", 72);
        tablaOcho.put("Ocho por Diez", 80);

 }

    public HashMap<String, Integer> getTablaOcho() {
        return tablaOcho;
    }
}