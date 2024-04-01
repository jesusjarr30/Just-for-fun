package challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] ars) {

        System.out.println("El problema de New year chaou");
        List<Integer> hola = new ArrayList<Integer>();
        hola.add(1);
        hola.add(2);
        hola.add(3);
        hola.add(5);
        hola.add(4);
        hola.add(6);
        hola.add(7);
        hola.add(8);
        minimumBribes(hola);

    }

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int brides = 0;
        boolean band = false;
        int current = 0;

        // Create a copy of the original ArrayList
        ArrayList<Integer> secondList = new ArrayList<>(q);

        // Sort the second ArrayList in a different order
        Collections.sort(secondList);

        for (int i = 0; i < q.size(); i++) {
            current = i - secondList.indexOf(q.get(i));
            current = Math.abs(current);

            if (current > 1) {
                band = true;
                break;
            }
            brides = brides + current;

        }

        if (band) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(brides / 2);
        }

    }

}
