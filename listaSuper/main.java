package challenge.listaSuper;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        ListSuper l= new ListSuper();
        Scanner sc = new Scanner(System.in);

        int opc=0;

        do{
            System.out.println("Welcome to the shop");
            System.out.println("1. Add items to the list");
            System.out.println("2. Delete items by id");
            System.out.println("3. Print the list");
            opc=Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

            }
        }while(opc!=4);



    }
}
