package challenge;

import java.util.Collections;

import java.util.ArrayList;

public class RetoAmigo {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar elementos al ArrayList
        numeros.add(5);
        numeros.add(2);
        numeros.add(10);
        numeros.add(1);

        // Ordenar el ArrayList
        Collections.sort(numeros);

        // Mostrar el ArrayList ordenado
        System.out.println("ArrayList ordenado: " + numeros);
    }


}
