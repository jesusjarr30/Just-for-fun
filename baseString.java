package challenge;

import java.sql.Array;
import java.util.ArrayList;

public class baseString {
    public static void main(String[] args){

        System.out.println("El numero que se debe de imprimir es el siguiente");

        String cadena="Hola Mundo";

        deleteSpace(cadena);
        listTest();
    }
    public static void  deleteSpace( String s){

        s= s.replace(" ", "");

        System.out.println("EL resultado es "+s);
    }
    public static void listTest(){

        ArrayList<Integer> l = new ArrayList<>();
        l.add(0,12);
        l.add(0,13);
        l.add(0,14);

        for (int i=0; i<l.size();i++) {

            System.out.println(l.get(i));
        }
    }






    }

