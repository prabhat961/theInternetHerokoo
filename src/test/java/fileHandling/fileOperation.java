package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileOperation {

	public static void main(String[] args) throws IOException {
		// File Creation
		File file = new File("firstFile.txt"); //This statement will nor create the actual file but create an oblect of it.
		System.out.println(file.exists());//This verifies whether the file actually exists or not.
		file.createNewFile();
		//Write into that file.
		FileWriter fW =  new FileWriter(file);// for writting into the file we need to create a file writter object.
		fW.write("Hi My name is Prabhat and i have create this file with java code");
		fW.close();
		//Read from file.
		FileReader fr = new FileReader(file);
		fr.read();//This will red the file content. But we can use buffer reader and buffer writter for reading and writting
		
		
		
	}

}
