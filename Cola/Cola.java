package challenge.Cola;

public class Cola {
    private nodo first;
    private nodo last;

    public Cola(){
        first=null;
        last=null;
    }
    public void addCola(int number){
        if(first ==null ){
            first.setNext2(new nodo(null,null,number));
            last.setBefore(first);
        }
    }
    public int desencolar(){
        return 0;
    }
    public void printQuee(){

    }

}
