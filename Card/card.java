public class card
{
    String[] ranks = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
    String[] suits = { "♥", "♦", "♠" ,"♣"};
    private String rank, suit;
    
    public card(String suit, String rank)
    {
        this.suit=suit;
        this.rank=rank;
    }

    int getScore()
    {
        int value;
        if(rank.equals("J") || rank.equals("Q") || rank.equals("K"))
        {
            value = 10;
        }
        else if(rank.equals("A"))
        {
            value = 11;
        }
        else
        {
            value = Integer.parseInt(rank);
        }
        return value;
    }

    public String toString()
    {
        String output = String.format(
            "suit %s\n" +
            "rank %s\n" , suit, rank);
        return output;
    }
}