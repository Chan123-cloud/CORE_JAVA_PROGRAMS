package Collection_Queue;

import java.util.PriorityQueue;

import java.util.Queue;

public class PriorityQueue_With_Generic_Inbuilt_Methods {
	
	public static void main(String[] args) {
		
		Queue P = new PriorityQueue(); // declare is ok but non generic value is not acceptable.
	
	
		
		P.offer(4);
		
		P.offer(30102);
		
		P.offer(34);
		
		P.offer(32);  // Based on the Priority it will print  -- priority that based on the compiler
		
		P.offer(64);
		
	   
		
		System.out.println(P);
		
		System.out.println();
		
		
		System.out.println(P.peek());  // After the stroing the Element  which element is in top it will print
		
		
		System.out.println();
		
		
		while (!P.isEmpty()) {
			
			System.out.println(P.poll());  // Reterive the data in Ascending Order.
		}
		
		System.out.println();
		
		
        Queue P1 = new PriorityQueue();  // declare is ok but non generic value is not acceptable.
		
		
		P1.offer("ramu");
		
		P1.offer("damu");
		
		P1.offer("somu");
		
		P1.offer("moha");
		
		P1.offer("chandru");
		
		System.out.println(P1);  // it will print based on the priority that we give 
		
		System.out.println();
		
		
		System.out.println(P1.peek());  
		
		
		System.out.println();
		
		
		while (!P1.isEmpty()) {
			
			System.out.println(P1.poll());  // Reterive the data in Ascending Order.
		}
		
		
		
	}
}



