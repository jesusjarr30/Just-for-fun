package challenge.retoLista;

import java.util.HashMap;
import java.util.Map;

public class prubasHash {
    public static void main(String[] args){
        HashMap<String,Integer> alumnos= new HashMap<String,Integer>();

        alumnos.put("ulises",12);
        alumnos.put("andrea",14);
        alumnos.put("sofia",9);
        alumnos.put("Jesus",15);
        alumnos.put("Jesus",16);

        for(Map.Entry<String,Integer> entry : alumnos.entrySet()){
            System.out.println("Clave = "+entry.getKey() + " El otro valor "+entry.getValue());
        }

        alumnos.containsKey("Jesus");
        //hacer una ejercicio de frecuencias con la has Map que tenemos
        int[] arreglo={1,2,3,4,5,4,3,2};
        HashMap<Integer,Integer> frecuencia= new HashMap<>();
        HashMap<Integer,Integer> frecuencia2= new HashMap<>();


        for(int i=0;i<arreglo.length; i++){
            if(!frecuencia.containsKey(arreglo[i])){
                //no se encuntra en el arreglo
                frecuencia.put(arreglo[i],1);
            }else{
                //no se si se encutra en el arreglo por tanto se tiene que agregar la nueva tupla aqui
                frecuencia.put(arreglo[i],frecuencia.get(arreglo[i])+1);
            }
        }

        System.out.println("El mapa que se imprime de las frecuencias es el sigueinte");
        for(Map.Entry<Integer, Integer> a : frecuencia.entrySet()){
            System.out.println("El numero es "+a.getKey()+ " y su frecuencia en el arreglo es de "+a.getValue());
        }
        //para este caso vamos a usar el getorDefault
        for(int i=0;i<arreglo.length;i++){
            frecuencia2.put(arreglo[i], (frecuencia2.getOrDefault(arreglo[i],0)+1));
        }
        System.out.println("Las frecuencias de la segunda parte son las siguientes");
        for(Map.Entry<Integer,Integer> a : frecuencia2.entrySet()){
            System.out.println("El numero es "+a.getKey()+ " y su frecuencia en el arreglo es de "+a.getValue());
        }


    }
}
