import java.util.List;
import java.io.*;

public class Main 
{	
	public static void main(String[] args) throws Exception {
		
	   BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	   
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();
      
        
        Player player = new Player("Fred", 19, 100);
        Game game = new Game(d1, d2, d3);
        List<DiceValue> cdv = game.getDiceValues();

        int totalWins = 0;
        int totalLosses = 0;    
        //float countWin = 0;
                
        while (true)
        {
            int winCount = 0;
            int loseCount = 0;            
            
            for (int i = 0; i < 100; i++)
            {
            	String name = "Fred";
            	int age = 19;
            	int balance = 100;
            	int limit = 0;
                player = new Player(name, age, balance);
                player.setLimit(limit);
                int bet = 5;

                System.out.println(String.format("Start Game %d: ", i));
                System.out.println(String.format("%s starts with balance %d, limit %d", 
                		player.getName(), player.getBalance(), player.getLimit()));

                int turn = 0;
<<<<<<< HEAD
                								// Eradicated bug sets the limit less than and equals to 100
                while (player.balanceExceedsLimitBy(bet) && player.getBalance() <= 100)
=======
                while (player.balanceExceedsLimitBy(bet) && player.getBalance() <= 100)// Eradicated bug sets the limit 100
>>>>>>> origin/master
                {
                 //   turn++;                    
                	DiceValue pick = DiceValue.getRandom();
                   
                	System.out.printf("Turn %d: %s bet %d on %s\n",
                			turn, player.getName(), bet, pick); 
                	turn++;
                	
                	//DiceValue pick = DiceValue.getRandom();
                	
                	int winnings = game.playRound(player, pick, bet);
                    cdv = game.getDiceValues();                    
                    
                    System.out.printf("Rolled %s, %s, %s\n",
                    		cdv.get(0), cdv.get(1), cdv.get(2));                                       
                    
                    //increasing balance when player wins
                                      
                    if (winnings > 0)
                    {                 	 
                	 int x = bet + winnings + player.getBalance(); //eradicated bug 1, now player balance increases when wins
                    	
	                    System.out.printf("%s won %d, balance now %d\n\n",
	                    		player.getName(), winnings, x);
	                	winCount++;	                	
                    }                    
                    else {
                    	
	                    System.out.printf("%s lost, balance now %d\n\n",
	                    		player.getName(), player.getBalance());
	                	loseCount++;	                		                		                	
                    }                               
                    
                } //while checking bugs
                  //Eradicate bug 3, Getting right winCounts
                System.out.print(String.format("%d turns later.\nEnd Game %d: ", turn, i));
                System.out.println(String.format("%s now has balance %d\n", player.getName(), player.getBalance()));
                }
            
            System.out.println(String.format("Win count = %d, Lose Count = %d, %.2f", winCount, loseCount, (float) winCount/(winCount+loseCount)));
            totalWins += winCount;
            totalLosses += loseCount;

            String ans = console.readLine();
            if (ans.equals("q")) break;
        } 
        System.out.println(String.format("Overall win rate = %.1f%%", (float)((totalWins  / (totalWins + totalLosses))*100)));
	   
        //Win Count Limit
       	}              			
	}