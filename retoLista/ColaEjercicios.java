package challenge.retoLista;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEjercicios {
    public static void main(String[] args){
        //encolar
        //colar
        System.out.println("Elementos de la cola");

        Queue<Integer> a = new LinkedList<Integer>();

        a.add(12);
        a.add(14);
        a.add(15);
        System.out.println(a.size());
        System.out.println(a.peek());//solo obitne el elemento alfrente de la lista
        System.out.println(a.poll());//recupera y elimina de la lista
        System.out.println(a.size());
    }
}
