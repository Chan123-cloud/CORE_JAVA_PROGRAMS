package Collection_List;

import java.util.Stack;

public class Stack_With_Without_gerneric_Inbuilt_Mthds {
	
	
	public static void main(String[] args) {
		
	
	
	Stack 	A = new Stack();  // without generic
	
	A.push(10);
	
	
	A.push(true);
	
	
	A.push('c');
	
	
	A.push("chandru");
	
	
	A.push(2323.433323423f);
	
	
	System.out.println(A);
	
	
	System.out.println();
	
	
	System.out.println(A.peek());  // top element will print
	
	
	System.out.println();
	
	
	while(!A.empty()) {
		
		System.out.println(A.pop());
		
		
	}
	
	System.out.println();
	
	
	Stack <String> B = new Stack <>();
	
	
    B.push("hen");  // to store the element
    
	
	B.push("cow");
	
	
	B.push("bull");
	
	
	B.push("calf");
	
	
	B.push("pig");
	
	
	System.out.println(B);
	
	
	System.out.println();
	
	
	System.out.println(B.peek());  // top element will print
	
	
	System.out.println();
	
	
	while(!B.empty()) {
		
		System.out.println(B.pop());  // to reterive the element
		
		
	}
	
	

}
}

