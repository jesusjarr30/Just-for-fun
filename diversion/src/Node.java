import javax.management.MBeanRegistration;

public class Node {

    private Node next;
    private Node before;
    private String name;

    public Node(String name, Node before, Node next) {
        this.next = next;
        this.before = before;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Node getNext() {
        return next;
    }

    public Node getBefore() {
        return before;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNext(Node next) {
        this.next = next;

    }

    public void setBefore(Node before) {
        this.before = before;
    }

}
