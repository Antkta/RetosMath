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

            case 1:

                int respuestasCorrectas1 = 0;
                int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Uno?"));
                tablaUnoPreguntas respuestaA = tablaUnoPreguntas.UnoporUno;
                int respuestaUno = respuestaA.getValue();
                if (a == respuestaUno) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Dos?"));
                tablaUnoPreguntas respuestaB = tablaUnoPreguntas.UnoporDos;
                int respuestaDos = respuestaB.getValue();
                if (b == respuestaDos) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Tres?"));
                tablaUnoPreguntas respuestaC = tablaUnoPreguntas.UnoporTres;
                int respuestaTres = respuestaC.getValue();
                if (c == respuestaTres) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Cuatro?"));
                tablaUnoPreguntas respuestaD = tablaUnoPreguntas.UnoporCuatro;
                int respuestaCuatro = respuestaD.getValue();
                if (d == respuestaCuatro) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Cinco?"));
                tablaUnoPreguntas respuestaE = tablaUnoPreguntas.UnoporCinco;
                int respuestaCinco = respuestaE.getValue();
                if (e == respuestaCinco) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Seis?"));
                tablaUnoPreguntas respuestaF = tablaUnoPreguntas.UnoporSeis;
                int respuestaSeis = respuestaF.getValue();
                if (f == respuestaSeis) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Siete?"));
                tablaUnoPreguntas respuestaG = tablaUnoPreguntas.UnoporSiete;
                int respuestaSiete = respuestaG.getValue();
                if (g == respuestaSiete) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Ocho?"));
                tablaUnoPreguntas respuestaH = tablaUnoPreguntas.UnoporOcho;
                int respuestaOcho = respuestaH.getValue();
                if (h == respuestaOcho) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Nueve?"));
                tablaUnoPreguntas respuestaI = tablaUnoPreguntas.UnoporNueve;
                int respuestaNueve = respuestaI.getValue();
                if (i == respuestaNueve) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Diez?"));
                tablaUnoPreguntas respuestaJ = tablaUnoPreguntas.UnoporDiez;
                int respuestaDiez = respuestaJ.getValue();
                if (j == respuestaDiez) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas1 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas1);

            case 2:

                int respuestasCorrectas2 = 0;
                int a2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Uno?"));
                tablaDosPreguntas respuestaA2 = tablaDosPreguntas.DosporUno;
                int respuestaUno2 = respuestaA2.getValue();
                if (a2 == respuestaUno2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Dos?"));
                tablaDosPreguntas respuestaB2 = tablaDosPreguntas.DosporDos;
                int respuestaDos2 = respuestaB2.getValue();
                if (b2 == respuestaDos2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Tres?"));
                tablaDosPreguntas respuestaC2 = tablaDosPreguntas.DosporTres;
                int respuestaTres2 = respuestaC2.getValue();
                if (c2 == respuestaTres2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Cuatro?"));
                tablaDosPreguntas respuestaD2 = tablaDosPreguntas.DosporCuatro;
                int respuestaCuatro2 = respuestaD2.getValue();
                if (d2 == respuestaCuatro2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Cinco?"));
                tablaDosPreguntas respuestaE2 = tablaDosPreguntas.DosporCinco;
                int respuestaCinco2 = respuestaE2.getValue();
                if (e2 == respuestaCinco2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Seis?"));
                tablaDosPreguntas respuestaF2 = tablaDosPreguntas.DosporSeis;
                int respuestaSeis2 = respuestaF2.getValue();
                if (f2 == respuestaSeis2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Siete?"));
                tablaDosPreguntas respuestaG2 = tablaDosPreguntas.DosporSiete;
                int respuestaSiete2 = respuestaG2.getValue();
                if (g2 == respuestaSiete2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Ocho?"));
                tablaDosPreguntas respuestaH2 = tablaDosPreguntas.DosporOcho;
                int respuestaOcho2 = respuestaH2.getValue();
                if (h2 == respuestaOcho2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Dos por Nueve?"));
                tablaDosPreguntas respuestaI2 = tablaDosPreguntas.DosporNueve;
                int respuestaNueve2 = respuestaI2.getValue();
                if (i2 == respuestaNueve2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Uno por Diez?"));
                tablaDosPreguntas respuestaJ2 = tablaDosPreguntas.DosporDiez;
                int respuestaDiez2 = respuestaJ2.getValue();
                if (j2 == respuestaDiez2) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas2 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas2);

            case 3:

                int respuestasCorrectas3 = 0;
                int a3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Uno?"));
                tablaTresPreguntas respuestaA3 = tablaTresPreguntas.TresporUno;
                int respuestaUno3 = respuestaA3.getValue();
                if (a3 == respuestaUno3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Dos?"));
                tablaTresPreguntas respuestaB3 = tablaTresPreguntas.TresporDos;
                int respuestaDos3 = respuestaB3.getValue();
                if (b3 == respuestaDos3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Tres?"));
                tablaTresPreguntas respuestaC3 = tablaTresPreguntas.TresporTres;
                int respuestaTres3 = respuestaC3.getValue();
                if (c3 == respuestaTres3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Cuatro?"));
                tablaTresPreguntas respuestaD3 = tablaTresPreguntas.TresporCuatro;
                int respuestaCuatro3 = respuestaD3.getValue();
                if (d3 == respuestaCuatro3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Cinco?"));
                tablaTresPreguntas respuestaE3 = tablaTresPreguntas.TresporCinco;
                int respuestaCinco3 = respuestaE3.getValue();
                if (e3 == respuestaCinco3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Seis?"));
                tablaTresPreguntas respuestaF3 = tablaTresPreguntas.TresporSeis;
                int respuestaSeis3 = respuestaF3.getValue();
                if (f3 == respuestaSeis3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Siete?"));
                tablaTresPreguntas respuestaG3 = tablaTresPreguntas.TresporSiete;
                int respuestaSiete3 = respuestaG3.getValue();
                if (g3 == respuestaSiete3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Ocho?"));
                tablaTresPreguntas respuestaH3 = tablaTresPreguntas.TresporOcho;
                int respuestaOcho3 = respuestaH3.getValue();
                if (h3 == respuestaOcho3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Nueve?"));
                tablaTresPreguntas respuestaI3 = tablaTresPreguntas.TresporNueve;
                int respuestaNueve3 = respuestaI3.getValue();
                if (i3 == respuestaNueve3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Tres por Diez?"));
                tablaTresPreguntas respuestaJ3 = tablaTresPreguntas.TresporDiez;
                int respuestaDiez3 = respuestaJ3.getValue();
                if (j3 == respuestaDiez3) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas3 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas3);

            case 4:

                int respuestasCorrectas4 = 0;
                int a4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Uno?"));
                tablaCuatroPreguntas respuestaA4 = tablaCuatroPreguntas.CuatroporUno;
                int respuestaUno4 = respuestaA4.getValue();
                if (a4 == respuestaUno4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Dos?"));
                tablaCuatroPreguntas respuestaB4 = tablaCuatroPreguntas.CuatroporDos;
                int respuestaDos4 = respuestaB4.getValue();
                if (b4 == respuestaDos4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Tres?"));
                tablaCuatroPreguntas respuestaC4 = tablaCuatroPreguntas.CuatroporTres;
                int respuestaTres4 = respuestaC4.getValue();
                if (c4 == respuestaTres4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Cuatro?"));
                tablaCuatroPreguntas respuestaD4 = tablaCuatroPreguntas.CuatroporCuatro;
                int respuestaCuatro4 = respuestaD4.getValue();
                if (d4 == respuestaCuatro4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Cinco?"));
                tablaCuatroPreguntas respuestaE4 = tablaCuatroPreguntas.CuatroporCinco;
                int respuestaCinco4 = respuestaE4.getValue();
                if (e4 == respuestaCinco4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Seis?"));
                tablaCuatroPreguntas respuestaF4 = tablaCuatroPreguntas.CuatroporSeis;
                int respuestaSeis4 = respuestaF4.getValue();
                if (f4 == respuestaSeis4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Siete?"));
                tablaCuatroPreguntas respuestaG4 = tablaCuatroPreguntas.CuatroporSiete;
                int respuestaSiete4 = respuestaG4.getValue();
                if (g4 == respuestaSiete4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Ocho?"));
                tablaCuatroPreguntas respuestaH4 = tablaCuatroPreguntas.CuatroporOcho;
                int respuestaOcho4 = respuestaH4.getValue();
                if (h4 == respuestaOcho4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Nueve?"));
                tablaCuatroPreguntas respuestaI4 = tablaCuatroPreguntas.CuatroporNueve;
                int respuestaNueve4 = respuestaI4.getValue();
                if (i4 == respuestaNueve4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cuatro por Diez?"));
                tablaCuatroPreguntas respuestaJ4 = tablaCuatroPreguntas.CuatroporDiez;
                int respuestaDiez4 = respuestaJ4.getValue();
                if (j4 == respuestaDiez4) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas4 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas4);


            case 5:

                int respuestasCorrectas5 = 0;
                int a5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Uno?"));
                tablaCincoPreguntas respuestaA5 = tablaCincoPreguntas.CincoporUno;
                int respuestaUno5 = respuestaA5.getValue();
                if (a5 == respuestaUno5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Dos?"));
                tablaCincoPreguntas respuestaB5 = tablaCincoPreguntas.CincoporDos;
                int respuestaDos5 = respuestaB5.getValue();
                if (b5 == respuestaDos5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Tres?"));
                tablaCincoPreguntas respuestaC5 = tablaCincoPreguntas.CincoporTres;
                int respuestaTres5 = respuestaC5.getValue();
                if (c5 == respuestaTres5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Cuatro?"));
                tablaCincoPreguntas respuestaD5 = tablaCincoPreguntas.CincoporCuatro;
                int respuestaCuatro5 = respuestaD5.getValue();
                if (d5 == respuestaCuatro5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Cinco?"));
                tablaCincoPreguntas respuestaE5 = tablaCincoPreguntas.CincoporCinco;
                int respuestaCinco5 = respuestaE5.getValue();
                if (e5 == respuestaCinco5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Seis?"));
                tablaCincoPreguntas respuestaF5 = tablaCincoPreguntas.CincoporSeis;
                int respuestaSeis5 = respuestaF5.getValue();
                if (f5 == respuestaSeis5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Siete?"));
                tablaCincoPreguntas respuestaG5 = tablaCincoPreguntas.CincoporSiete;
                int respuestaSiete5 = respuestaG5.getValue();
                if (g5 == respuestaSiete5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Ocho?"));
                tablaCincoPreguntas respuestaH5 = tablaCincoPreguntas.CincoporOcho;
                int respuestaOcho5 = respuestaH5.getValue();
                if (h5 == respuestaOcho5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Nueve?"));
                tablaCincoPreguntas respuestaI5 = tablaCincoPreguntas.CincoporNueve;
                int respuestaNueve5 = respuestaI5.getValue();
                if (i5 == respuestaNueve5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j5 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Cinco por Diez?"));
                tablaCincoPreguntas respuestaJ5 = tablaCincoPreguntas.CincoporDiez;
                int respuestaDiez5 = respuestaJ5.getValue();
                if (j5 == respuestaDiez5) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas5 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas5);

            case 6:

                int respuestasCorrectas6 = 0;
                int a6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Uno?"));
                tablaSeisPreguntas respuestaA6 = tablaSeisPreguntas.SeisporUno;
                int respuestaUno6 = respuestaA6.getValue();
                if (a6 == respuestaUno6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Dos?"));
                tablaSeisPreguntas respuestaB6 = tablaSeisPreguntas.SeisporDos;
                int respuestaDos6 = respuestaB6.getValue();
                if (b6 == respuestaDos6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Tres?"));
                tablaSeisPreguntas respuestaC6 = tablaSeisPreguntas.SeisporTres;
                int respuestaTres6 = respuestaC6.getValue();
                if (c6 == respuestaTres6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Cuatro?"));
                tablaSeisPreguntas respuestaD6 = tablaSeisPreguntas.SeisporCuatro;
                int respuestaCuatro6 = respuestaD6.getValue();
                if (d6 == respuestaCuatro6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Cinco?"));
                tablaSeisPreguntas respuestaE6 = tablaSeisPreguntas.SeisporCinco;
                int respuestaCinco6 = respuestaE6.getValue();
                if (e6 == respuestaCinco6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Seis?"));
                tablaSeisPreguntas respuestaF6 = tablaSeisPreguntas.SeisporSeis;
                int respuestaSeis6 = respuestaF6.getValue();
                if (f6 == respuestaSeis6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Siete?"));
                tablaSeisPreguntas respuestaG6 = tablaSeisPreguntas.SeisporSiete;
                int respuestaSiete6 = respuestaG6.getValue();
                if (g6 == respuestaSiete6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Ocho?"));
                tablaSeisPreguntas respuestaH6 = tablaSeisPreguntas.SeisporOcho;
                int respuestaOcho6 = respuestaH6.getValue();
                if (h6 == respuestaOcho6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Nueve?"));
                tablaSeisPreguntas respuestaI6 = tablaSeisPreguntas.SeisporNueve;
                int respuestaNueve6 = respuestaI6.getValue();
                if (i6 == respuestaNueve6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j6 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Seis por Diez?"));
                tablaSeisPreguntas respuestaJ6 = tablaSeisPreguntas.SeisporDiez;
                int respuestaDiez6 = respuestaJ6.getValue();
                if (j6 == respuestaDiez6) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas6 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas6);

            case 7:

                int respuestasCorrectas7 = 0;
                int a7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Uno?"));
                tablaSietePreguntas respuestaA7 = tablaSietePreguntas.SieteporUno;
                int respuestaUno7 = respuestaA7.getValue();
                if (a7 == respuestaUno7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Dos?"));
                tablaSietePreguntas respuestaB7 = tablaSietePreguntas.SieteporDos;
                int respuestaDos7 = respuestaB7.getValue();
                if (b7 == respuestaDos7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Tres?"));
                tablaSietePreguntas respuestaC7 = tablaSietePreguntas.SieteporTres;
                int respuestaTres7 = respuestaC7.getValue();
                if (c7 == respuestaTres7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Cuatro?"));
                tablaSietePreguntas respuestaD7 = tablaSietePreguntas.SieteporCuatro;
                int respuestaCuatro7 = respuestaD7.getValue();
                if (d7 == respuestaCuatro7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Cinco?"));
                tablaSietePreguntas respuestaE7 = tablaSietePreguntas.SieteporCinco;
                int respuestaCinco7 = respuestaE7.getValue();
                if (e7 == respuestaCinco7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Seis?"));
                tablaSietePreguntas respuestaF7 = tablaSietePreguntas.SieteporSeis;
                int respuestaSeis7 = respuestaF7.getValue();
                if (f7 == respuestaSeis7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Siete?"));
                tablaSietePreguntas respuestaG7 = tablaSietePreguntas.SieteporSiete;
                int respuestaSiete7 = respuestaG7.getValue();
                if (g7 == respuestaSiete7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Ocho?"));
                tablaSietePreguntas respuestaH7 = tablaSietePreguntas.SieteporOcho;
                int respuestaOcho7 = respuestaH7.getValue();
                if (h7 == respuestaOcho7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Nueve?"));
                tablaSietePreguntas respuestaI7 = tablaSietePreguntas.SieteporNueve;
                int respuestaNueve7 = respuestaI7.getValue();
                if (i7 == respuestaNueve7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j7 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Siete por Diez?"));
                tablaSietePreguntas respuestaJ7 = tablaSietePreguntas.SieteporDiez;
                int respuestaDiez7 = respuestaJ7.getValue();
                if (j7 == respuestaDiez7) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas7 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas7);

            case 8:

                int respuestasCorrectas8 = 0;
                int a8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Uno?"));
                tablaOchoPreguntas respuestaA8 = tablaOchoPreguntas.OchoporUno;
                int respuestaUno8 = respuestaA8.getValue();
                if (a8 == respuestaUno8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Dos?"));
                tablaOchoPreguntas respuestaB8 = tablaOchoPreguntas.OchoporDos;
                int respuestaDos8 = respuestaB8.getValue();
                if (b8 == respuestaDos8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Tres?"));
                tablaOchoPreguntas respuestaC8 = tablaOchoPreguntas.OchoporTres;
                int respuestaTres8 = respuestaC8.getValue();
                if (c8 == respuestaTres8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Cuatro?"));
                tablaOchoPreguntas respuestaD8 = tablaOchoPreguntas.OchoporCuatro;
                int respuestaCuatro8 = respuestaD8.getValue();
                if (d8 == respuestaCuatro8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Cinco?"));
                tablaOchoPreguntas respuestaE8 = tablaOchoPreguntas.OchoporCinco;
                int respuestaCinco8 = respuestaE8.getValue();
                if (e8 == respuestaCinco8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Seis?"));
                tablaOchoPreguntas respuestaF8 = tablaOchoPreguntas.OchoporSeis;
                int respuestaSeis8 = respuestaF8.getValue();
                if (f8 == respuestaSeis8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Siete?"));
                tablaOchoPreguntas respuestaG8 = tablaOchoPreguntas.OchoporSiete;
                int respuestaSiete8 = respuestaG8.getValue();
                if (g8 == respuestaSiete8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Ocho?"));
                tablaOchoPreguntas respuestaH8 = tablaOchoPreguntas.OchoporOcho;
                int respuestaOcho8 = respuestaH8.getValue();
                if (h8 == respuestaOcho8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Nueve?"));
                tablaOchoPreguntas respuestaI8 = tablaOchoPreguntas.OchoporNueve;
                int respuestaNueve8 = respuestaI8.getValue();
                if (i8 == respuestaNueve8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j8 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Ocho por Diez?"));
                tablaOchoPreguntas respuestaJ8 = tablaOchoPreguntas.OchoporDiez;
                int respuestaDiez8 = respuestaJ8.getValue();
                if (j8 == respuestaDiez8) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas8 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas8);

            case 9:

                int respuestasCorrectas9 = 0;
                int a9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Uno?"));
                tablaNuevePreguntas respuestaA9 = tablaNuevePreguntas.NueveporUno;
                int respuestaUno9 = respuestaA9.getValue();
                if (a9 == respuestaUno9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Dos?"));
                tablaNuevePreguntas respuestaB9 = tablaNuevePreguntas.NueveporDos;
                int respuestaDos9 = respuestaB9.getValue();
                if (b9 == respuestaDos9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Tres?"));
                tablaNuevePreguntas respuestaC9 = tablaNuevePreguntas.NueveporTres;
                int respuestaTres9 = respuestaC9.getValue();
                if (c9 == respuestaTres9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Cuatro?"));
                tablaNuevePreguntas respuestaD9 = tablaNuevePreguntas.NueveporCuatro;
                int respuestaCuatro9 = respuestaD9.getValue();
                if (d9 == respuestaCuatro9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Cinco?"));
                tablaNuevePreguntas respuestaE9 = tablaNuevePreguntas.NueveporCinco;
                int respuestaCinco9 = respuestaE9.getValue();
                if (e9 == respuestaCinco9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Seis?"));
                tablaNuevePreguntas respuestaF9 = tablaNuevePreguntas.NueveporSeis;
                int respuestaSeis9 = respuestaF9.getValue();
                if (f9 == respuestaSeis9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Siete?"));
                tablaNuevePreguntas respuestaG9 = tablaNuevePreguntas.NueveporSiete;
                int respuestaSiete9 = respuestaG9.getValue();
                if (g9 == respuestaSiete9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Ocho?"));
                tablaOchoPreguntas respuestaH9 = tablaOchoPreguntas.OchoporOcho;
                int respuestaOcho9 = respuestaH9.getValue();
                if (h9 == respuestaOcho9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Nueve?"));
                tablaNuevePreguntas respuestaI9 = tablaNuevePreguntas.NueveporNueve;
                int respuestaNueve9 = respuestaI9.getValue();
                if (i9 == respuestaNueve9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j9 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Nueve por Diez?"));
                tablaNuevePreguntas respuestaJ9 = tablaNuevePreguntas.NueveporDiez;
                int respuestaDiez9 = respuestaJ9.getValue();
                if (j9 == respuestaDiez9) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas9 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas9);

            case 10:

                int respuestasCorrectas10 = 0;
                int a10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Uno?"));
                tablaDiezPreguntas respuestaA10 = tablaDiezPreguntas.DiezporUno;
                int respuestaUno10 = respuestaA10.getValue();
                if (a10 == respuestaUno10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int b10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Dos?"));
                tablaDiezPreguntas respuestaB10 = tablaDiezPreguntas.DiezporDos;
                int respuestaDos10 = respuestaB10.getValue();
                if (b10 == respuestaDos10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int c10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Tres?"));
                tablaDiezPreguntas respuestaC10 = tablaDiezPreguntas.DiezporTres;
                int respuestaTres10 = respuestaC10.getValue();
                if (c10 == respuestaTres10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int d10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Cuatro?"));
                tablaDiezPreguntas respuestaD10 = tablaDiezPreguntas.DiezporCuatro;
                int respuestaCuatro10 = respuestaD10.getValue();
                if (d10 == respuestaCuatro10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int e10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Cinco?"));
                tablaDiezPreguntas respuestaE10 = tablaDiezPreguntas.DiezporCinco;
                int respuestaCinco10 = respuestaE10.getValue();
                if (e10 == respuestaCinco10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int f10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Seis?"));
                tablaDiezPreguntas respuestaF10 = tablaDiezPreguntas.DiezporSeis;
                int respuestaSeis10 = respuestaF10.getValue();
                if (f10 == respuestaSeis10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int g10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Siete?"));
                tablaDiezPreguntas respuestaG10 = tablaDiezPreguntas.DiezporSiete;
                int respuestaSiete10 = respuestaG10.getValue();
                if (g10 == respuestaSiete10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int h10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Ocho?"));
                tablaDiezPreguntas respuestaH10 = tablaDiezPreguntas.DiezporOcho;
                int respuestaOcho10 = respuestaH10.getValue();
                if (h10 == respuestaOcho10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int i10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Nueve?"));
                tablaDiezPreguntas respuestaI10 = tablaDiezPreguntas.DiezporNueve;
                int respuestaNueve10 = respuestaI10.getValue();
                if (i10 == respuestaNueve10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                int j10 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto es Diez por Diez?"));
                tablaDiezPreguntas respuestaJ10 = tablaDiezPreguntas.DiezporDiez;
                int respuestaDiez10 = respuestaJ10.getValue();
                if (j10 == respuestaDiez10) {
                    JOptionPane.showMessageDialog(null, "¡Es correcto!");
                    respuestasCorrectas10 += 1;
                } else JOptionPane.showMessageDialog(null, "Oh, no es correcto");

                JOptionPane.showMessageDialog(null, "El numero de respuestas correctas fueron: " + respuestasCorrectas10);
        }

    }
}
