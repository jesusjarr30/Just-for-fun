package challenge.arbol_binario3;

import java.util.Scanner;


public class Main {

	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opc =0;
		Nodo n=null;
		Tree a= new Tree();
		a.add(new Nodo(null,null,5));
		a.add(new Nodo(null,null,4));
		a.add(new Nodo(null,null,7));
		a.add(new Nodo(null,null,2));
		a.add(new Nodo(null,null,6));
		a.add(new Nodo(null,null,10));

		do{
			Impresion imp = new Impresion();
			imp.MenuP();
			opc=Integer.parseInt(sc.nextLine());
			switch (opc){
				case 1:
					n = imp.AddNode(sc);
					a.add(n);
					break;
				case 2:
					a.deepSearhc();
					break;
				case 3:
					a.BreadthSearch();
					break;
				case 4:
					n = imp.AddNode(sc);
					a.SeacrhByNumber(n);
					break;
				case 5:
					break;
			}


		}while(opc!= 6);


	}
}
