package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
public static void main(String[] args) {
	ArrayList<Integer> obj = new ArrayList<>();
	obj.add(4);
	obj.add(67);
	obj.add(6);
	obj.add(34);
	obj.add(2);
	obj.add(492);
	obj.add(86);
	obj.add(4);

	//obj.add("gslv");
	
	System.out.println(obj);                   // prints all the elements in the ArrayList
	System.out.println("*************");
	System.out.println(obj.get(3));            // to get the 3rd index
	System.out.println(Collections.max(obj));  // to get maximum value in the array
	System.out.println(obj.isEmpty());         // checks weather the list is empty or not?
	System.out.println(obj.add(344));          // adding new value to the list
	System.out.println(obj);
	Collections.sort(obj);                     // sorting the array
	System.out.println(obj);   
	System.out.println(obj.hashCode());
	System.out.println(obj.clone());           // clones the element in the array 
	
	for(int values : obj) {
		System.out.println(values);
	}
}
}