import java.util.*;

public class TablaUno {

    private HashMap<String, Integer> tablaUno = new HashMap<>();

    private void TablaUno(){

        tablaUno.put("Uno por Uno", 1);
        tablaUno.put("Uno por Dos", 2);
        tablaUno.put("Uno por Tres", 3);
        tablaUno.put("Uno por Cuatro", 4);
        tablaUno.put("Uno por Cinco", 5);
        tablaUno.put("Uno por Seis", 6);
        tablaUno.put("Uno por Siete", 7);
        tablaUno.put("Uno por Ocho", 8);
        tablaUno.put("Uno por Nueve", 9);
        tablaUno.put("Uno por Diez", 10);


    }

    public HashMap<String, Integer> getTablaUno() {
        return tablaUno;
    }
}
