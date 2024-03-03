package challenge.tree;

import java.time.temporal.Temporal;

public class TreeTree {
    private NodeTree tree;

    public TreeTree(){
        tree=null;

    }
    //add number to the tree
    public void add(int number){

        //check if this is the fist number in the tree
        if(tree==null){
            tree= new NodeTree(null,null,null,number);

        }else{
            //travel to the right path in the tree
            NodeTree aux=tree;
            while(true){
                //left side

                //right side

            }

        }

    }
    //impirmir busqueda en profundidad
    public void print1(){

    }
    //imprimir busqueda en anchura
    public void print2(){

    }


}
