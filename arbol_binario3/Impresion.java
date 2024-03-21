package challenge.arbol_binario3;

import java.util.Scanner;

public class Impresion {

	
	
	public void MenuP() {
		System.out.println("---Menu----");
		System.out.println("1. add Node to the tree");
		System.out.println("2. deepSearhc");
		System.out.println("3. Breadth search");
		System.out.println("4. Search by number");
		System.out.println("5. Height of a tree");
		System.out.println("6. Extit");
	}

	public void FFail() {
		// TODO Auto-generated method stub
		System.out.println("Enter a correct option");
	}
	public Nodo AddNode(Scanner sc){
		int number=0;
		System.out.println("Enter the number you want to add to the tree");
		number = Integer.parseInt(sc.nextLine());
		return new Nodo(null,null,number);

	}
}
