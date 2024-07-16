package Array;

public class RemovingTheEleInArray {
	
	public static void main(String[] args) {
		
	
	
	int a[] = {10,20,30,40,50};
	
	for(int i: a) {
		
		if(i == 30) {
			
			continue;
		}
		
		else {
		
			System.out.println(i);
		}
	}

}
}
