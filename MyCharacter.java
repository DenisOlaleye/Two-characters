//16.09.22
//Denis Olaleye

/*Computer games often contain different characters or creatures. For example, you might design a game in which alien beings possess specific characteristics
such as color, number of eyes, or number of lives. Design a character for a game, creating a class to hold at least three attributes for the character. 
Include methods to get and set each of the character’s attributes. Save the file as MyCharacter.*/

public class MyCharacter 
{
//	declaring class fields
	private String name;
	private String superPower;
	private int age;
	
//	creating constructor that assigns values to the class MyCharacter
	public MyCharacter()
	{
		name = "unnamed";
		superPower = "being";
		age = 0;
	}
	
//	writing setMethods()
	public void setName(String n)
	{
		name = n;
	}
	public void setSuperPower(String power)
	{
		superPower = power;
	}
	public void setAge(int a)
	{
		age = a;
	}
	
//	writing getMethods()
	public String getName()
	{
		return name;
	}
	public String getSuperPower()
	{
		return superPower;
	}
	public int getAge()
	{
		return age;
	}
	
}
