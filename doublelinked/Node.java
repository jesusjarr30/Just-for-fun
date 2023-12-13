package challenge.doublelinked;

public class Node {
    private Node next;
    private Node before;
    private int number;
    Node (Node next, Node before, int number){
        this.next=next;
        this.before=before;
        this.number=number;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public void setBefore(Node before){
        this.before=before;
    }
    public void setNumber(int number){
    this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public Node getNext(){
        return next;
    }
    public Node getBefore(){
        return before;
    }
}
