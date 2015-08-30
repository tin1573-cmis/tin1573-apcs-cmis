public class FundamentalsP5 { 
  
  public static void main ( String args[] )
  {
   
    String[] movies = {"Blended", "The Naked Gun", "Airplane"};
    String[] songs = {"It's My Life", "Teddy Bear", "Kiss From A Rose"};
    String movie;
    String song;
    
    for( int num = 0; num < movies.length; num++ )
    {
           movie = movies[num];
        
    } // end for loop
    for( int num = 0; num < movies.length; num++)
    {
        System.out.println( movies[num] + "\n" + "\n");
    } // end for loop

    int num = 0; 
    
    while (num < songs.length - num)
    {
        System.out.print( songs[num] + ", ");
        num ++;
    } // end while loop
    System.out.print( songs[songs.length-1]);
    
       
    
  } // end main
} // end HelloWorld