package challenge.tree;

import challenge.retoLista.Node;

public class NodeTree {

    NodeTree father;
    NodeTree leftside;
    NodeTree rightside;
    int number;

    public NodeTree(){
        father=null;
        leftside=null;
        rightside=null;
        number=0;
    }
    public  NodeTree(NodeTree father,NodeTree leftside, NodeTree rightside, int number){
        this.father=father;
        this.leftside=leftside;
        this.rightside=rightside;
        this.number=number;
        }

    public NodeTree getFather() {
        return father;
    }

    public void setFather(NodeTree father) {
        this.father = father;
    }

    public NodeTree getLeftside() {
        return leftside;
    }

    public void setLeftside(NodeTree leftside) {
        this.leftside = leftside;
    }

    public NodeTree getRightside() {
        return rightside;
    }

    public void setRightside(NodeTree rightside) {
        this.rightside = rightside;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
