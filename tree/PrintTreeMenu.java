package challenge.tree;

import java.util.Scanner;

public class PrintTreeMenu {

    public PrintTreeMenu(){

    }
    public int  printMenu(Scanner sc){
        int opc=0;
        System.out.println("Welcome to binary tree");
        System.out.println("1. Add to the tree");
        System.out.println("2. print tree");
        System.out.println("3. priont tree2");
        System.out.println("4. Exit application");
        opc = Integer.parseInt(sc.nextLine());
        return opc;
    }
    public int addNumber(Scanner sc){
        int number;
        System.out.println("Enter the number to add");
        number= Integer.parseInt(sc.nextLine());
        return number;
    }
    public int searchNumber(Scanner sc){
        int number;
        System.out.println("Check if your number is in the tree");
        number= Integer.parseInt(sc.nextLine());
        return number;
    }
    public void ErrorMessage(){
        System.out.println("Error while trying your request please try again");
    }

}
