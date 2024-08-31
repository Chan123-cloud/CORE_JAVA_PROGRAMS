package File_Handling;

import java.io.File;

public class Delete_the_file {
	
	public static void main(String[] args) {
		
		File R = new File("C:\\Programs\\Chandra_Kumar M.txt");
		
		if(R.delete()) {
			
			System.out.println("File deleted"+" "+R.getName());
		}
		
		else {
			
			System.out.println("There is no file to delete");
		}
		
	}

}
