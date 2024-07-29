package String;

  public class In_Built_Methods_In_String {
	
	public static void main(String[] args) {
		
	
	
	String s = new String("CHANDRA KUMAR M");
	
	String s1 = "MOHAN";
	
	String s3 ="mohan" ;
	
	String s4 = " suresh ";
	
	String s5 ="MOHAN";
	
	String s6 = "HI CHANDRA KUMAR M";
	
	String s7 = " ";
	
	String s8 ="";
	
	
	// concat
	
	System.out.println(s.concat(s3));
	
	// Here append method will not work for the two strings
	
	
	//Length
	
	System.out.println(s.length());
	
	System.out.println(s1.length());
	
	//charAt
	
	System.out.println(s.charAt(0));
	
	System.out.println(s1.charAt(0));
	
	
	// compare the Address 
	
	System.out.println(s1==s5);
	
	// Hascode
	
	System.out.println(s1.hashCode());
	
	System.out.println(s5.hashCode());
	
	System.out.println(s1.hashCode()==s5.hashCode());
	
	// equals  -- compare only two strings
	
	System.out.println(s.equals(s1));
	
	
	// contentEquals
	
	System.out.println(s.contentEquals(s1));
	
	// equalsIgnorecase
	
	System.out.println(s1.equalsIgnoreCase(s3));
	
	// trim - remove the leading and trailing work spaces
	
	System.out.println(s4.trim());
	
	// contains
	
	System.out.println(s.contains("a"));
	
	System.out.println(s5.contains(s1));
	
	
	
	
	
	/*subString  ---It gives the contigous characters in that particular string 
	
	
	and maintains the relative order*/
	
	
	System.out.println(s1.substring(2));
	
	System.out.println(s3.substring(1,4));   // it will print 1 to 3 last values have to give +1
	
//	System.out.println(s6.substring(5,2));     // Index out of bound
	
//	System.out.println(s6.substring(2,-1));   // Index out of bound
	
	System.out.println(s6.substring(0,0));  // blank space
	
	
	
	
	
	
	/* Sub Sequence -- It gives the contigious or non contigious characters in that particular string 
	
	  and should maintains the relative order.*/
	
	
	
	System.out.println(s4.subSequence(0,3));
	
	
	
	
	
	//indexOf
	
	System.out.println(s4.indexOf("h"));
	
	
	//lastIndexOf
	
	System.out.println(s3.lastIndexOf("o"));
	
	//toUppercase
	
	System.out.println(s3.toUpperCase());
	
	// to LowerCase
	
	System.out.println(s6.toLowerCase());
	
	// Isempty
	
	System.out.println(s7.isEmpty());
	
	System.out.println(s8.isEmpty());
	
	// IsBlank
	
	System.out.println(s7.isBlank());  // retuns true if it is empty and balnk space
	
	
	System.out.println(s8.isBlank());
	
	// concat 
	
	
	System.out.println(s1+ " " + s3);
	
	
	// StartsWith
	
	System.out.println(s.startsWith("CH"));
	
	System.out.println(s3.startsWith("moha"));
	
	// EndsWith
	
	System.out.println(s7.endsWith(" "));
	
	System.out.println(s5.endsWith(s1));  // this is also possible here
	
	
	// replace
	
	System.out.println(s.replace('A', 'E'));
	
	System.out.println(s3.replace("moh", "Rom"));
	
	
	String k ="Apple";
	
	// replacAll
	
	System.out.println(k.replaceAll("[aeiouAEIOU]", "!"));
	
	
	System.out.println(k.replaceAll("p" ,"@"));
	
	
	String k1 =" CHANdru";
	
	
	System.out.println(k1.replaceAll(k1,k));
	
	
	System.out.println(k1.replaceAll("[A-Z]" ,"*"));
	
	
	System.out.println(k1.replaceAll("[a-z]","+"));
	
	
	
	String k2= "hello123hi45678910";
	
	
	System.out.println(k2.replaceAll("[0-9]","^"));
	
	
	// replaceFirst
	
	String d ="dhanush raj";
			
	String f = "a";
	
	System.out.println(d.replaceFirst(f,"e"));
	
	
	
	// spilt 
	
	String w =" HI I AM CHANDRA KUMAR M";
	
	
	String a[] = w.split(" ");  // Here we have to store the String in the String Array
	
	
	
	for( String ele : a) {
		
		
		System.out.println(ele);
	}
	
	
	// toCharArray
	
	char c[] = w.toCharArray();
	
	for( char q: c) {
		
		System.out.println(q);
	}
	

	// repeat ---  It will repeat the string for the times that we give.
	
	System.out.println(s4.repeat(5));
	
	
	
	//indent  -- It will leave the space how much that we given as a Int and then it will print the String.
	
	System.out.println(s5.indent(5));
	
	
	// Want to change the Specific String Character
	
	String I = "faluda";
	
	
	if(I.charAt(0)== 'f')
		
		System.out.println(I.replace('f', 'B'));
	
	
	
	// join -- It is used to join the some characters in the end of the  two or more Arguments
	
	
	      System.out.println(String.join("!#$", s3,s4));
	      
	      
	    
     
     
	}
	
	
	
	
	

}
