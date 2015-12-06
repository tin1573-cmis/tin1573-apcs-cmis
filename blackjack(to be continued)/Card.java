public class Card
{
    private String suit;
    private String rank;
    public Card(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    public String toString()
    {
        return String.format("%s%s", this.rank, this.suit);
    }
    
    public int evaluate()
    {
        int score;
        if ( this.isFaceCard() ) 
        {
            score = 10;
        }
        else if ( this.isAce() )
        {
            score = 11;
        }
        else
        {
            score = Integer.parseInt(this.rank);
        }
        return score;
    }
    
    public boolean isFaceCard()
    {
        return this.rank.equals("J") || this.rank.equals("Q") || this.rank.equals("K");
    }
    
    public boolean isAce()
    {
        return this.rank.equals("A");
    }
}