package challenge;

import java.util.LinkedList;
import java.util.Stack;

public class BalacedBrackets {
    public static void main(String[] args){

        System.out.println("Balanced Brackets");

        String s= "}][}}(}][))]";

        s=isBalanced(s);

        System.out.println("Is balanced ? "+s );

    }
    public static String isBalanced(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length();i++){
            //chech for opne brackes
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
                stack.add(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return "NO";
                }
                switch (s.charAt(i)){
                    case ')':
                        if(stack.pop()!='(')
                            return "NO";
                        break;
                    case '}':
                        if(stack.pop()!='{')
                            return "NO";
                        break;
                    case ']':
                        if(stack.pop()!='[')
                            return "NO";
                        break;
                    }
                }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return "YES";
    }
}
