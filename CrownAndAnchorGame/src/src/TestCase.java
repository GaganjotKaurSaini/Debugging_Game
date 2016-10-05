public class TestCase {
	public static void main (String [] args) {
		Player pl = new Player("Fred", 19, 100);
		System.out.println("Player name is "+ pl.getName());	
		System.out.println("Player age is "+ pl.age());
		System.out.println("Balance is "+ pl.getBalance());
		System.out.println("Limit is "+ pl.getLimit());
		}
	}