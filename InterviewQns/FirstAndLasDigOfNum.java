package InterviewQns;

import java.util.Scanner;

public class FirstAndLasDigOfNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		
		int first_digit = 0;
		
		int last_digit = b%10;
				
		while(b!=0) {
			
			first_digit = b%10;
			
			b=b/10;
		}
		
		System.out.println("The first digit is"+first_digit);
		
		System.out.println("The last digit is"+last_digit);
		
		

	}

}
