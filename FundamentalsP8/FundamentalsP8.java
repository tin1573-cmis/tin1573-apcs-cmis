public class FundamentalsP8 
{
    public static void main ( String args[] )
    {

        String[] artists = new String[] {"Elvis Presly", "Bon Jovi", "Mariah Carey" };
        
        for( int index=0; index < artists.length ; index++)
        
        {
            
            System.out.println(artists[index]);
            
        }//end for
        
        artists[(int)(Math.random()*(artists.length))]="Michael";

        for( int index=0; index < artists.length ; index++)
        
        {
            
            System.out.println("\t" + artists[index]);
            
        }//end for

        for( int index=0; index < artists.length ; index++)
        
        {
            
            if (artists[index].equals("Michael"))
            
            {
                
                System.out.println ( "We found the king of POP!!!!!!!!"); 
                
            }//end if
            
            else
            
            {
                
                System.out.println ( "Michael is not in artists [" + index + "]");
                
            }//end else
            
        }//end for

   
    } // end main

} // end FundamentalsP8