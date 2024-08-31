package File_Handling;

import java.io.FileWriter;

import java.io.IOException;

public class Write_data_into_file_Using_Try_Catch {
	
	public static void main(String[] args) {
		
		String q = "Hello";
		
		try {
			
			FileWriter A = new FileWriter("C:\\Programs\\Chandra_Kumar M.txt");
			
			A.write(q);  // write is also used to write the data into the file. 
			
			A.close();
			
		} 
		
		catch (IOException e) {
	
			
			e.printStackTrace();
		}
		
		System.out.println("Data was Written Successfully");
		
	}

}
