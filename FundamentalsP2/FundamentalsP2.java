import javax.swing.JOptionPane;
public class FundamentalsP2 
    {
  public static void main ( String args[] )
  {
  
   String input1 = JOptionPane.showInputDialog( "Choose a number.");
   String input2 = JOptionPane.showInputDialog( "Choose another similar or different number.");
   
   double num1 = Float.parseFloat( input1 );
   double num2 = Float.parseFloat( input2 );
    
   
   if (num1 > num2)
        {System.out.print(num1 + " is bigger than " + num2);
        }
   if (num1 < num2)
        {System.out.print(num1 + " is smaller than " + num2);
        }
   if (num1 == num2)
       {System.out.print(num1 + " and " + num2 + " are the same number");
       }
      } // end main
} // end FundamentalsP2