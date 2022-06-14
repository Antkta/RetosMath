import javax.swing.*;
public class Tablas {

    public static void MetodoTablas() {
/* Entiendo que estas preguntas pueden ser simplificadas con la aritmética básica de java, sin embargo, se está utilizando
    este método para poner en práctica herencia y encapsulamiento. Por otro lado, la manera en la cual se están iterando
    las respuestas es bastante repetitiva y probablemente se puede simplificar, pero no logré encontrar el método
     para que funcione de tal manera que se pueda traer el key del map que se está llamando de los enum de manera codicional.

*/
        int x = Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10, elige la tabla que quieres practicar: "));

        switch (x) {

            case 1: //faltan los otros casos pero estaré buscando una manera de iterar sin tantas líneas de código
                //Si tienes una sugerencia es más que bienvenida
                int respuestasCorrectas = 0;
                int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Uno?"));
                tablaUnoPreguntas respuestaA = tablaUnoPreguntas.UnoporUno;
                int respuestaUno = respuestaA.getValue();
                if (a == respuestaUno) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Dos?"));
                tablaUnoPreguntas respuestaB = tablaUnoPreguntas.UnoporDos;
                int respuestaDos = respuestaB.getValue();
                if (b == respuestaDos) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Tres?"));
                tablaUnoPreguntas respuestaC = tablaUnoPreguntas.UnoporTres;
                int respuestaTres = respuestaC.getValue();
                if (c == respuestaTres) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Cuatro?"));
                tablaUnoPreguntas respuestaD = tablaUnoPreguntas.UnoporCuatro;
                int respuestaCuatro = respuestaD.getValue();
                if (d == respuestaCuatro) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Cinco?"));
                tablaUnoPreguntas respuestaE = tablaUnoPreguntas.UnoporCinco;
                int respuestaCinco = respuestaE.getValue();
                if (e == respuestaCinco) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Seis?"));
                tablaUnoPreguntas respuestaF = tablaUnoPreguntas.UnoporSeis;
                int respuestaSeis = respuestaF.getValue();
                if (f == respuestaSeis) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Siete?"));
                tablaUnoPreguntas respuestaG = tablaUnoPreguntas.UnoporSiete;
                int respuestaSiete = respuestaG.getValue();
                if (g == respuestaSiete) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Ocho?"));
                tablaUnoPreguntas respuestaH = tablaUnoPreguntas.UnoporOcho;
                int respuestaOcho = respuestaH.getValue();
                if (h == respuestaOcho) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Nueve?"));
                tablaUnoPreguntas respuestaI = tablaUnoPreguntas.UnoporNueve;
                int respuestaNueve = respuestaI.getValue();
                if (i == respuestaNueve) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Diez?"));
                tablaUnoPreguntas respuestaJ = tablaUnoPreguntas.UnoporDiez;
                int respuestaDiez = respuestaJ.getValue();
                if (j == respuestaDiez) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas);



        }

    }
}
