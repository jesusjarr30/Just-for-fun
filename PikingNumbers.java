package challenge;

import java.util.*;

public class PikingNumbers {

    public static void main(String[] args){
        System.out.println("Picking Numbers");

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(4);
        lista.add(6);
        lista.add(5);
        lista.add(3);
        lista.add(3);
        lista.add(1);


        System.out.println(pickingNumbers(lista));

    }
    public static int pickingNumbers(List<Integer> a) {
        int maxLength = 0;

        for (int i = 0; i < a.size(); i++) {
            int current = a.get(i);
            int count = Collections.frequency(a, current) + Collections.frequency(a, current + 1);

            maxLength = Math.max(maxLength, count);
        }

        return maxLength;
    }
}
