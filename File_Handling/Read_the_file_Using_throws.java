package File_Handling;

import java.util.Scanner;

import java.io.File;
 
import java.io.FileNotFoundException;

public class Read_the_file_Using_throws {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File e = new File("C:\\Programs\\Chandra_Kumar M.txt");
		
		Scanner sc = new Scanner(e);
		
		while(sc.hasNextLine()) {
			
			String A = sc.nextLine();
	
			System.out.println(A);
			
		}	
		
		
		sc.close();
		
		
		
	}

}
