import javax.swing.JOptionPane;
public class FundamentalsP3 
    {
  public static void main ( String args[] )
  {
   double nu=0;
   
   String input = JOptionPane.showInputDialog( "Choose a number.");
   
   double num = Float.parseFloat( input ); 
   
   nu=num%2;
   
   if (nu==1)
        {System.out.println(input + " is an odd number." );
        }
   else 
        {System.out.println(input + " is an even number. ");
        }
      } // end main
} // end FundamentalsP3