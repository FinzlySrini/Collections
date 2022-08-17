package collections;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class vector {
public static void main(String[] args) throws Exception {
	//Collections<String> x = new Collections();
	Vector x = new Vector();
	x.add("hello");
	x.add("dfgh");
	
	Vector<String> obj = new Vector<>();
         obj.add("gslv");
         obj.add("hello");
         obj.set(1, "cds");
         obj.add("srini");
         System.out.println(obj.capacity());
         System.out.println(obj);
         obj.addElement("hi");
         System.out.println(obj);
         System.out.println(obj.contains("srini"));
         System.out.println(obj.containsAll(x));
        // obj.wait();
        /* try {
        	 obj.wait();
         }
         catch(IllegalMonitorStateException e){
       System.out.println("hg");
         }
         System.out.println(obj.toArray())

         
         try {
        	 obj.notify();
         }
         catch(IllegalMonitorStateException e){
       System.out.println("dv");
         }*/
         LinkedList l = new LinkedList();
         l.add(6);
         l.add(78);
         l.addLast(89);
         l.addAll(x);
         l.addFirst(9);
        // l.forEach(null);
         System.out.println(obj);
         System.out.println(x);
         System.out.println(l.descendingIterator());
         System.out.println(l.getFirst());
}        
}
