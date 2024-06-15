package challenge.doublelinked;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opc = 0;
        int aux = 0;
        Scanner sc = new Scanner(System.in);
        LinkedList lista = new LinkedList();

        do {
            System.out.println("1. Agregar elemento a la lista");
            System.out.println("2. Eliminar nodo de la lista");
            System.out.println("3. Buscar un elemento de la lista");
            System.out.println("4. imprimir la lista");
            System.out.println("5. Salir de la aplicacion");

            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Solo se admiten numeros en este aparado");
                opc = 0;
            }
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el numero que desea entrar");
                    try {
                        aux = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Solo se admite numeros");
                    }
                    lista.addNode(aux);
                    break;
                case 2:
                    System.out.println("Eliminar Nodo de la lista");
                    try {
                        aux = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Solo se admite numeros");
                    }

                    break;
                case 3:
                    System.out.println("Buscar nodo en la lista ");
                    try {
                        aux = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Solo se admite numeros");
                    }
                    break;
                case 4:
                    break;

            }

        } while (opc != 5);


    }
}
