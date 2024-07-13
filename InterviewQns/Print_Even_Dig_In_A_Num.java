package InterviewQns;

public class Print_Even_Dig_In_A_Num {
	
	
	public static boolean check(int n) {
		
		if(n%2==0) {
			
			return true;
		}
		
		if(n%2!=0) {
			
		return false;
		}
		
		return false;
	
		
	}
	
	public static void main(String[] args) {
		
		int b = 0;
		
		int num= 254654;
	
		while(num>0) {
			
		
		int a = num%10;
		
		
		if(a%2 ==0){
			
			b= b*10 +a;
		}
			num = num/10;
		
			
			
			
	}
		System.out.println("Reverse of a even number Number in des order"+" "+b);
		
		int rev = 0;
		
		int rem = 0;
				
		while(b>0) {
			
			rem = b%10;
			
			rev = rev*10 +rem;
			
			b=b/10;
			
		}
		
		System.out.println("Reverse of a number in the asc order"+" "+rev);
		
		
		System.out.println(check(rev));

}
}

