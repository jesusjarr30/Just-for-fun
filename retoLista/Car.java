package challenge.retoLista;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year){
        this.model=model;
        this.year=year;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
}
