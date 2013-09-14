package omella;

/**
 *
 * @author Rafael - aka Juvigar
 */
public class Enemy 
{
    int lvl;
    int[] att = new int[5]; // 0-str 1-agi 2-vit 3-cha 4-int
    String name;
    String race;
    String enemyClass;
    String gender;
    
    public Enemy()
    {
        this.name = EnemyCreation.setName();
        this.gender = EnemyCreation.setGender();
        this.race = EnemyCreation.setRace();
        this.enemyClass = EnemyCreation.setClass();
        this.lvl = EnemyCreation.setLvl();
        this.att = EnemyCreation.setAtt(this.enemyClass);
    }
    
    public void checkAtt()
    {
        StringBuilder stdout = new StringBuilder();
        
        stdout.append("Str: ").append(att[0]).append("\n");
        stdout.append("Agi: ").append(att[1]).append("\n");
        stdout.append("Vit: ").append(att[2]).append("\n");
        stdout.append("Cha: ").append(att[3]).append("\n");
        stdout.append("Int: ").append(att[4]).append("\n");
        System.out.println("Attributes: \n" + stdout );
    }
    
    public void checkRace()
    {
        System.out.println("I'm a "+ gender + " " + race);
    }
    
    public void checkClass()
    {
        System.out.println("I'm a " + enemyClass);
    }
    
    public void checkName()
    {
        System.out.println("Arr, my name is " + name);
    }
    
}
