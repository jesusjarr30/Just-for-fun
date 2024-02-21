package challenge.retoLista;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class numerosRepetidos {

    public static void main(String[] args){
        System.out.println("El hasMap es el sigueinte ");
        HashMap<Integer,Integer> frecuencias= new HashMap<>();
        int[] arreglo= {10,8,12,1,14,14,15,14};

        System.out.println("El repeticin de arrgloe es ");

        for(int i=0;i<arreglo.length;i++){
            if(frecuencias.containsKey(arreglo[i])){
                //si se tiene la frecuenci en el arreglo agregar un uno de mas
                frecuencias.put(arreglo[i],frecuencias.get(arreglo[i])+1);
            }else{
                frecuencias.put(arreglo[i],1);
            }

        }

        for(Map.Entry<Integer,Integer> a : frecuencias.entrySet()){
            System.out.println("numero "+a.getKey());
            System.out.println("Frecuncia "+a.getValue());
            System.out.println("-----------------------");
        }
        frecuencias(arreglo);

    }

    public static void frecuencias(int[] arreglo){
        System.out.println("Aqui se esta entrando en la nueva funcion de hash");
        HashMap<Integer,Integer> hash= new HashMap<>();

        for(int i=0;i<arreglo.length;i++){

            if(!hash.containsKey(arreglo[i])){
                hash.put(arreglo[i],1);
            }else{
                //quiere decir que ya esta regitrado
                hash.put(arreglo[i],hash.get(arreglo[i] ) +1 );
                //con esto ya deberia de poder realizar el contado de recurrencias
            }
        }
        //imprimir el hasMap para ver las recurencias
        for(Map.Entry<Integer,Integer> a: hash.entrySet()){
            System.out.println("La clave es "+a.getKey());
            System.out.println("La recurrencia es "+a.getValue());
        }

        System.out.println("Ya se termino el nuevo metodo que se estaba generando");
    }
}
