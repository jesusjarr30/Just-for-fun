package challenge;

public class NumberLineJump {
    public static void main(String[] args){

        int x1=9999;
        int v1=9999;
        int x2=9999;
        int v2=9999;
        System.out.println(kangaroo(x1,v1,x2,v2));


    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int maximo=10000;
        int result=x1;
        int result2=x2;
        for(int i=0;i<maximo;i++){
            result2+=v2;
            result+=v1;
            if(result==result2){
                return "YES";
            }
        }
        return "NO";
    }

}
