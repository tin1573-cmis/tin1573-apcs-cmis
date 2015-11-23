public class card
{
    private String suit;
    private String rank;
    private int point;
    public card(String suit, String rank)
    {
        this.suit=suit;
        this.rank=rank;
    }

    int getScore()
    {
        return score;
    }

    public String toString()
    {
        String output = String.format(
            "suit %s\n" +
            "rank %s\n" , suit, rank);
        return output;
    }
}