package challenge.retoLista;

public class numbersWeird {
    public static void main(String[] args){
        System.out.println("The number is werid or not ");

        int n=20;

        if( (n%2) == 0 && (n>=2 && n<= 5)){
            System.out.println("Not Weird");
        }else

        if(n%2==0 && n>20){
            System.out.println("Not weird");
        }else
            System.out.println("Weird");
    }

}
