public class name
{
    public static void main ( String args[] )
    {
        int[][] grid= new int[3][5];
        for (int r=0; r<grid.length;r++ )
        {
            for (int c=0; c<grid[0].length; c++)
            {
                grid[r][c]= (int)((Math.random()*14)+1);
            }
        }

        for (int[] row : grid )
        {
            for (int num : row)
            {
                System.out.print( num + " ");
            }
            System.out.println();
        }

        int sum=0;
        for (int r=0; r<grid.length;r++ )
        {
            for (int c=0; c<grid[0].length; c++)
            {
                sum+=grid[r][c];
            }
        }
        System.out.println(sum);

        for (int r=0; r<grid.length;r++ )
        {
            int row=0;
            for (int c=0; c<grid[0].length; c++)
            {
                row+=grid[r][c];
            }
            System.out.println("row= "+row);
            row=0;

        }

        for (int c=0; c<grid[0].length;c++ )
        {
            int col=0;
            for (int r=0; r<grid.length; r++)
            {
                col+=grid[r][c];
            }
            System.out.println("col= "+col);
        }

    } // end main
}
