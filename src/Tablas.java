import java.util.HashMap;

public class Tablas {

    public static void main(String[] args) {



        TablaUno a = new TablaUno();
        TablaDos b = new TablaDos();
        TablaTres c = new TablaTres();
        TablaCuatro d = new TablaCuatro();
        TablaCinco e = new TablaCinco();
        TablaSeis f = new TablaSeis();
        TablaSiete g = new TablaSiete();
        TablaOcho h = new TablaOcho();
        TablaNueve i = new TablaNueve();
        TablaDiez j = new TablaDiez();


        HashMap<String, Integer> tablaUno = a.getTablaUno();
        HashMap<String, Integer> tablaDos = b.getTablaDos();
        HashMap<String, Integer> tablaTres = c.getTablaTres();
        HashMap<String, Integer> tablaCuatro = d.getTablaCuatro();
        HashMap<String, Integer> tablaCinco = e.getTablaCinco();
        HashMap<String, Integer> tablaSeis = f.getTablaSeis();
        HashMap<String, Integer> tablaSiete = g.getTablaSiete();
        HashMap<String, Integer> tablaOcho = h.getTablaOcho();
        HashMap<String, Integer> tablaNueve = i.getTablaNueve();
        HashMap<String, Integer> tablaDiez = j.getTablaDiez();

        System.out.println(tablaUno.values());

    }
}
