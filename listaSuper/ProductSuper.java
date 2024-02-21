package challenge.listaSuper;

public class ProductSuper {
    private String id;
    private String name;
    private String cost;

    public ProductSuper(String id,String name,String cost){
        this.id=id;
        this.name=name;
        this.cost=cost;
    }
    public String getId(){
        return this.id;
    }
    public String detName(){
        return this.name;
    }
    public String getCost(){
        return this.cost;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(String cost){
        this.cost=cost;
    }
   public void imprimir(){
        System.out.println("ID product "+id);
        System.out.println("Name id "+name);
        System.out.println("The cost is "+cost);
   }
}
