package File_Handling;

import java.io.File;  // Used for the representation of the file and directory , pathname.


import java.io.IOException;  // Used to handle the Input and output Exception.



public class Create_New_File_Using_Try_Catch {
	

		public static void main(String[] args) {
			
			
			File f = new File("C:\\Programs\\Chandra_Kumar M.pdf"); // can also creatre the pdf file.
			
				
				try {
					
					if(f.createNewFile()) {
						
						System.out.println("FILE CREATED"+" "+ f.getName()); // get name gives the file name
					}
					
					else {
						
						System.out.println("FILE IS ALREADY EXSIST");
					}
					
					
				} catch (IOException e) {
				
					
					e.printStackTrace();   // default exception handler
				}
				
			}
						
			}

			
			
		


