package omella;
 
/**
 * @author Bruom
 */

public class Adventurer {
    int lvl;
    int[] att = new int[5];  //0-Str 1-Agi 2-Vit 3-Cha 4-Int
    String name;
    String race;
    String charClass;
   
    public Adventurer(String name, int race, int charClass){
        this.name = name;
        this.race = this.setRace(race);
        this.charClass = this.setClass(charClass);
        this.lvl = 1;
        this.att = rollAtt();
    }
   
    public String setRace(int race){
        switch(race){
            case 0:
                this.race = "Human";
                break;
            case 1:
                this.race = "Elf";
                break;
            case 2:
                this.race = "Dwarf";
                break;
            case 3:
                this.race = "Gnome";
                break;
            default:
                this.race = "Human";
                break;
        }
        return this.race;
    }
   
    public String setClass(int charClass){
        switch(charClass){
            case 0:
                this.charClass = "Warrior";
                break;
            case 1:
                this.charClass = "Ranger";
                break;
            case 2:
                this.charClass = "Mage";
                break;
            case 3:
                this.charClass = "Thief";
                break;
            default:
                this.charClass = "Warrior";
                break;
        }
        return this.charClass;
    }
   
    public int[] rollAtt(){
        int[] att = new int[5];
        for(int i=0; i<att.length; i++){
            do{
            att[i] = (int)(Math.random()*20);
            }while(att[i]<6);
        }
        return att;
    }
   
    public void reRoll(){
        this.att = this.rollAtt();
    }
   
    public void checkAtt(){
        StringBuilder stdout = new StringBuilder();
        for(int i=0; i<5; i++){
            stdout.append(this.att[i]);
            stdout.append("\n");
        }
        System.out.println("Attributes: \n" + stdout );
    }
}