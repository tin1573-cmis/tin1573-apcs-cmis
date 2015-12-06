public class Deck
{
    private int numCards;
    private String[] suits = {"H", "D", "S", "C"};
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private Card[] cards;
    
    public Deck( int numCards )
    {
        this.numCards = numCards;
        cards = new Card[numCards];
        for ( int i = 0; i < cards.length; i++)
        {
            String suit =  this.suits[ i % suits.length ];          
            String rank =  this.ranks[ i % ranks.length ];
            cards[i] = new Card( suit, rank );
        }
        
    }
    
    public void deal( Hand hand )
    {
        int i = (int)(Math.random() * cards.length );
        Card card = cards[i]; 
        hand.addCard( card );
    }
    
    public void deal( Hand hand, int numCards )
    {
        for ( int i = 0; i < numCards; i++ )
        {
            deal(hand);
        }
        
    }
    
    public void deal( Hand[] hands, int numCards )
    {
        for ( int i = 0; i < hands.length; i++ )
        {
            deal(hands[i], numCards );
        }
        
    }
}


