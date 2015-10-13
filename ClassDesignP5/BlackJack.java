import javax.swing.JOptionPane;
public class BlackJack
{
    public static void main (String args[])
    {
        Card hand1[]= new Card[2];
        Card hand2[]= new Card[2];
        Card hand3[]= new Card[2];
        Card hand4[]= new Card[2];
        Card hand5[]= new Card[2];
        Card dealer[]= new Card[2];
        
        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i=0; i<2 ; i++)
        {

            hand1[i] = new Card(suit[(int)(Math.random()*4)], rank[(int)(Math.random()*13)]);
            System.out.println(hand1[i]);
            
            hand2[i] = new Card(suit[(int)(Math.random()*4)], rank[(int)(Math.random()*13)]);
            System.out.println(hand2[i]);
            
             hand3[i] = new Card(suit[(int)(Math.random()*4)], rank[(int)(Math.random()*13)]);
            System.out.println(hand3[i]);
            
             hand4[i] = new Card(suit[(int)(Math.random()*4)], rank[(int)(Math.random()*13)]);
            System.out.println(hand4[i]);
            
             hand5[i] = new Card(suit[(int)(Math.random()*4)], rank[(int)(Math.random()*13)]);
            System.out.println(hand5[i]);
             
            dealer[i] = new Card(suit[(int)(Math.random()*4)], rank[(int)(Math.random()*13)]);
            System.out.println(dealer[i]);
        }
        

    }
}