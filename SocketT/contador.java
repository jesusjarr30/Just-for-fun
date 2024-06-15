package challenge.SocketT;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class contador {

    //    //hacer el ejercicio que me paso en IBM
//
//    Reglas se pasa el arreglo de Dominios
//    Se pasa el tamano del cache
//
    public static void main(String[] args) {

        ArrayList<String> dominios = new ArrayList<>();
        dominios.add("google");
        dominios.add("yahhoo");
        dominios.add("gmail");
        dominios.add("google");
        dominios.add("hacker");
        dominios.add("laptop");
        dominios.add("google");
        //4+4+4+1+4+4+1=20
        int tiempoCache = 1;   //un segundo
        int tiempoServidor = 4;//4 segundos
        int tamano = 3;

        int respuesta = servidorCache(dominios, tiempoCache, tiempoServidor, tamano);
        System.out.println("El tiempo del servidor es el sigueinte " + respuesta);
    }

    public static int servidorCache(ArrayList<String> dominios, int tiempoChache, int tiempoServidor, int tamano) {
        System.out.println("Ya termino");
        Queue<String> cola = new ArrayDeque<>();
        int contador = 0;
        for (int i = 0; i < dominios.size(); i++) {
            if (cola.contains(dominios.get(i))) {
                //si el dominio esat bien quiere decir que es el minimo
                contador += tiempoChache;
                //actulizar la cache.
                cola.remove(dominios.get(i));
                cola.add(dominios.get(i));

            } else { //poll()


                if (cola.size() == tamano) {
                    //Si el dominio no esta vacio
                    System.out.println("");
                    System.out.println("EL dominio " + dominios.get(i));
                    //tenemos que hacer la validacion del

                    cola.poll();
                    cola.add(dominios.get(i));
                    contador += tiempoServidor;
                } else {
                    cola.add(dominios.get(i));
                    contador += tiempoServidor;

                }

            }
        }
        return contador;
    }

    public static void imprimir(Queue<String> cola) {
        //metodo para poder imprimir la cola y ver los registroq eu se se tienen.
        for (String elemento : cola) {
            System.out.println(elemento); // Imprimir el elemento actual
        }

    }
}

