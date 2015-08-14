import javax.swing.JOptionPane;
public class HelloWorldApp 
    {
  public static void main ( String args[] )
  {
    String input = JOptionPane.showInputDialog( "What is your name?");
    
    System.out.print("Hello,"); System.out.print(input);System.out.print("! You are");
      } // end main
} // end HelloWorld