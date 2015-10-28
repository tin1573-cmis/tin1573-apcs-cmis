
import javax.swing.JOptionPane;
public class BlackJack
{

    //  private static double round(double number, int places)
    //  {
    //      int NumberX = (int)(number * Math.pow(10,places));
    //       double finalnumber = (double)(NumberX)/Math.pow(10,places);
    //       return finalnumber;
    //    }
    // rounding method
    public static void main(String args[])
    {

        //how many players
        String[] PossibleCards = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
        String[] PossibleSuits = { "♠", "♥", "♦" ,"♣"};
        int[] worth = { 1,2,3,4,5,6,7,8,9,10,10,10,10}; 
        // suits + score;
        Card[][] totalPlayerCard = new Card[5][];
        int[] scorePlayers = new int[5];
        String[] PlayerName = new String[5];
        // arrays
        int bust = 0;
        int blackjack = 0;
        int dealerWins = 0;
        int dealerTies = 0;
        //stats
        PlayerName[0] = "Dealer";
        for( int x = 1; x < 5; x++)
        {
            PlayerName[x] = "Player" + x;
        }
        //names
        for (int x = 0; x < totalPlayerCard.length; x++)
        {

            Card[] cardsDrawn = new Card[3];
            int score = 0;

            for( int i = 0; i < cardsDrawn.length; i++)
            {
                int CardRandom = (int)(Math.random()*13);
                int SuitsRandom = (int)(Math.random()*4);
                cardsDrawn[i] = new Card(PossibleCards[CardRandom],PossibleSuits[SuitsRandom]); 
                score += worth[CardRandom];
                if (CardRandom == 0 && score <= 10)
                {
                    score += 10;
                }
            }
            scorePlayers[x] = score;

            totalPlayerCard[x] = cardsDrawn;
        }
        // give out cards
        for ( int x = 0; x <5; x++)
        {
            System.out.print( PlayerName[x] + "\t" );
            if( x <10)
            {
                System.out.print("\t");
            }
            for (int i = 0; i < 3; i++)
            {
                System.out.print( totalPlayerCard[x][i] + "\t");
            }
            System.out.print("Score:" + scorePlayers[x]);
            if ( scorePlayers[x] >21)
            {
                System.out.println("   Bust!");
                bust +=1 ;
            }
            else if( scorePlayers[x] ==21)
            {
                System.out.println("   BlackJack!!");
                blackjack +=1;
            }
            else
            {
                System.out.println("");
            }
        } 
        // printing out the cards + players
        if (scorePlayers[0] == 21)
        {
            blackjack-=1;
        }
        else if (scorePlayers[0] > 21)
        {
            bust -=1;
        }
        // dealer doesn't count into stats
        System.out.println("-------------");
        System.out.println("The highest winners:");
        int max = 0;
        for( int x = 0; x < 5; x++ )
        {
            if ( scorePlayers[x] > max && scorePlayers[x] < 22 )
            {
                max = scorePlayers[x];
            }
        }
        for( int x = 1 ; x < 5; x++)
        {
            if ( scorePlayers[x] == max)
            {
                System.out.println( PlayerName[x] + "\t");
            }
        }
        //find highest winners
        System.out.println("-------------");
        System.out.println("Players who beat the dealer are:");
        for( int x = 1 ; x < 5; x++)
        {
            if ( (21>= scorePlayers[x] && scorePlayers[x]> scorePlayers[0]) || (scorePlayers[0] >21 && scorePlayers[x] <=21)  )
            {
                System.out.println( PlayerName[x] + "\t");
                dealerWins += 1;
            }
        }
        //people beating the dealers
        if (scorePlayers[0] < 22)
        {
            System.out.println("-------------");
            System.out.println("Players who tied the dealer are:");
            for( int x = 1 ; x < 5; x++)
            {
                if ( 21>= scorePlayers[x] && scorePlayers[x] == scorePlayers[0]  )
                {
                    System.out.println( PlayerName[x] + "\t");
                    dealerTies += 1;
                }
            }
        }
        // people tieing the dealers if dealer doesn't bust
        System.out.println ( "Number of players who beat the dealer " + dealerWins + "/"+ 4);
        System.out.println(  "Numberof players who tied the dealer " + dealerTies + "/"+ 4);
        System.out.println( "Number of players who tied the dealer " + blackjack + "/"+ 4);
        System.out.println( "Number of players who busts " + bust + "/"+ 4);
    } //end method
} //end class