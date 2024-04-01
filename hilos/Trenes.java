package challenge.hilos;

public class Trenes {
    public static void main(String[] args) {

        Puente puente = new Puente();
        Tren linea1 = new Tren(puente, "A");
        Tren linea2 = new Tren(puente, "B");
        Tren linea3 = new Tren(puente, "C");
        linea1.start();
        linea2.start();
        linea3.start();

        int contador = 3;

        while (contador != 10) {

            if (contador >= 4 && contador <= 6) {

                contador++;
                System.out.println("Detnor del puente");
            } else {
                contador++;
                System.out.println("esta fuera");
            }
        }


    }

    public static class Puente {
        //indica si el puente esta vacio o no
        private boolean estado;

        public Puente() {
            estado = true;
        }

        public boolean getEstado() {
            return estado;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }
    }

    public static class Tren extends Thread {
        private String name;

        private Puente puente;

        public Tren(Puente puente, String name) {
            this.name = name;
            this.puente = puente;

        }

        public void run() {
            int contador = 0;
            boolean derechoDePAso = false;
            while (contador != 10) {
                synchronized (puente) {

                    if (contador >= 4 && contador <= 6) {
                        //poner aqui la logica de quien es el que esta cruzadno el puente
                        //debo de evaluar que este en el rango de cruze
                        //depues evaluar si la bandera es positiva para cruzar este tren
                        //despues evaluar la banderra interna para saber si paso o no
                        //regresar la bandera de paso a su lugra junto con el derecho de paso a los demas

                        if (puente.getEstado()) {
                            //si el puente esat disponible tomarlo
                            puente.setEstado(false);//indicar a los demas trenes que no se puede abordar
                            derechoDePAso = true;//tenemos derechod e paso
                        }
                        if (derechoDePAso) {//imprimios los menajes para cuando el tren este en el puente
                            contador++;
                            System.out.println(name + " esta en:  " + contador + " y etsa cruzando el puente");
                        } else {
                            System.out.println(name + "Tren esta en espera no tenemos bandera para dar paso");
                        }
                        if (contador == 6) {
                            //eliminar las bandera que dan acceso al puente tanto local como
                            puente.setEstado(true);
                            derechoDePAso = true;
                        }

                    } else {
                        contador++;
                        System.out.println(name + " está en : " + contador + " del trayecto ");
                    }
                }
                try {
                    Thread.sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
//el problema esta e la gestion de la bandera de los trenes creo que necesto una segunda bandera para indicar quien tiene el derecho de paso entre todos si no los//

        ///voy a poner a esperar


    }
}
