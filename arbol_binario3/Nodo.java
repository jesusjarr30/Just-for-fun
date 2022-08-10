package arbol_binario3;

public class Nodo {

	private Nodo left;
	private Nodo right;
	private Nodo father;
	private int number;
	
	
	Nodo(){
		setFather(null);
		setLeft(null);
		setRight(null);
		setNumber(0);
	
		
	}
	public void setLeft(Nodo left) {
		this.left=left;
	}
	public void setRight(Nodo right) {
		this.right=right;
	}
	public void setNumber(int number) {
		this.number=number;
		
	}
	public void setFather(Nodo father) {
		this.father=father;
	}
	public int getNumber() {
		return number;
		
	}
	public Nodo getLeft() {
		return left;
		
	}
	public Nodo getRight() {
		return right;
	}
	public Nodo getFather() {
		return father;
	}
	
}
