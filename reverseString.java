package challenge;

import java.util.Scanner;

public class reverseString {
	static public void main(String[] args) {
		String h;
		String aux="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		h=sc.nextLine();
		
		for(int i= h.length()-1; i>=0;i--) {
			aux+=h.charAt(i);
		}
		System.out.println("The reverse string is "+aux);
		
	}
}
