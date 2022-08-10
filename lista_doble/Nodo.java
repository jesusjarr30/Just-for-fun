package lista_doble;

public class Nodo {

	
	private Nodo next;
	private Estudiante student;
	private Nodo ant;
	
	
	Nodo(Nodo next,Estudiante student,Nodo ant){
		this.next=next;
		this.student=student;
		this.ant=ant;
	}
	public void setNext(Nodo next) {
		this.next=next;
		
	}
	public void setEstudinate(Estudiante student) {
		this.student=student;
	}
	public void setAnt(Nodo ant) {
		this.ant=ant;
	}
	public Nodo getNext() {
		return next;
	}
	public Nodo getAnt() {
		return ant;
	}
	public Estudiante getEstudinate() {
		return student;
	}	
}
