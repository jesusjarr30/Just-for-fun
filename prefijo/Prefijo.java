package prefijo;

public class Prefijo {

	public static void main(String[] args) {

    	String[] strs = {"flood","fly","flight"};
        String aux="";
        String first=strs[0];
        int cont=0;
        int todos=0;
        while(cont<first.length()) {
        	
        	for(int i=1;i<strs.length;i++) {
        		if(strs[i].length()>cont && first.charAt(cont)==strs[i].charAt(cont)) {
        			todos+=1;
        		}
        	}
        	//System.out.println("the cont is"+cont);
        	if(todos==strs.length-1) {
        		aux+=first.charAt(cont);
        	}else {
        		break;
        	}
        	todos=0;
        	cont++;
        }
        System.out.println("aux es "+aux);
		    
	}

}
