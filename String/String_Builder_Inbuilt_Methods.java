package String;

public class String_Builder_Inbuilt_Methods {
	
	
	public static void main(String[] args) {
		
		StringBuilder A =new StringBuilder("chandru");
		
		StringBuilder B = new StringBuilder("chandru");
		
		
		
		String c = "damu";
		
		String d ="chandru";
		
		

		
        StringBuilder sb1 =new StringBuilder("love");
		
		StringBuilder sb2 = new StringBuilder("love");
		
		StringBuilder I = new StringBuilder("");
		
		StringBuilder J = new StringBuilder("SURIYAN");
		
		
		
		
		
	//  Content Equals  -- Used to compare one sting with the string Buffer and builder  (used to compare the string family)
		               
		
		              // --- It wiill not work for the two sb....
		
		
		System.out.println(d.contentEquals(A)); // String with String Builder.
		
		
	    String q= "dam";
		
		StringBuilder w = new StringBuilder("dam");
		
		System.out.println(q.contentEquals(w));
		
		
		
		
		
		// Capacity  -- Default Capacity for the sb is 16 
		
		System.out.println(I.capacity());
		
		
		// append
		
		System.out.println(A.append(B)); // StringBuilder with another Sb
		
		System.out.println(B.append(c));  // Sb with a string....  Both the append methods will work.
		
		
		
		// But here concat method will not work for string buffer and builder
		
		
		// reverse
		
		System.out.println(B.reverse());   // Directly we can reverse the sb
		
		StringBuilder C = new StringBuilder(c);   // we can get the string in sb and we can reverse... Both are Possible.
		
		System.out.println(A.reverse());
		
		
		
		
	   //equals
		

		
		System.out.println(B.equals(B));  // It will retrun true only if it is equal to it only.
		
		System.out.println(B.equals(A));
		                                   // In all these Conditions it will return false.
		System.out.println(A.equals(d));
		
		
		
	// If we need to compare the contents in the two String Builders we can use the tostring() with the ref variables.
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		
	// insert -- Used to add the data into the String Buffer and Builder.
		
		
	System.out.println(sb2.insert(0, "hi I "));  // we can also add the string
		
		
	char a[] = {'a','b'};
	
	System.out.println(sb2.insert(0, a));  // we can also add the characters
	
	
	
	// Converted the StringBuilder into the String
	
	StringBuilder E = new StringBuilder("MAMA");
	
	String X= new String(E);
	
	System.out.println(X);
	

	// replace ---  we can replcae the characters in the string Builder by giving the index.
	
	
	System.out.println(E.replace(0, 2, "AM"));
	
	
	// delete and deleteCharAt ----  we can able to delete the characters in the string Builder by giving the Index.
	
	
	System.out.println(E.deleteCharAt(0));  // Deleting the Specific Character in the String Builder.
	
	
	System.out.println(J.delete(0, 2));   // Deleting the characters from the string Builder with in the given indexes.
	
	
	
	
	
	}

}
