package Wrapper_Class;

public class String_To_Primitive_Data_Type {
	
	public static void main(String[] args) {
	
	
     String s = "123232"; 
   
     System.out.println(s);
   
     int a = Integer.parseInt(s);   // only works for the  Ingteger Numbers
   
     System.out.println(a);
     
     
     
     String x = "12";   // Similar to  long and short
     
     System.out.println(x);
   
     byte x1 = Byte.parseByte(x);   // only works for the  Ingteger Numbers
   
     System.out.println(x1);
   
   
   
   
     String s1 ="true";   
   
     System.out.println(s1);
   
     boolean b = Boolean.parseBoolean(s);   // Works only if the String is  true or false
     
     System.out.println(b);
     
     
     String w ="12312.3232f";
     
     System.out.println(w);
     
     float f =  Float.parseFloat(w);  // only works for the decimels  //Similar to the double
     
     System.out.println(f);
     
     
     
      String r ="s";
     
      System.out.println(r);
     
      char c = s.charAt(0);   // Parse Character will not work here.
     
      System.out.println(c);
      
      
      
      
      
      
   
   
   
   
   
   
   
   
   

}
}
