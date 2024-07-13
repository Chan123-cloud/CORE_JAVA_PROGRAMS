package BasicPrograms;

public class Driver_Casting_2 {

	public static void main(String[] args) {
		
		Upcasting_And_DownCasting A  = new Upcasting_And_DownCasting("RAMU");
		
		System.out.println(A.name);// only I can acess the parent class members here.
		
		
		// Instsance of operators 
		
		System.out.println(A instanceof Upcasting_And_DownCasting);
				
		System.out.println(A instanceof Upcasting_And_DownCasting1);  // false because not followed the rules.

		
		Upcasting_And_DownCasting1 Q = (Upcasting_And_DownCasting1)A;
		
		System.out.println(Q.name);
		
		System.out.println(Q.roll);
		
		// Eventhough there is no syntax error there will be run time error.
		
		// Because we are not direcly  typecast the parent to child
		
		// We have to follow the rules....
		
		
	}

}
