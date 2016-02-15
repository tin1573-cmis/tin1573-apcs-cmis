public class Alphabet
{
    public static void main ( String args[] )
    {
        String[][] grid= new String[3][13];
        String[] az= {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p", "q", "r" , "s" , "t" ,"u" , "v" , "w" , "x ", "y" , "z"}; 
        int num=0;
        for (int r=0; r<grid.length;r++ )
        {

            for (int c=0; c<grid[0].length; c++)
            {

                if(num==26)
                {
                    num = 0;

                }

                grid[r][c]=az[num];
                num++;
            }
        }

        for (String[] row : grid )
        {
            for (String string : row)
            {
                System.out.print( string + " ");
            }
            System.out.println();
        }

    }
}