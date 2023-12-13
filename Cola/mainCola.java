package challenge.Cola;

import java.util.Scanner;

public class mainCola {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("1. Agregar a la Cola");
            System.out.println("2. Desencolar");
            System.out.println("3. Imprimir la cola");
            System.out.println("4. Salir");
            opc=Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
            }

        }while(opc!=4);
        sc.close();
    }
}
