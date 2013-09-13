package framework;

import java.util.*;

/**
 * 
 * @author Bruom
 *
 *
 * This little object here will read user input and filter out pronouns and
 * such. Needs a complete text file of stuff to ignore.
 */

public class InputReader {
	String input;
	ArrayList<String> actual = new ArrayList<String>();  //What the computer will read
	String useless = "i'm  a  an  i  am  me"; //Placeholder, things to be ignored
	
	public InputReader(){
		input = "";
	}
	
	public void read(){
		Scanner matheus = new Scanner(System.in);
		input = matheus.nextLine();
	}
	
	public void trimSyntax(){
		ArrayList<String> aux2 = new ArrayList<String>();
		String[] aux = input.split(" ");
		for(int i = 0; i<aux.length; i++){
			aux2.add(i, aux[i]);
		}
		for(int i = 0; i<aux2.size(); i++){
			if(!useless.contains((String)aux2.get(i))){
				actual.add(aux2.get(i));
			}
		}
		for(int i=0 ; i<actual.size(); i++){
			actual.get(i).toLowerCase();
		}
		
	}

	
	public void printActual(){
		String stdout = "";
		for(int i = 0; i<actual.size(); i++){
			stdout = stdout + actual.get(i) + " ";
		}
		System.out.println(stdout);
	}
	
	public static void main(String[]args){
		InputReader samuel = new InputReader();
		System.out.println("What class are you?");
		samuel.read();
		samuel.trimSyntax();
		samuel.printActual();
	}
	
	public String getInput(){
		return input;
	}
	
	public String getActual(){
		String stdout = "";
		for(int i = 0; i<actual.size(); i++){
			stdout = stdout + actual.get(i);
		}
		return stdout;
	}
	
	public void clear(){
		input = "";
		actual.clear();
	}

}
