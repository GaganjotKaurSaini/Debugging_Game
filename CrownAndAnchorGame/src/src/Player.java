
public class Player {
	private String name;
	private int balance;
	private int limit;
	private int age; //declaring age of type int
	
	//Checking Name and Balance of Player
	
	public Player(String name, int age, int balance) {
		if (name == null || name .isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty");
		if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
		if(age < 18) throw new IllegalArgumentException("Under 18 should not play the game");
		this.name = name;
		this.balance = balance;
		this.limit = 0;
		this.age=0;      //testing
	}
	
	//Returning Name, Balance and limit of player
		
	public String getName() { 
		return name; }
	
	public int age() { 
		return age; }	
	
	public int getBalance() { 
		return balance; }
	
	public int getLimit() { 
		return limit; }
	
	public void setLimit(int limit) {
		if (limit < 0) throw new IllegalArgumentException("Limit cannot be negative.");   
		if (limit > balance)  throw new IllegalArgumentException("Limit cannot be greater than balance.");
		this.limit = limit;
	}

	public boolean balanceExceedsLimit() {
		return (balance >limit);
	}
	
	public boolean balanceExceedsLimitBy(int amount) 
	{
		return (balance - amount >= limit);  //Eradicated bug 2 now player reach to betting limit, game ends when balance goes 0
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
	
	public String toString() {
		return String.format("Player: %s, Balance: %d, Limit: %d", name, balance, limit);
	}
}
