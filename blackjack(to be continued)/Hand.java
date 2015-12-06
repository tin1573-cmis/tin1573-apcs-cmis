public class Hand
{
    private Card[] cards;
    private int emptySlot;
    
    public Hand(int maxCards)
    {
        this.cards = new Card[maxCards];
        this.emptySlot = 0;
    }
    
    public int evaluate(    )
    {
        int points = 0;
         for ( int i = 0; i <  cards.length   ; i++)
         {
             points += cards[i].evaluate();
         }
        return points;
    }
    
    
    public void addCard(  Card card  )
    {
        for ( int i = 0; i < cards.length; i++ )
        {
            if ( cards[i] == null )
            {
                cards[i] = card;
                break;
            }
        }
    }
   
    
    public boolean compare( Hand otherHand )
    {
        int thisScore = this.evaluate();
        int otherScore = otherHand.evaluate(); 
        if ( thisScore >= otherScore && otherScore != 21)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}