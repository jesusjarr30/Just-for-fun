package challenge.hilos;

public class main {
    public static void main(String[] args) {
        System.out.println("HHola esto son los hilos de trabajo que se va a ejecutar");
        Corredor persona1 = new Corredor("Juan");
        Corredor persona2 = new Corredor("PEDRO");
        persona2.start();
        persona1.start();

        System.out.println("EL programa siguio corriendo hasta aqui no se espero");


    }

    public static class Corredor extends Thread {
        private int progreso = 0;
        private String nombre;

        public Corredor(String nombre) {
            this.progreso = 0;
            this.nombre = nombre;
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(nombre + " " + progreso + "%");
                progreso++;
                try {
                    Thread.sleep((int) (Math.random() * 1000)); // Simula una velocidad variable
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
