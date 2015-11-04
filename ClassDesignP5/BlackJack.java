
import javax.swing.JOptionPane;
public class BlackJack
{
    public static void main(String args[])
    {
        String[] cardDeck = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
        String[] suitsDeck = { "♥", "♦", "♠" ,"♣"};
        int[] worth = { 1,2,3,4,5,6,7,8,9,10,10,10,10}; 
        // suits + score;
        Card[][] totalCard = new Card[5][];
        int[] playersScore = new int[5];
        String[] name = new String[5];
        // arrays
        int bust = 0;
        int blackjack = 0;
        int dealerWins = 0;
        int dealerTies = 0;
        //stats
        name[0] = "Dealer";
        for( int x = 1; x < 5; x++)
        {
            name[x] = "Player" + x;
        }
        //names
        for (int x = 0; x < totalCard.length; x++)
        {

            Card[] cardsDrawn = new Card[3];
            int score = 0;

            for( int i = 0; i < cardsDrawn.length; i++)
            {
                int CardRandom = (int)(Math.random()*13);
                int SuitsRandom = (int)(Math.random()*4);
                cardsDrawn[i] = new Card(cardDeck[CardRandom],suitsDeck[SuitsRandom]); 
                score += worth[CardRandom];
                if (CardRandom == 0 && score < 11)
                {
                    score += 10;
                }
            }
            playersScore[x] = score;

            totalCard[x] = cardsDrawn;
        }
        // give out cards
        for ( int x = 0; x <5; x++)
        {
            System.out.print( name[x] + "\t" );
            if( x <10)
            {
                System.out.print("\t");
            }
            for (int i = 0; i < 3; i++)
            {
                System.out.print( totalCard[x][i] + "\t");
            }
            System.out.print("Score:" + playersScore[x]);
            if ( playersScore[x] >21)
            {
                System.out.println("   Bust!");
                bust +=1 ;
            }
            else if( playersScore[x] ==21)
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
        if (playersScore[0] == 21)
        {
            blackjack-=1;
        }
        else if (playersScore[0] > 21)
        {
            bust -=1;
        }
        // dealer doesn't count into stats
        System.out.println("The highest winners:");
        int max = 0;
        for( int x = 0; x < 5; x++ )
        {
            if ( playersScore[x] > max && playersScore[x] < 22 )
            {
                max = playersScore[x];
            }
        }
        for( int x = 1 ; x < 5; x++)
        {
            if ( playersScore[x] == max)
            {
                System.out.println( name[x] + "\t");
            }
        }
        //find highest winners

        System.out.println("Player(s) who beat the dealer are:");
        for( int x = 1 ; x < 5; x++)
        {
            if ( (21>= playersScore[x] && playersScore[x]> playersScore[0]) || (playersScore[0] >21 && playersScore[x] <22)  )
            {
                System.out.println( name[x] + "\t");
                dealerWins += 1;
            }
        }
        //people beating the dealers
        if (playersScore[0] < 22)
        {
            System.out.println("-------------");
            System.out.println("Player(s) who tied the dealer are:");
            for( int x = 1 ; x < 5; x++)
            {
                if ( 22> playersScore[x] && playersScore[x] == playersScore[0]  )
                {
                    System.out.println( name[x] + "\t");
                    dealerTies += 1;
                }
            }
        }
        // people tieing the dealers if dealer doesn't bust
        System.out.println ( "Number of players who beat the dealer " + dealerWins );
        System.out.println(  "Numberof players who tied the dealer " + dealerTies );
        System.out.println( "Number of players who tied the dealer " + blackjack );
        System.out.println( "Number of players who busts " + bust );
    } //end method
} //end class