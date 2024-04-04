package challenge.SocketT;

public class Estudiante {

    private String name;
    private int age;
    private String institute;

    public Estudiante(String name, int age, String institute) {
        this.name = name;
        this.age = age;
        this.institute = institute;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String institute) {
        this.institute = institute;
    }

    public String getName() {
        return this.name;
    }

    public String getInstitute() {
        return institute;
    }

    public int getAge() {
        return this.age;
    }

}
