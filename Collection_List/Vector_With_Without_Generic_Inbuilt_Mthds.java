package Collection_List;

import java.util.Vector;

public class Vector_With_Without_Generic_Inbuilt_Mthds {
	
	public static void main(String[] args) {
		

	Vector W = new Vector();
	
	W.addElement(false);        // It will add all the elements to the vector list
	
	W.addElement("chandra kumar M");
	
	W.addElement('A');
	
	W.addElement(2312312312.34324312132324);
	
	W.addElement(103333131131L);
	
	System.out.println(W);
	
	
	
	System.out.println();
	
	
	
	W.addFirst(34);  // add at first
	
	W.addLast(true);  // add at last
	
	System.out.println(W);
	
	
	System.out.println();
	
	
	System.out.println(W.size());  // gives the length 
	
	
	System.out.println();
	
	
	System.out.println(W.firstElement());  // print the first element
	
	System.out.println(W.lastElement());   // print the last element
	
	
	System.out.println();
	
	
	W.removeElement(34);  // remove the given element
	
	System.out.println(W);
	
	
	System.out.println();
	
	
    W.removeAllElements();  // remove all the elements

   System.out.println(W);
   
   
   
	
	
	System.out.println();
	
	
	
	
	
   Vector<String> V = new Vector <>();
	
	V.addElement("mon");        // It will add all the elements to the vector list
	
	V.addElement("tue");
	
	V.addElement("wed");
	
	V.addElement("thrus");
	
	V.addElement("fri");
	
	System.out.println(V);
	
	
	
	System.out.println();
	
	
	
	V.addFirst("sun");  // add at first
	
	V.addLast("sat");  // add at last
	
	System.out.println(V);
	
	
	System.out.println();
	
	
	System.out.println(V.size());  // gives the length 
	
	
	System.out.println();
	
	
	System.out.println(V.firstElement());  // print the first element
	
	System.out.println(V.lastElement());   // print the last element
	
	
	System.out.println();
	
	
	V.removeElement("mon");  // remove the given element
	
	System.out.println(V);
	
	
	System.out.println();
	
	
    V.removeAllElements();  // remove all the elements

   System.out.println(V);
	
	
	
	
	
	
	

}
}
