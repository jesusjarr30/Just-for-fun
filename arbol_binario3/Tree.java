package arbol_binario3;

import java.util.ArrayDeque;

import java.util.Queue;
import java.util.Stack;

public class Tree {

	private Nodo raiz;
	
	Tree(){
		raiz=null;
	}
	//add to the tree
	public void add(int number) {
		Nodo aux;
		Nodo a;
		//for the fist iteration
		if(raiz==null) {
			raiz=new Nodo();
			raiz.setNumber(number);

		}else {
			aux=raiz;
			while(aux!=null) {
				
				if(aux.getNumber() > number) {
					
					if(aux.getLeft()==null) {
						//we add in this place to the left
						a=new Nodo();//create nthe new nodo
						a.setNumber(number);
						aux.setLeft(a);//add the reference to the tree
						aux=null;
					}else {
						aux=aux.getLeft();//move to the left side
					}
				
				}else{
					//for the right 
					if(aux.getRight()==null) {
						a=new Nodo();
						a.setNumber(number);
						aux.setRight(a);
						aux=null;
						
					}else {
						aux=aux.getRight();
					}
				}
				
			}
			
			
		}
		
		
	}
	public void breathsearch() {
	
		
		Queue<Nodo> pQueue= new ArrayDeque<>();
		Nodo aux;
		if(raiz!=null) {
			pQueue.offer(raiz);
		}
		while(!pQueue.isEmpty()) {
			aux = pQueue.poll();
			System.out.println("the number is "+aux.getNumber());
			if(aux.getLeft()!=null) {
				pQueue.offer(aux.getLeft());	
			}
			if(aux.getRight()!=null) {
				pQueue.offer(aux.getRight());
			}
		}
		
		
		
	}
	public void deepSearch() {
		// TODO Auto-generated method stub
		Nodo aux;
		Stack<Nodo> pila=new Stack<Nodo>();
		
		if(raiz!=null) {
			pila.push(raiz);
		}
		System.out.println("la pila esta "+pila.isEmpty());
		while(!pila.isEmpty()) {
			aux=pila.pop();
			System.out.println("El numero es "+aux.getNumber());
			if(aux.getRight()!=null) {
				pila.push(aux.getRight());
					
			}
			if(aux.getLeft()!=null) {
				pila.push(aux.getLeft());
			}
			
		}
		
	}
	
}
