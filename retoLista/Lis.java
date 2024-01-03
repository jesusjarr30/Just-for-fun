package challenge.retoLista;

public class Lis {
    private Node first;
    private Node last;

    public Lis(){
        this.first=null;
        this.last=null;
    }

    public void addStart( Car c){
        if(first==null){
            //meaning the list is empty
            first= new Node(null,null,c);
            last=first;
        }else{
            //add at the start of the list
            Node aux=first;
            first=new Node(aux,null,c);
            aux.setAfter(first);
        }

    }
    public void addEnd(Car c){
        if(last==null){
            first= new Node(null,null,c);
            last=first;
        }else{
            Node aux=last;
            last= new Node(null,aux,c);

        }

    }
    public void showStart(){

    }
    public void showEnd(){

    }
}
