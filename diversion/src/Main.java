import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int opc = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add to the list");
            System.out.println("2. Delete from the list");
            System.out.println("3. Print the list");
            opc = Integer.parseInt(sc.nextLine());

            
        } while (opc != 4);


    }
}