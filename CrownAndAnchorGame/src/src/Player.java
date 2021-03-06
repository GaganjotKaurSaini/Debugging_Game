import java.util.List;

public class Player {
	private String name;
	private int balance;
	private int winnings;
	private int limit;
	private int age;
	private int bet;
	
	private List<Dice> dice;
	private List<DiceValue> values;
	
	Player player = new Player("Fred", 19, 100);//giving inputs
		
	//Checking Name and Balance of Player	

	
	{
	
		
}
	public Player(String name, int age, int balance)
	{

		if (name == null || name .isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty");// condition for name cant be null
		if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");// condition balance cannot be negative
		
		//Under 18 cannot play this game
		
		if(age < 18) throw new IllegalArgumentException("Under 18 should not play the game");// condition age cannot be less than 18
		this.name = name;//using local variable
		this.balance = balance;// uisng local variable for balnce
		this.limit = 0;// setting limit to 0
		this.age=age;      //using local variable for age
		}	
	//Returning Name, age, Balance and limit of player
		
	public String getName() { 
		return name; }//getter method for name
	
	public int age() { 
		return age; }	//getter methodfor age
	
	public int getBalance() { 
		return balance; }//getter method for balance
	
	public int getWinnings() {
		return winnings; }//getter method for winnings
	
	public int getLimit() { 
		return limit; }
	
	public void setLimit(int limit) {
		if (limit < 0) throw new IllegalArgumentException("Limit cannot be negative.");   //Condition of limit cnnot be negative
		if (limit > balance)  throw new IllegalArgumentException("Limit cannot be greater than balance.");// condition limit cannot be greater than balance
		this.limit = limit;
	}

	public boolean balanceExceedsLimit() {
		return (balance >limit);
	}
	
	public boolean balanceExceedsLimitBy(int amount) 
	{
		//Eradicated bug 2 now player reach to betting limit, game ends when balance goes 0
		return (balance - amount > limit);  
	}
	
	public void takeBet(int bet) {
		if (bet < 0) throw new IllegalArgumentException("Bet cannot be negative.");
		if (!balanceExceedsLimitBy(bet)) throw new IllegalArgumentException("Placing bet would go below limit.");
		balance = balance - bet;
	}
		
	public void receiveWinnings(int winnings) {
		if (winnings < 0) throw new IllegalArgumentException("Winnings cannot be negative.");
		balance = balance + winnings ;		
	}
	
	public void winCounts(float totalWinCounts)
	{	
		if (totalWinCounts >= 0.42) throw new IllegalArgumentException("Limit reached.");
		player.takeBet(bet);
		Dice d = null;
		d.getValue().equals(null);
		
		//balance = balance + winnings;
	}
	public String toString() {
		return String.format("Player: %s, Balance: %d, Limit: %d", name, balance, limit);
	}
}
