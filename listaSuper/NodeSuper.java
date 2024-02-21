package challenge.listaSuper;

public class NodeSuper {

    private NodeSuper before;
    private ProductSuper product;
    private NodeSuper next;

    public NodeSuper(NodeSuper before, ProductSuper product, NodeSuper next){
        this.before=before;
        this.product=product;
        this.next=next;
    }

    public NodeSuper getBefore() {
        return before;
    }

    public void setBefore(NodeSuper before) {
        this.before = before;
    }

    public ProductSuper getProduct() {
        return product;
    }

    public void setProduct(ProductSuper product) {
        this.product = product;
    }

    public NodeSuper getNext() {
        return next;
    }

    public void setNext(NodeSuper next) {
        this.next = next;
    }

}
