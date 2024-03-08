package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    public static void main(String[] args){
        ArrayList<String> cad= new ArrayList<>();

        cad.add("ebacd");
        cad.add("fghij");
        cad.add("olmkn");
        cad.add("trpqs");
        cad.add("xywuv");
    }
    public static String gridChallenge(List<String> grid) {
        // Write your code here
        for(int i=0;i<grid.size();i++){
            char[] caracter =grid.get(i).toCharArray();
            Arrays.sort(caracter);
            grid.set(i,new String(caracter));
        }
        //revisar para el segundo apuesta
        int tam=grid.size();//cuantas palabra son
        int largo=grid.get(0).length();//cuanto mide cada palabara
        int aux=0;
        boolean result=true;
        while(aux<largo){

            for(int i=0;i<tam-1;i++){
                if(grid.get(i).charAt(aux)<grid.get(i).charAt(aux)){
                    result=false;
                }


            }
            if(result==false){
                break;
            }
            aux++;
        }
        if(result){
            return "YES";
        }else {
            return "NO";
        }

    }

}
