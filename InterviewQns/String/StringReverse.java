package String;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s = "RAM";
		
		String k = "";
		
		for (int c =s.length()-1; c>=0  ;  c-- ) {
			
			k = k + s.charAt(c);
			
			
		}
		
		System.out.println(k);
		
	}

}
