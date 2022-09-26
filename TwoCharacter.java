import java.util.Scanner;

//26.09.22
//Denis Olaleye

/*Then write an application in which you create at least two characters. In turn, pass each character to a display method that displays the character’s
attributes. Save the application as TwoCharacters.java.*/

public class TwoCharacter 
{
	public static void main (String [] args)
	{
//		creating MyCharacter class objects
		MyCharacter char1 = new MyCharacter();
		MyCharacter char2 = new MyCharacter();
		Scanner input = new Scanner(System.in);
		
//		setting attributes to char2
		System.out.print("Enter characters name >> ");
		char2.setName(input.nextLine());
		System.out.print("Enter characters superpower >> ");
		char2.setSuperPower(input.nextLine());
		System.out.print("Enter characters age-level >> ");
		char2.setAge(input.nextInt());
		input.close();
			
//		passing characters to showMethod()
		System.out.println();
		showAttributes(char1);
		System.out.println();
		showAttributes(char2);
		
		
	}
	
//	creating showMethod()
	public static void showAttributes(MyCharacter character)
	{
		System.out.println("     C H A R A C T E R    ");
		System.out.println();
		System.out.println("N A M E: " +character.getName());
		System.out.println();
		System.out.println("S U P E R  P O W E R: " +character.getSuperPower());
		System.out.println();
		System.out.println("A G E  L E V E L: " +character.getAge());
	}

}
