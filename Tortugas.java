package challenge;

import java.util.Random;

public class Tortugas {

    public static void main(String[] arge) {

        System.out.println("La carrera de Tortugas");

        Competidor a1 = new Competidor("Pablo");
        Competidor a2 = new Competidor("Mario");
        a1.start();
        a2.start();
        
    }


    public static class Competidor extends Thread {
        private String name;
        private int avance;
        private Random random;

        public Competidor(String name) {
            this.name = name;
            this.random = new Random();
        }

        public void run() {
            try {
                while (avance < 100) {
                    avance = avance + random.nextInt(5);
                    Thread.sleep(1000);
                    avance = avance + random.nextInt(5);
                    System.out.println(name + " " + avance);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
