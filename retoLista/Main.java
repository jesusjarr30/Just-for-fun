package challenge.retoLista;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        System.out.println("Hello world :)");

        int opc=0;
        Car c=null;
        String aux;
        Lis l = new Lis();

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
                    //ask the user for the veriable neede for this
                    c=new Car();
                    System.out.println("Enter the model of the car");
                    aux=sc.nextLine();
                    c.setModel(aux);
                    System.out.println("Add the year of the car");
                    c.setYear(Integer.parseInt(sc.nextLine()));
                    l.addStart(c);
                    break;
                case 2:
                    c=new Car();
                    System.out.println("Enter the model of the car");
                    aux=sc.nextLine();
                    c.setModel(aux);
                    System.out.println("Add the year of the car");
                    c.setYear(Integer.parseInt(sc.nextLine()));
                    l.addEnd(c);
                    break;
                case 3:
                    System.out.println("Delete One node by the model of the Car");
                    aux=sc.nextLine();
                    l.deleteCar(aux);
                    break;
                case 4:
                    l.showEnd();
                    break;
                case 5:
                    l.showStart();
                    break;
            }
        }while(opc!=6);

        sc.close();
        System.out .println("the end");
    }
}
