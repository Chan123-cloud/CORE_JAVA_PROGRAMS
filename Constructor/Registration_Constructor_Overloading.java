package Constructor;

public class Registration_Constructor_Overloading {
	
	 String pre_University;
	  
	 double income_Certificate_NO ;
	  
	 int Birth_Certificate_NO ;
	 
	 
	  
	 Registration_Constructor_Overloading ( int Birth_Certificate_NO){
		 
		 this.Birth_Certificate_NO = Birth_Certificate_NO;
		  
	  }
	 
	 
	  
	 Registration_Constructor_Overloading(int Birth_Certificate_NO , double income_Certificate_NO) {
	
		 this.Birth_Certificate_NO = Birth_Certificate_NO;
		 
		 this.income_Certificate_NO = income_Certificate_NO;
		 
		   }
	 
	 
	 
    Registration_Constructor_Overloading(double income_Certificate_NO,  int Birth_Certificate_NO){
	 
	 this.income_Certificate_NO = income_Certificate_NO;
	 
	 this.Birth_Certificate_NO = Birth_Certificate_NO;
	 
		 
	 }
	 
    
    
	 Registration_Constructor_Overloading(String pre_University , int Birth_Certificate_NO ){
		 
		 this.pre_University = pre_University;
		 
		 this.Birth_Certificate_NO = Birth_Certificate_NO;
		 
	
		  
	 }
	 
	 
	 
	 Registration_Constructor_Overloading(String pre_University){
		 
		this.pre_University = pre_University;
		  
	 }
	 
	 
	
	 
	 public void Print() {
		 
		 System.out.println(pre_University+" "+income_Certificate_NO+" "+Birth_Certificate_NO);
	 }
	 

}
