public class table
{
    public static void main ( String args[] )
    {
        int[][] grid= new int[10][10];
        for (int r=1; r<grid.length;r++ )
        {

            for (int c=1; c<grid[0].length; c++)
            {
                grid[r][c]=r*c;
                grid[r][0]=r;
                grid[0][c]=c;
            }

        }

        for (int[] row : grid )
        {
            for (int num : row)
            {
                System.out.print( num + "\t");
            }
            System.out.println();
        }

    } // end main
}
