package String;

public class StringPalindrome {
	
public static void main(String[] args) {
		
		String s = "MAM";
		
		String A = s;
		
		String k = "";
		
		for (int c =s.length()-1; c>=0  ;  c-- ) {
			
			k = k + s.charAt(c);
			
			
		}
		
		System.out.println(k);
		
		if(A.equals(k)) {
			
			System.out.println("IT IS PALINDROME");
		}
		
		else {
			
			System.out.println("IT IS NOT A PALINDROME");
		}
		

}
}
