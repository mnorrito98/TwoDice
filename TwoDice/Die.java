// Chapter 4 - Game Zone 1
public class Die
{
	// instance variables for the Die class
	private int value;
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;
	
	// constructor for this class
	public Die()
	{
		value = (int)(Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	// Accessor method to see the value of a Die object
	public int getValue()
	{
		return value;
	}
}