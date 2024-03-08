package challenge.tree;

import java.util.Scanner;

public class mainTree {

    public static void main(String[] args){
        int opc = 0;
        int aux=0;

        Scanner sc = new Scanner(System.in);
        TreeTree tree= new TreeTree();
        PrintTreeMenu menu= new PrintTreeMenu();


        do{
            opc=menu.printMenu(sc);
            switch (opc){
                case 1:
                    opc=menu.addNumber(sc);
                    tree.add(opc);
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    menu.ErrorMessage();
                    break;

            }




        }while(opc==4);

    }
}
