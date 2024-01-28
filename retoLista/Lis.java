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
        Node aux=first;
        while(aux!=null){
            aux.getCar().print();
            aux=aux.getNext();

        }

    }

    public void showEnd(){
        Node aux=last;
        while(aux!=null){

            aux.getCar().print();
            aux=aux.getAfter();
        }

    }
    public void deleteCar(String model){

        Node aux=first;
        Node auxNext=null;
        Node auxAfter=null;

        boolean band=false;
        while(aux!=null){
            if(aux.getCar().getModel().equals(model)){
                //we need to delte the car
                auxNext=aux.getNext();
                auxAfter=aux.getAfter();
                auxNext.setAfter(auxAfter);
                auxAfter.setNext(auxNext);
                band=true;
                aux=null;
            }
            aux=aux.getNext();
        }
        ///print the result of the operation
        if (band){
            System.out.println("The car is delted, and cab be recovered");
        }else{
            System.out.println("We can't find the car to delete it");
        }
    }

}
