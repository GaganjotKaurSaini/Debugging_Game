public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() // checking
	{
		return value;
	}

	public DiceValue roll() {
		return DiceValue.getRandom(); //return diceValue randomly
	}		
	
	public String toString() {
		return value.toString();
	}
}
