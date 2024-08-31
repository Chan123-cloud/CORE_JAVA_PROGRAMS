package File_Handling;

import java.io.FileWriter;

import java.io.IOException;

public class Write_data_Into_file_Using_throws {
	
	public static void main(String[] args) throws IOException {
		
	String S ="MY NAME IS CHANDRA KUMAR M \nI AM A SOFTWARE TESTER";

	FileWriter f = new FileWriter("C:\\Programs\\Chandra_Kumar M.txt");
	
	 f.append(S);  // append is also also used to write the data into the file.
	 
	 f.close();
	 
	 System.out.println("Data was written Sucessfully");
	}

}
