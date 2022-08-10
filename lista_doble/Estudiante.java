package lista_doble;

public class Estudiante {

	private String name;
	private int age;
	private int codigo;
	
	
	Estudiante(String name,int age,int codigo){
		this.name=name;
		this.age=age;
		this.codigo=codigo;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
		
	}

	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void print() {
		System.out.println("-----------");
		System.out.println(" Name    "+name);
		System.out.println("Age      "+age) ;
		System.out.println("Codigo   "+codigo);
		
		}
	
}
