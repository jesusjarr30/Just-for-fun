package challenge.doublelinked;

import java.util.Scanner;

public class main {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        int number;
        LinkedList lista= new LinkedList();
        System.out.println("Lista doble");
        do{
            System.out.println("1. Agregar a la lista");
            System.out.println("2. Imprimir la lista");
            System.out.println("3. Eliminar por numero");
            System.out.println("4. Salir");
            opc= Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    System.out.println("Ingresa el numero que se desea ");
                    number= Integer.parseInt(sc.nextLine());
                    lista.add(number);
                break;

                case 2:
                lista.printLinked();
                    break;
                case 3:
                    System.out.println("Ingresa el numero que se desea eliminar ");
                    number= Integer.parseInt(sc.nextLine());
                    lista.delete(number);

                break;
            }
        }while(opc!=4);
    }
}
