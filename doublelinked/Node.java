package challenge.doublelinked;

public class Node {
    private Node before;
    private Node next;
    private int number;

    public Node(Node before, Node next, int number) {
        this.before = before;
        this.next = next;
        this.number = number;

    }

    public Node getBefore() {
        return before;
    }

    public Node getNext() {
        return next;
    }

    public int getNumber() {
        return number;
    }

    public void setBefore(Node before) {
        this.before = before;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
