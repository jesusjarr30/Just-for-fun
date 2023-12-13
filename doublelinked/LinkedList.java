package challenge.doublelinked;

public class LinkedList {
    private Node first;

    LinkedList(){
        first=null;

    }
    public void add(int number){
        if(first==null){
            first=new Node(null,null,number);

        }else{
            Node aux=new Node(first,null,number);
            first.setBefore(aux);
            first=aux;
        }

    }
    public void printLinked(){
        Node aux=first;
        while(aux!=null){
            System.out.println(aux.getNumber());
            aux=aux.getNext();
        }

    }
    public void delete(int number){
        Node aux= first;
        Node auxBefore=null;
        Node auxNext=null;

        while(aux!=null){
            if(aux.getNumber()==number){
                //si eontro coincidencias
                auxBefore=aux.getBefore();
                auxNext=aux.getNext();
                auxBefore.setNext(auxNext);
                auxNext.setBefore(auxBefore);
                break;
            }
            aux=aux.getNext();
        }

    }
}
