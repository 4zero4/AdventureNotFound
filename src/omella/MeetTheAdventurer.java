package omella;



/**
 *
 * @author Bruom
 * 
 * Just a simple main for testing the Adventurer object and some of it's functions.
 * Obviously, it's called Juvigar.
 */
public class MeetTheAdventurer {
    
    public static void main(String[]args){
        Adventurer juvigar = new Adventurer();
        juvigar.checkAtt();
        juvigar.reRoll();
        juvigar.checkAtt();
        juvigar.checkName();
        juvigar.checkRace();
        juvigar.checkClass();
    }
    
}
