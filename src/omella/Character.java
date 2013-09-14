package omella;

/**
 * 
 * @author Bruom
 *
 *
 * A single object to represent any creature.
 */

public class Character {
	int lvl;
    int[] att = new int[5];  //0-Str 1-Agi 2-Vit 3-Cha 4-Int
    String name;
    String race;
    String charClass;
    String gender;
    String type;
    
    
    //One-fits-all constructor. Empty strings will be randomized.
    public Character(String name, String gender, String race, String charClass, int lvl){
    	if(gender == "")
    		this.gender = CharCreation.randomGender();
    	else
    		this.gender = gender;
    	if(race == "")
    		this.race = CharCreation.randomRace();
    	else
    		this.race = race;
    	if(charClass == "")
    		this.charClass = CharCreation.randomClass();
    	else
    		this.charClass = charClass;
    	if(name == "")
    		this.name = CharCreation.randomName(this.race);
    	else
    		this.name = name;
        this.lvl = lvl;
        this.att = CharCreation.rollAtt(this.charClass);
         
    }
    
    public void reRoll(){
    	this.att = CharCreation.rollAtt(charClass);
    }
    
    
    /*
     * The following "check" methods exist only to retrieve Character
     * attributes
     */
	
    public int[] checkAtt(){
        return att;
    }
    
    public String checkGender(){
    	return gender;
    }
    
    public String checkRace(){
        return race;
    }
    
    public String checkClass(){
        return charClass;
    }
    
    public String checkName(){
        return name;
    }
    
    public int checkLvl(){
    	return lvl;
    }
    
    /*
     * The following ones enable modifying their values
     * based on given parameters
     */
    
    public void changeAtt(int[] newAtt){
    	this.att = newAtt;
    }
    
    public void changeLvl(int newLvl){
    	this.lvl = newLvl;
    }
    
    public void changeRace(String newRace){
    	this.race = newRace;
    }
    
    public void changeClass(String newClass){
    	this.charClass = newClass;
    }
    
    public void changeName(String newName){
    	this.name = newName;
    }
    
    
    
    
}


