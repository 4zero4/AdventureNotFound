package framework;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileWizard {
	
	final static Charset ENCODING = StandardCharsets.UTF_8;

	public static ArrayList<String> readFile(String FileName) throws IOException {
		Path path = Paths.get(FileName);
		
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
			String currentLine = null;
			ArrayList<String> lines = new ArrayList<String>();
			
			while ((currentLine = reader.readLine()) != null) {
				lines.add(currentLine);
			}
			
			return lines;
		}
	}
  
	public static void writeFile(String FileName, List<String> Lines) throws IOException {
		Path path = Paths.get(FileName);
		
		try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
			for(String currentLine : Lines){
				writer.write(currentLine);
				writer.newLine();
			}
		}
		
	}
  
} 
