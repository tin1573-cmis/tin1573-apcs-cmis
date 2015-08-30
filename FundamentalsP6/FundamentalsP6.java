
public class FundamentalsP6 
    {
  public static void main ( String args[] )
  {
    
    int[] array = new int[50];
    
    for( int index = 0; index < array.length; index++ )
    
    {
        
     array[index] =((int)(100*Math.random()));
     
    }//end for loop
    
    for( int index = 0; index < array.length; index++ )
    
    {
        
     System.out.println(array[index]);
     
    }//end for loop    
      } // end main
} // end FundamentalsP6 

//Write a program that creates an array that can hold 50 integer values. Using a for loop and Math.random(),
//fill the array with random integer values between 0 and 100 inclusive. 
//Use a separate for loop to print each of the numbers in the array with a single space between each number.
//Note: When using a for loop with arrays, use the variable name “index” as the counter in the loop as shown below:
//for( int index = 0, index < myArray.length; index++ )