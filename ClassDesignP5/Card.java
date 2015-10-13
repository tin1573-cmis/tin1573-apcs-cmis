public class Card
{
    //1. Create instance variables
    private String suit;
    private String rank;
    //2. Write constructor to initialize instance variables
    public Card()
    {
        suit = "Spades";
        rank = "Q";
    } // end constructor Song
    public Card(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    } // end constructor Song
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "The card in my hand is a " + rank + " " + suit;
        
        return output;
    }

} // end Card