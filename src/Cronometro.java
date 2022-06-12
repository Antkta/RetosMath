import java.util.Scanner;

public class Cronometro {

    public static void main(String[] args) throws InterruptedException {

        int i = 100;
        while (i > 1){

            System.out.println(i);
            Thread.sleep(1000);
            i --;
        }

        System.out.println("Tiempo!!!"); // Esto es una prueba para intentar integrar un cronómetro al programa

        long startTime = System.currentTimeMillis();

        Scanner s = new Scanner(System.in);
        s.next();

        long stopTime = System.currentTimeMillis();

        long reactionTime = stopTime - startTime;//Por ahora lo que hace es crear dos TimeStamps, y cuenta el tiempo entre ellos

        System.out.println(reactionTime);
    }

}
