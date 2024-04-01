package challenge;

import java.util.ArrayList;
import java.util.List;

public class SherlockandArray {
    public static void main(String[] args) {
        System.out.println("Sherlock and Array");
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(0);
        lista.add(0);
        lista.add(0);
        System.out.println(balancedSums(lista));

    }

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }


        for (int i = 0; i < arr.size(); i++) {
            System.out.println("leftSum " + leftSum + " y las demas operaciones son las sigueinte " + totalSum + " " + " " + leftSum + " " + arr.get(i));
            if (leftSum == totalSum - leftSum - arr.get(i)) {
                return "YES";
            }
            leftSum += arr.get(i);
        }

        return "NO";

    }


}
