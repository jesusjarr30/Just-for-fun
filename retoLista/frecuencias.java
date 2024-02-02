package challenge.retoLista;

import java.util.HashMap;
import java.util.Map;

public class frecuencias {
    public static void main(String[] args){

        System.out.println("Frecuencias de na palabra ejeercicion con el uso de hasMap");

        HashMap<Character,Integer> map = new HashMap<>();
        String cadena="appleassasasas";
        
        for(int i=0; i<cadena.length();i++){
            if(!map.containsKey(cadena.charAt(i))){
                map.put(cadena.charAt(i),1);
            }else {
                map.put(cadena.charAt(i),map.getOrDefault(cadena.charAt(i),1)+1 );
                
            }
        }
        int max=0;
        Character element = null;
        for(Map.Entry<Character,Integer> a: map.entrySet()){
            if(a.getValue()>max){
                element=a.getKey();
                max=a.getValue();
            }
            System.out.println("la letra "+a.getValue()+" y sus apariciones "+a.getKey());
        }
        System.out.println("El resultado de la siguiente operacion es la siguiente");
        System.out.println("MAxio de apariciones "+max +" del elemento "+element);
    }
}
