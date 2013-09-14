package omella;

public class MeetTheCharacter {
	
	public static void main(String[]args){
		Character test = new Character("", "", "", "", 1);
		System.out.println(test.checkName());
		System.out.println(test.checkGender());
		System.out.println(test.checkRace());
		System.out.println(test.checkClass());
	}

}
