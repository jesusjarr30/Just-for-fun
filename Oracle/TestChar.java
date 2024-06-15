package challenge.Oracle;

import java.util.Arrays;

public class TestChar {
    /*
     * hacer los ejercicios de la manipulacion de String para que no me pase lo mismo que la otra vez
     *
     * */

    public static void main(String[] args) {

        //hacer la pruba de la comparacion de cadenas char[
        char[] lista1 = {'a', 'b', 'c'};
        char[] lista = {'b', 'a', 'c'};

        boolean comparacion = Arrays.equals(lista1, lista);

        System.out.println("Aqui esta el resultado de la lista " + comparacion);
        String cadena = "Jesus$$##Alejandro$$##Rodrioguez";
        System.out.println("---------------");
        imrpimirCadena(cadena);

    }

    public static void imrpimirCadena(String cadena) {
        String nombre = "";
        String segundoNombre = "";
        String apellido = "";

        String[] partes = cadena.split("\\$\\$##");

        nombre = partes[0];
        segundoNombre = partes[1];
        apellido = partes[2];
        System.out.println("Las cadenas son las siguientes" + nombre + " el apellido " + segundoNombre + " Apellido " + apellido);


    }
}
