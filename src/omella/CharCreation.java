package omella;

import framework.*;

/**
 * 
 * @author Bruom
 * 
 * This class holds all the methods relevant to the creation of a character.
 */
public class CharCreation {
    
    public static int[] rollAtt(String charClass){
        int[] att = new int[5];
        for(int i=0; i<att.length; i++){
            do{
            att[i] = (int)(Math.random()*20);
            }while(att[i]<6);
        }
        switch(charClass){
            case "warrior":
                att[0] += 4;
                att[1] += 0;
                att[2] += 2;
                att[3] -= 2;
                att[4] -= 4; 
                break;
            case "ranger":
                att[0] -= 4;
                att[1] += 4;
                att[2] -= 2;
                att[3] += 2;
                att[4] += 0;
                break;
            case "mage":
                att[0] -= 4;
                att[1] += 1;
                att[2] -= 2;
                att[3] += 1;
                att[4] += 4;
                break;
            case "thief":
                att[0] -= 4;
                att[1] += 3;
                att[2] -= 2;
                att[3] += 3;
                att[4] += 0;
                break;
        }
        for(int i=0; i<5; i++){
            if(att[i]>20)
                att[i]=20;
            if(att[i]<1)
                att[i]=1;
        }
        return att;
    }
    
    public static String setName(){
        System.out.println("What is yer name?");
        InputReader gaben = new InputReader();
        gaben.read();
        return gaben.getInput();
    }
    
    public static String setRace(){
        System.out.println("What race are you?");
        InputReader gaben = new InputReader();
        gaben.read();
        gaben.trimSyntax();
        String race = gaben.getActual();
        boolean done = false;
        while(done == false){
            switch(race){
                case "human":
                    done = true;
                    break;
                case "elf":
                    done = true;
                    break;
                case "dwarf":
                    done = true;
                    break;
                case "gnome":
                    done = true;
                    break;
                default:
                    System.out.println(race + " is not a valid race.");                    
                    System.out.println("Please choose a valid one: Human, Elf, Dwarf or Gnome");
                    gaben.clear();
                    gaben.read();
                    gaben.trimSyntax();
                    race = gaben.getActual();
            }
        }
        return race;
    }
    
    public static String setClass(){
        System.out.println("What class are you?");
        InputReader gaben = new InputReader();
        gaben.read();
        gaben.trimSyntax();
        String charClass = gaben.getActual();
        boolean done = false;
        while(done == false){
            switch(charClass){
                case "warrior":
                    done = true;
                    break;
                case "ranger":
                    done = true;
                    break;
                case "mage":
                    done = true;
                    break;
                case "thief":
                    done = true;
                    break;
                default:
                    System.out.println(charClass + " is not a valid class.");
                    System.out.println("Please choose a valid one: Warrior, Ranger, Mage or Thief.");
                    gaben.clear();
                    gaben.read();
                    gaben.trimSyntax();
                    charClass = gaben.getActual();
            }
        }
        return charClass;
    }
    
    public static String setGender(){
        System.out.println("Are you male or female?");
        InputReader gaben = new InputReader();
        gaben.read();
        gaben.trimSyntax();
        String gender = gaben.getActual();
        boolean fuentes = false;
        while(fuentes==false){
            switch(gender){
                case "male":
                    fuentes = true;
                    break;
                case "female":
                    fuentes = true;
                    break;
                default:
                    System.out.println(gender + " is not a valid gender.");
                    System.out.println("Please choose a valid one: male or female.");
                    gaben.clear();
                    gaben.read();
                    gaben.trimSyntax();
                    gender = gaben.getActual();
            }
        }
        return gender;
    }
    
    /*
     * These are randomizer methods. Used when creating characters with
     * unspecified attributes.
     */
    
    public static String randomGender(){
    	int i = (int)(Math.random()*2);
    	if(i == 0)
    		return "female";
    	return "male";
    }
    
    public static String randomRace(){
    	int i = (int)(Math.random()*4);        
        switch (i){
            case 0:
                return "human";
            case 1:
                return "elf";
            case 2:
                return "dwarf";
            case 3:
                return "gnome";
            default:
                return "human";
        }
    }
    
    public static String randomClass(){
    	int i = (int)(Math.random()*4);        
        switch (i){
            case 0:
                return "warrior";
            case 1:
                return "ranger";
            case 2:
                return "mage";
            case 3:
                return "thief";
            default:
                return "warrior";               
        }
    }
    
    public static String randomName(String race){
    	String name = "";
    	return name;
    }
    
}