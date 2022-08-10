package lista_doble;

import java.util.Scanner;

public class Impresion {

	Impresion(){	
	}
	public void menuP() {
		System.out.println("     Menu     ");
		System.out.println("1. push ");
		System.out.println("2. Pop");
		System.out.println("3. encolar");
		System.out.println("4. desencolar");
		System.out.println("5 Imprimir por el como pila");
		System.out.println("6. Imprimir como cola");
		System.out.println("7. exit");
		
	}
	
	public void FailMss() {
		System.out.println("ingrese ona ocion de manera correcta");
	}
	public Estudiante createStudent(Scanner sc) {
		String name="";
		int age=0;
		int codigo=0;
		System.out.println("Ingrese el nombre completo del estudinate");
		name=sc.nextLine();
		System.out.println("Ingrese edad del estudiante");
		age=Integer.parseInt(sc.nextLine());
		System.out.println("Ingere codigo del estudinate");
		codigo=Integer.parseInt(sc.nextLine());
		Estudiante a =new Estudiante(name,age,codigo);
		return a;
	}
	
}
