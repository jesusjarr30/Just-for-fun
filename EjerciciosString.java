package challenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EjerciciosString {

    public static void main(String[] args) {
        System.out.println("Aqui van las cosas del string ");

        String cadena = "hola##$$jeseus##$$rodriguiez";
        String[] partes = cadena.split("##");

        for (String parte : partes) {
            System.out.println(parte);
        }
        String nuevoNombre = partes[1].substring(2);
        System.out.println(nuevoNombre);
    }

    public static void StackEs() {
        String cadena = "()[]{}";
        Stack<Character> car = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '{' || cadena.charAt(i) == '[') {
                car.push(cadena.charAt(i));
            } else {
                if (car.isEmpty()) {
                    System.out.println(" No es posible");
                    break;
                }

            }

        }
    }

    public static void queeST() {
        Queue<String> holamundo = new LinkedList<>();

    }
}
