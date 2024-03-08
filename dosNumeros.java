package challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class dosNumeros {
    public static void main(String[] args){
        int[] arg = {1,2,3,4,5,6,7,8,9,10};
        int objetivo=10;
        ArrayList<Integer> arg2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

buscar(arg,objetivo);
    }
    public static void buscar(int[] arg, int objetivo){
        ArrayList comodin= new ArrayList();
        for(int i=0;i<arg.length;i++){
            int aux=objetivo-arg[i];
            if(aux>0){
                if(comodin.contains(aux)){
                    System.out.println("Los numeros son "+aux+" + "+ arg[i]);
                }
            }
            comodin.add(arg[i]);



        }

    }
}
