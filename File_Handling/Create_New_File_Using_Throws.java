package File_Handling;

import java.io.File;  // Used for the representation of the file and directory , pathname.


import java.io.IOException;  // Used to handle the Input and output Exception.


public class Create_New_File_Using_Throws {
	

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Programs\\Chandra_Kumar M.txt");
		
		
			
			if(f.createNewFile()) {
				
				System.out.println("FILE CREATED"+" "+ f.getName()); // get name gives the file name
			}
			
			else {
				
				System.out.println("FILE IS ALREADY EXSIST");
			}
			
		}
					
		}

		
		
	


