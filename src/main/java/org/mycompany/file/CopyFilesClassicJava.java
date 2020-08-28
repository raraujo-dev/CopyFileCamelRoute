package org.mycompany.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class CopyFilesClassicJava {
	
	
	
	public static void main(String[] args) throws IOException {
		
	

	// Step 1 - Create a File Object to read the directories.

	File inputDirectory = new File("data/input");

	File outputDirectory = new File("data/output");

	// Step 2 - Read the files and iterate them

	File[] files = inputDirectory.listFiles();

	// Step 3 - Create the output stream and read the files

	for(
	File source:files)
	{

		if (source.isFile()) {

			File dest = new File(outputDirectory.getPath()
					+ File.separator
					+ source.getName());
			
			// Step 3 - Create a output stream to write the files
			
			OutputStream oStream = new FileOutputStream(dest);
			byte[] buffer = new byte[(int) source.length()];
			
			FileInputStream iStream = new FileInputStream(source);
			iStream.read(buffer);
			
			oStream.write(buffer);
			
			oStream.close();
			iStream.close();

		}

	}

	// Step 4 - Close the streams

}
	
}


