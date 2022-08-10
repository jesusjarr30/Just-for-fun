package lista_doble;

public class Lista {

	Nodo first;
	Nodo last;
	
	
	Lista(){
		first=null;
		last=null;
	}

///create tree difrent methos to add 
	public void push(Estudiante student) {
		Nodo aux=first;
		if(first==null) {
			//for the fist elemetn
			first=new Nodo(null,student,null);
			
		}else {
			//that mean the lis isn't empty
			//aad the elemetn to the Nodo
			first=new Nodo(first,student,null);
			aux.setAnt(first);//set the before nodo
		}
	}

	public void printStack() {
		Nodo aux=first;
		while(aux!=null) {	
			aux.getEstudinate().print();
			aux=aux.getNext();	
		}
	}

	public void pop() {
		Nodo aux=first;
		if(aux==null) {
			System.out.println("Stack is empty");
			
		}else {
			//get the top element in the stack
			aux.getEstudinate().print();
			aux=aux.getNext();
			first.setNext(null);
			first=aux;
			System.out.println("Estudent left");
		}
	}

	public void encolar(Estudiante student) {
		Nodo aux=first;
		if(aux==null) {
			//add the fist element in the quee
			first=new Nodo(null,student,null);
			last=first;
			
		}else {
			first=new Nodo(aux,student,null);
			aux.setAnt(first);
		}
	}
	public void desencolar() {
		
		if(last==null) {
			System.out.println("no hay elelemnto en la cola");
			
		}else {
			
			last.getEstudinate().print();
			last=last.getAnt();
			
		}
		
	}

	public void printQuee() {
		Nodo aux = last;
		while(aux!=null) {
			
			aux.getEstudinate().print();
			aux=aux.getAnt();			
		}
		
	}
}
