package challenge.arbol_binario3;
import java.util.*;

public class Tree {
	private Nodo father;

	public Tree(){
		father=null;
	}
	public void add(Nodo a){
		//add the node to the tree
		if(father==null){
			father=a;
		}else{
			//look the tree
			int n=a.getNumber();
			Nodo aux=father;
			while(true){
				if(n>aux.getNumber()){
					//right side
					if(aux.getRight()==null){
						//add the nhode here
						aux.setRight(a);
						break;
					}else{
						aux=aux.getRight();
					}
				}else{
					if(aux.getLeft()==null){
						//add the nhode here
						aux.setLeft(a);
						break;
					}else{
						aux=aux.getLeft();
					}
				}
			}
		}

	}
	public void deepSearhc(){
		Stack<Nodo> pila = new Stack<>();
		Nodo aux=null;
		pila.add(father);

		while(!pila.isEmpty()){
			aux=pila.pop();
			if(aux.getRight()!= null)
				pila.add(aux.getRight());
			if(aux.getLeft()!=null){
				pila.add(aux.getLeft());
			}
			System.out.println("number "+ aux.getNumber());
		}
	}
	public void BreadthSearch(){
		Queue<Nodo> queue = new LinkedList<>();
		queue.add(father);
		Nodo aux=null;

		while(!queue.isEmpty()){
			aux=queue.poll();
			if(aux.getLeft()!=null){
				queue.add(aux.getLeft());
			}
			if(aux.getRight()!= null)
				queue.add(aux.getRight());
			System.out.println("number "+aux.getNumber());
		}
	}
	public void SeacrhByNumber(Nodo n){
		int number = n.getNumber();

		//buscart el numero que se requiere y ya es lo ultmio que hago el dia de hoyu

		Nodo aux= father;
		boolean band= false;
		while(aux!=null){
			if(aux.getNumber()== number){
				System.out.println("The number is in the tree");
			}

		}

		if(band==false){
			System.out.println("The number you are looking is not in the Tree");
		}



	}
	public void HeightTree(){

	}



}
