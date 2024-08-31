package File_Handling;

import java.io.File;

import java.io.FileNotFoundException;
 
import java.util.Scanner;

public class Read_the_file_Using_try_Catch {
	
	public static void main(String[] args) {
		
		File T = new File("C:\\Programs\\Chandra_Kumar M.txt");
		
		try {
			
			
			Scanner sc = new Scanner(T);
			
			while(sc.hasNextLine()) {
				
				String w = sc.nextLine();
				
				System.out.println(w);
				
			}
			
			sc.close();
			
			
		} 
		
		catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
		
	}

}
