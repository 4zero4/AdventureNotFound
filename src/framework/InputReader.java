package framework;

import java.util.*;

public class InputReader {
	String input;
	ArrayList<String> aux2 = new ArrayList<String>();
	ArrayList<String> actual = new ArrayList<String>();
	String useless = "i'm  a  an  i  am  me";
	
	public InputReader(){
		input = "";
	}
	
	public void read(){
		Scanner matheus = new Scanner(System.in);
		input = matheus.nextLine();
	}
	
	public void trimSyntax(){
		
		String[] aux = input.split(" ");
		for(int i = 0; i<aux.length; i++){
			aux2.add(i, aux[i]);
		}
		System.out.println(aux2.size());
		for(int i = 0; i<aux2.size(); i++){
			if(!useless.contains((String)aux2.get(i))){
				actual.add(aux2.get(i));
			}
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

}
