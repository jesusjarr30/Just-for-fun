package challenge.listaSuper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class ClosestNumbers {
    public static void main(String[] args){
        System.out.println("Closest Numbers");
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1);

        List<Integer>resultado;
        resultado=closestNumbers(arr);

        System.out.println("IMprimir los numeros que se tienen");
        for(int i=0;i<resultado.size();i++) {
            System.out.println(resultado.get(i));
        }
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> aux= new ArrayList<>();
        int min=999999999;
        for(int i = 0; i< arr.size()-1; i++ ){
                int num=Math.abs((arr.get(i) -arr.get(i+1) ));
            if(num  <= min){

                if(num==min){
                    aux.add(arr.get(i));
                    aux.add(arr.get(i+1));
                }else{
                    min=num;
                    aux.clear();
                    aux.add(arr.get(i));
                    aux.add(arr.get(i+1));

                }

            }

        }
        return aux;

    }
}
