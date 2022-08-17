package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HassSET {
public static void main(String[] args) {
	
	  HashSet hs = new HashSet();
	  hs.add(44);
	  hs.add(3948); 
	  hs.add("srini");
	  System.out.println(hs.iterator()); 
	  System.out.println(hs.getClass());
	  System.out.println(hs.retainAll(hs)); 
	  System.out.println(hs.spliterator());
	 
	TreeSet<Integer> ts = new TreeSet<>();
	//ts.add("scsc");
	ts.add(3);
	ts.add(3444);
	ts.add(4);
	System.out.println(ts.floor(34444));
	System.out.println(ts.higher(2));
	System.out.println(ts.headSet(5));
	
}

public static int run() {
	
   TreeSet tss = new TreeSet();
   tss.add(1);
   tss.add(2);
   tss.add(3);
return 0;
   
}
public static int run1() {
	return 0;
	
}
}