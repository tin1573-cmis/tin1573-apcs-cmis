
public class name
{
    public static void main ( String args[] )
    {
        int[][] grid= new int[3][4];
        for (int r=0; r<grid.length;r++ )
        {
            for (int c=0; c<grid[0].length; c++)
            {
                grid[r][c]= (int)(Math.random()*9);
            }
        }
        for (int r=0; r<grid.length;r++ )
        {
            for (int c=0; c<grid[0].length; c++)
            {
                System.out.print( grid[r][c] + " ");
            }
            System.out.println();
        }
        for (int r=0; r<grid.length;r++ )
        {
            for (int c=0; c<grid[0].length; c++)
            {
                if (grid[r][c]==5)
                {
                    System.out.println("column= " + c +  "row= " + r);
                }
            }
        }
    } // end main
}
