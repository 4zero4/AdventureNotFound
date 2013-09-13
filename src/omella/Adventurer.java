package omella;



/**
 * 
 * @author Bruom
 * 
 * The real deal here, the class that creates our Juvi-hero.
 */
public class Adventurer {
    int lvl;
    int[] att = new int[5];  //0-Str 1-Agi 2-Vit 3-Cha 4-Int
    String name;
    String race;
    String charClass;
    String gender;
    
    public Adventurer(){
        this.name = CharCreation.setName();
        this.gender = CharCreation.setGender();
        this.race = CharCreation.setRace(name);
        this.charClass = CharCreation.setClass(name);
        this.lvl = 1;
        this.att = CharCreation.rollAtt(this.charClass);        
    }
       
    public void reRoll(){
        this.att = CharCreation.rollAtt(charClass);
    }
    
    public void checkAtt(){
        StringBuilder stdout = new StringBuilder();
        stdout.append("Str: ").append(att[0]).append("\n");
        stdout.append("Agi: ").append(att[1]).append("\n");
        stdout.append("Vit: ").append(att[2]).append("\n");
        stdout.append("Cha: ").append(att[3]).append("\n");
        stdout.append("Int: ").append(att[4]).append("\n");
        System.out.println("Attributes: \n" + stdout );
    }
    
    public void checkRace(){
        System.out.println("I'm " + race);
    }
    
    public void checkClass(){
        System.out.println("I'm a " + charClass);
    }
    
    public void checkName(){
        System.out.println("Hello, my name is " + name);
    }
}