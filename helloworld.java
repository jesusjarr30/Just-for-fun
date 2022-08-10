package challenge;

public class helloworld {
	static public void main(String[] args) {
		
		String h="Hello world";
		System.out.println("Hello world");
		for(int i=0;i<h.length();i++) {
			System.out.println(h.charAt(i));
		}
		System.out.println("");
		for(int i=h.length()-1;i>=0;i--) {
			System.out.println(h.charAt(i));
		}
		
	}
}
