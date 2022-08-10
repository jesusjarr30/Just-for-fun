package arbol_binario3;

import java.util.Scanner;


public class Main {

	static public void main(String[] args) {
		
		
		int[] numbers= {5,16,20,23,1,3,8,4};
		Tree a=new Tree();
		Impresion m=new Impresion();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int opc=0;
		
		
		do {
			m.MenuP();
			try {
				opc=Integer.parseInt(sc.nextLine());
			}catch(Exception e) {
				m.FFail();
				opc=0;
			}
			switch(opc){
			
			case 1:
				//add node
				for(int i=0;i<numbers.length;i++) {
					a.add(numbers[i]);
				}
				
				
				break;
			case 2:
				a.deepSearch();
				break;
			case 3:
				a.breathsearch();
				break;
			}
		}while(opc!=4);
	}
   


}
