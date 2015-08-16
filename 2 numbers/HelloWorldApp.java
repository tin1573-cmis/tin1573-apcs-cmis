import javax.swing.JOptionPane;
import java.lang.Math;

public class HelloWorldApp 
    {
  public static void main ( String args[] )
  {
    float sum1=0;
    float sum2=0;
    
    float sub1=0;
    float sub2=0;
    
    float mul1=0;
    float mul2=0;
    
    float div1=0;
    float div2=0;
    
    float mod1=0;
    float mod2=0;
        
    double pow1=0;
    double pow2=0;
    
    String input1 = JOptionPane.showInputDialog( "Choose a number.");
    String input2 = JOptionPane.showInputDialog( "Choose another number or the same number again.");
    float num1 = Float.parseFloat( input1 );
    float num2 = Float.parseFloat( input2 );
    
    sum1=num1+num2;
    sum2=num2+num1;
    
    System.out.print(input1);
    System.out.print ("+");
    System.out.print(input2); 
    System.out.print("="); 
    System.out.println(sum1);
    
    System.out.print(input2);
    System.out.print ("+");
    System.out.print(input1); 
    System.out.print("="); 
    System.out.println(sum2);
    
    sub1=num1-num2;
    sub2=num2-num1;
    
    System.out.print(input1);
    System.out.print ("-");
    System.out.print(input2); 
    System.out.print("="); 
    System.out.println(sub1);
    
    System.out.print(input2);
    System.out.print ("-");
    System.out.print(input1); 
    System.out.print("="); 
    System.out.println(num2);
    
    mul1=num1*num2;
    mul2=num2*num1;
    
    System.out.print(input1);
    System.out.print ("x");
    System.out.print(input2); 
    System.out.print("="); 
    System.out.println(mul1);
    
    System.out.print(input2);
    System.out.print ("x");
    System.out.print(input1); 
    System.out.print("="); 
    System.out.println(mul2);
    
    div1=num1/num2;
    div2=num2/num1;
    
    System.out.print(input1);
    System.out.print ("/");
    System.out.print(input2); 
    System.out.print("="); 
    System.out.println(div1);
    
    System.out.print(input2);
    System.out.print ("/");
    System.out.print(input1); 
    System.out.print("="); 
    System.out.println(div2);
    
    mod1=num1%num2;
    mod2=num2%num1;
    
    System.out.print(input1);
    System.out.print ("%");
    System.out.print(input2); 
    System.out.print("="); 
    System.out.println(mod1);
    
    System.out.print(input2);
    System.out.print ("%");
    System.out.print(input1); 
    System.out.print("="); 
    System.out.println(mod2);
    
    pow1=Math.pow(num1,num2);
    pow2=Math.pow(num2,num1);
    
    System.out.print(input1);
    System.out.print ("^");
    System.out.print(input2); 
    System.out.print("="); 
    System.out.println(pow1);
    
    System.out.print(input2);
    System.out.print ("^");
    System.out.print(input1); 
    System.out.print("="); 
    System.out.println(pow2);
      } // end main
} // end HelloWorld