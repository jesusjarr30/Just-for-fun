package challenge.retoLista;

public class Node {

    private Node next;
    private Node  after;
    private Car c;

    public Node(Node next, Node after, Car c){
        this.next=next;
        this.after=after;
        this.c=c;
    }
    public Node getNext(){
        return next;
    }
    public Node getAfter(){
        return after;
    }
    public Car getCar(){
        return c;
    }

    //setter method

    public void setNext(Node next){
        this.next=next;
    }
    public void setAfter(Node after){
        this.after=after;
    }
    public void setCar(Car c){
        this.c=c;
    }

}
