package set;
import java.util.Iterator;

public class TreeSet {
	public static void main(String[]args) {
		java.util.TreeSet<String> nam= new java.util.TreeSet<String>();
		
		nam.add("naveen");
	    nam.add("prasad");
	    nam.add("Ramanathan");
	    nam.add("Elavarasan");
	    nam.add("Nandhakumar");
	    System.out.println("By Using Iterator");
	    Iterator<String> str =nam.iterator();
	    
	    while(str.hasNext()) {
	    	System.out.println(str.next());
	    }
	    
	    System.out.println("By Using ForEach");
	    for(String sub: nam) {
	    	System.out.println(sub);
	    }
	}


}
