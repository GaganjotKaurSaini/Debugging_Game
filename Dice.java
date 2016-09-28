public class Dice
{
			
	private DiceValue value;
	// declare various functions
	public Dice() 
	{
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() 
	{
		return value;
	}

	public DiceValue roll() 
	{
		return DiceValue.getRandom(); //return diceValue randomly
	}		
	
	public String toString() 
	{
		return value.toString();
	}
}
