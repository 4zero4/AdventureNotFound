package framework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileWizard {
	
	final static Charset ENCODING = StandardCharsets.UTF_8;
  
	/*public static void main(String[] args) throws IOException{
		
		List<String> lines;
		lines = Arrays.asList("Thais Campagnolli", "Bruno Omella", "Pedro Augusto");
		
		FileWizard jacks = new FileWizard();
		
		//jacks.writeFile(fileName, lines);
		//jacks.readFile(fileName);
	}*/
	
	public FileWizard() {
	
	}

	void readFile(String FileName) throws IOException {
		Path path = Paths.get(FileName);
		
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
			String currentLine = null;
			System.out.println("File content: ");
			
			while ((currentLine = reader.readLine()) != null) {
				//process each line here
				System.out.println(currentLine);
			}  
			
		}
	}
  
	void writeFile(String FileName, List<String> Lines) throws IOException {
		Path path = Paths.get(FileName);
		
		try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
			for(String currentLine : Lines){
				writer.write(currentLine);
				writer.newLine();
			}
		}
		
	}
  
} 
