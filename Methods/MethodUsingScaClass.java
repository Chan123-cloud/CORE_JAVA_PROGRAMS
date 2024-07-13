package Methods;

import java.util.Scanner;

public class MethodUsingScaClass {
	
	
	public static int add(int a , int b) {
		
		int c = a+b;
				
		return c ; 
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the value of a");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter the value of b");
		
		int n2 = sc.nextInt();
		
		System.out.println(add(n1 , n2));
		
		
		
		

	}

}
