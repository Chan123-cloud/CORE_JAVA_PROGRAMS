package Wrapper_Class;

public class String_To_Other_Non_Primitive_Data_Type {
	
	public static void main(String[] args) {
		
	
	
	String o = "123232"; 
    
    System.out.println(o);
  
    Integer o1 = Integer.parseInt(o);   
  
    System.out.println(o1);
    
    
    
    String x = "12";   // Similar to  long and short
    
    System.out.println(x);
  
    Byte x1 = Byte.parseByte(x);   // only works for the  Ingteger Numbers
  
    System.out.println(x1);
  
  
  
  
    String s1 ="true";   
  
    System.out.println(s1);
  
    Boolean b = Boolean.parseBoolean(s1);   // Works only if the String is  true or false
    
    System.out.println(b);
    
    
    
    
    String w ="12312.3232f";
    
    System.out.println(w);
    
    Float f =  Float.parseFloat(w);  // only works for the decimels  //Similar to the double
    
    System.out.println(f);
    
    
    
    
    String r ="s";
    
    System.out.println(r);
   
    Character  c = r.charAt(0);   // Parse Character will not work here.
   
    System.out.println(c);
    
    
    

}
}
