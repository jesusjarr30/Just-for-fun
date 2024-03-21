package challenge.arbol_binario3;

public class Nodo {

	private Nodo left;
	private Nodo right;
	private int number;

	public Nodo(Nodo left, Nodo right, int number){
		this.number=number;
		this.left=left;
		this.right=right;
	}
	public void Nodo(){
		left=null;
		right= null;
		number=0;

	}
	public Nodo getLeft() {
		return left;
	}

	public void setLeft(Nodo left) {
		this.left = left;
	}

	public Nodo getRight() {
		return right;
	}

	public void setRight(Nodo right) {
		this.right = right;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
