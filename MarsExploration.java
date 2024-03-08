package challenge;

public class MarsExploration {
    public static void main(String[] args){
        String cadena="SOSSPSSQSSOR";
        System.out.println(marsExploration(cadena));

    }
    public static int marsExploration(String s) {
        // Write your code here
        String sos="SOS";
        int cont=0;
        int pivot=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!= sos.charAt(pivot)){
                cont++;
            }
            if(pivot==2){
                pivot=0;
            }else{
                pivot++;
            }
        }

        return cont;
    }
}
