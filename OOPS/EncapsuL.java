package OOPS;

public class EncapsuL {
	
	private String name;
	
	private int age;
	
	private  String gender;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public int getAge() {
		
		return age;
	}

	public void setAge(int age) {
		
		this.age = age;
	}

	public String getGender() {
		
		return gender;
	}

	public void setGender(String gender) {
		
		this.gender = gender;
	}
	
	
    EncapsuL(int age){
	
	this.age = age;
	
   }
    
    EncapsuL(String name){
    	
    	this.name = name;
    	
       }
    
    EncapsuL(String gender ,int age){
    	
    	this.gender = gender;
    	
       }
    
    EncapsuL(int age, String name ){
	  
	    this(age);
    	
    	this.name = name;
    	
    	
    	
       }
    
    public void Print1() {
    	
    	System.out.println(name +" "+ age+" "+gender);
    }
}
