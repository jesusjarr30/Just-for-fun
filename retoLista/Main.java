package challenge.retoLista;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        System.out.println("Hello world :)");

        int opc=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Welcome to the double linked list");
            System.out.println("Options");
            System.out.println("1. Add a car in front of the list");
            System.out.println("2. Add a car at the end of the list");
            System.out.println("3. Delete any Node from the list");
            System.out.println("4. Show the lis by for the end");
            System.out.println("5. Show the list by the start of the list");
            System.out.println("6. Exit");
            opc=Integer.parseInt(sc.nextLine());

            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(opc!=6);

        sc.close();
        System.out .println("the end");
    }
}
