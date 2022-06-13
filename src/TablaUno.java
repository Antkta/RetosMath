import java.util.*;

public class TablaUno {

    HashMap<String, Integer> TablaUno = new HashMap<>();

    public TablaUno(){

        TablaUno.put("Uno por Uno", 1);
        TablaUno.put("Uno por Dos", 2);
        TablaUno.put("Uno por Tres", 3);
        TablaUno.put("Uno por Cuatro", 4);
        TablaUno.put("Uno por Cinco", 5);
        TablaUno.put("Uno por Seis", 6);
        TablaUno.put("Uno por Siete", 7);
        TablaUno.put("Uno por Ocho", 8);
        TablaUno.put("Uno por Nueve", 9);
        TablaUno.put("Uno por Diez", 10);


    }

    public HashMap<String, Integer> getTablaUno() {
        return TablaUno;
    }
}
