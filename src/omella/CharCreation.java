package omella;

import java.util.*;

/**
 * 
 * @author Bruom
 * 
 * This class holds all the methods relevant to the creation of a character.
 */
public class CharCreation {
    static Scanner stdin = new Scanner(System.in);
    
    public static int[] rollAtt(String charClass){
        int[] att = new int[5];
        for(int i=0; i<att.length; i++){
            do{
            att[i] = (int)(Math.random()*20);
            }while(att[i]<6);
        }
        switch(charClass){
            case "Warrior":
                att[0] += 4;
                att[1] += 0;
                att[2] += 2;
                att[3] -= 2;
                att[4] -= 4; 
                break;
            case "Ranger":
                att[0] -= 4;
                att[1] += 4;
                att[2] -= 2;
                att[3] += 2;
                att[4] += 0;
                break;
            case "Mage":
                att[0] -= 4;
                att[1] += 1;
                att[2] -= 2;
                att[3] += 1;
                att[4] += 4;
                break;
            case "Thief":
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
        String name;
        System.out.println("What is yer name?");
        name = stdin.nextLine();
        return name;
    }
    
    public static String setRace(String name){
        System.out.println("What race are you, " + name + "?");
        String race = stdin.nextLine();
        boolean done = false;
        while(done == false){
            switch(race){
                case "Human":
                    done = true;
                    break;
                case "Elf":
                    done = true;
                    break;
                case "Dwarf":
                    done = true;
                    break;
                case "Gnome":
                    done = true;
                    break;
                default:
                    System.out.println(race + " is not a valid race.");                    
                    System.out.println("Please choose a valid one: Human, Elf, Dwarf or Gnome");
                    race = stdin.nextLine();
            }
        }
        return race;
    }
    
    public static String setClass(String name){
        System.out.println("What class are you, " + name + "?");
        String charClass = stdin.nextLine();
        boolean done = false;
        while(done == false){
            switch(charClass){
                case "Warrior":
                    done = true;
                    break;
                case "Ranger":
                    done = true;
                    break;
                case "Mage":
                    done = true;
                    break;
                case "Thief":
                    done = true;
                    break;
                default:
                    System.out.println(charClass + " is not a valid class.");
                    System.out.println("Please choose a valid one: Warrior, Ranger, Mage or Thief.");
                    charClass = stdin.nextLine();
            }
        }
        return charClass;
    }
    
    public static String setGender(){
        System.out.println("Are you male or female?");
        String gender = stdin.nextLine().toLowerCase();
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
                    gender = stdin.nextLine().toLowerCase();
            }
        }
        return gender;
    }
    
}