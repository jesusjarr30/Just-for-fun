package challenge.doublelinked;

public class LinkedList {
    private Node first;

    public LinkedList() {
        first = null;
    }

    public void addNode(int number) {

        if (first == null) {
            first = new Node(null, null, number);
        } else {
            Node aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(aux, null, number));
        }

    }

    public void eliminarNode(int number) {
        Node aux = first;
        while (aux != null) {
            if (aux.getNumber() == number) {
                Node anterior = aux.getBefore();
                Node siguiente = aux.getNext();
                if (anterior != null) {
                    siguiente.setBefore(anterior);

                    if (siguiente != null) {
                        anterior.setNext(siguiente);
                    }
                    aux = aux.getNext();
                }
                break;
            }
        }

    }

    public void buscarNode(int number) {

        Node aux = first;
        while (aux != null) {
            if (aux.getNumber() == number) {
                System.out.println("El numero " + number + " Si se encutra en la lista");
                break;
            }
            aux = aux.getNext();
        }
    }

    public void printNodes() {
        Node aux = first;
        while (aux != null) {
            System.out.println("EL numero es: " + aux.getNumber());
            aux = aux.getNext();
        }

    }

}
