package challenge.listaSuper;

public class StrongPassword {

    public static void main(String [] args){

        String password="4700";
        System.out.println(minimumNumber(password.length(),password));

    }
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int faltas=0;
        boolean number = false, lower = false, upper = false, special = false;
        for(int i=0;i<n;i++){
            Character l=password.charAt(i);
            if(Character.isDigit(l))
                number=true;
            if(Character.isLowerCase(l))
                lower=true;
            if(Character.isUpperCase(l))
                upper=true;
            if(special_characters.contains(String.valueOf(l)))
                special=true;
        }
        if(number==false){
            faltas++;
        }
        if(lower==false)
            faltas++;
        if(upper==false)
            faltas++;
        if(special==false)
            faltas++;

        if(n<=5) {
            int aux=n+faltas;
            if(aux<=5){
                faltas=faltas +Math.abs(aux-6);
            }
        }
        return faltas;


    }
}
