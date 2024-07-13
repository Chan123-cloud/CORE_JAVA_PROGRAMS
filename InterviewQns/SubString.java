package InterviewQns;

public class SubString {
	
	public static void main(String[] args) {
		
		String s = "chandrakumarr";
		  
		String d   = s.substring(3); // Starts from the second index.  // Continuous Sequence
		
		System.out.println(d);     
		
		
		
		
		String e = s.substring(0,5);  // Starts from 0 and ends in end index -1.
		
		
		System.out.println(e);
		
		
		
		
		String w = s.substring(s.length()-3); // prints last three  characters of a string
		
		
		System.out.println(w);
		
		
		
		
		
		CharSequence q = s.subSequence(1,3);  // Both continuous and discontinuous Sequence. 
		
		System.out.println(q);
		
		
		
		
        char c = s.charAt(0);   // It will print the Individual character.
		
		System.out.println(c);
		
}
}
