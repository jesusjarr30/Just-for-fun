package challenge.retoLista;

public class SuperDigit {
    public static void main(String[] args){

        System.out.println("Supper Digit");
        String n="9875";
        int k= 4;
        System.out.println(superDigit(n,k));

    }
    static int superDigit(String n, int k) {
        long sum = 0;
        for (char digit : n.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        sum *= k;
        return recursiveSuperDigit(sum);
    }

    static int recursiveSuperDigit(long num) {

        if (num < 10) {
            return (int) num;
        }

        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return recursiveSuperDigit(sum);
    }

    }



