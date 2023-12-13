package challenge.Cola;

public class nodo {
    private nodo next;
    private nodo before;
    private int number;
    public nodo(nodo next, nodo before,int number){
        this.next=next;
        this.before=before;
        this.number=number;
    }
    public void setNext2(nodo next){
        this.next=next;
    }
    public void setBefore(nodo before){
        this.before=before;
    }
    public void setNumber2(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public nodo getBefore(){
        return before;
    }
    public nodo getNext(){
        return next;
    }
}
