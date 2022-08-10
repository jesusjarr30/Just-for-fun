package lista_doble;

import java.util.Scanner;

public class Main {

	
	
	static public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Impresion m=new Impresion();
		Lista l=new Lista();
		Estudiante student;
		int opc=0;
		
		do {
			
			m.menuP();
			try {
				opc=Integer.parseInt(sc.nextLine());
			}	
			catch(Exception e){
				opc=0;
				
			}
			switch(opc) {
			case 1:
				student=m.createStudent(sc);
				l.push(student);
				break;
			case 2:
				//pop method
				l.pop();
				break;
			case 3:
				student=m.createStudent(sc);
				l.encolar(student);
				break;
			case 4:
				l.desencolar();
				break;
			case 5:
				//print the stack
				l.printStack();
				break;
			case 6:
				l.printQuee();
				break;
				
			}
			
			
		}while(opc!=9);
		
	}
	
	
	
	
}
