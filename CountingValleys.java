package challenge;

public class CountingValleys {
    public static void main(String[] args){
        String cadena= "DDUUUUDD";
        System.out.println(countingValleys(0,cadena));

    }
    public static int countingValleys(int steps, String path){
        int cont=0;
        int value=0;
        boolean band=false;
        for( int i=0; i<path.length();i++){
            if(path.charAt(i)=='D'){
                value--;
                if(value<0){
                    band=true;
                }
            }else{
                value++;
            }

            if(value==0 && band==true){
                band=false;
                cont++;
            }

        }


        return cont;
    }
}
