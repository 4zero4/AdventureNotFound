package framework;

/*File Writer and Reader class by Runo*/

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileWizard {
	
	final static Charset ENCODING = StandardCharsets.UTF_8; //Assume file encoding is UTF-8

	public static ArrayList<String> readFile(String FileName) throws IOException {
		Path path = Paths.get(FileName); //Receives file name and directory relative to the program's root
		
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
			String currentLine = null;
			ArrayList<String> lines = new ArrayList<String>();
			
			while ((currentLine = reader.readLine()) != null) {
				//We ignore the line if it's empty or starts with an '!'
				if (!(currentLine.isEmpty() || currentLine.startsWith("!"))) {
					lines.add(currentLine); //Add the current line to the list
				}
			}
			return lines; //Return the lines in an ArrayList
		}
	}
  
	public static void writeFile(String FileName, List<String> Lines) throws IOException {
		Path path = Paths.get(FileName); //Receives file name and directory relative to the program's root
		
		try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
			for(String currentLine : Lines){
				writer.write(currentLine);
				writer.newLine();
			}
		}
		
	}
  
} 
