public class Swapper
{
    public static void main ( String[] args )
    {
        int highC=0;
        int highCnum=0;
        int highR=0;
        int highRnum=0;
        int intersect=0;
        int[][] grid = new int[][] {
                {9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        for (int r=0; r<grid.length;r++ )
        {
            int products=1;
            int x=0;
            for (int c=0; c<grid[0].length;c++ )
            {
                if( grid[r][c]>0)
                {
                    products =grid[r][c]*products;

                }
                x=c;
            }
            if (products>highCnum)
            {
                highCnum=products;
                highC=grid[r][x];
            }
            System.out.println (products);
        }

        System.out.println();
        for (int c=0; c<grid[0].length;c++ )
        {
            int products=1;
            int x=0;
            for (int r=0; r<grid.length;r++ )
            {
                if( grid[r][c]>0)
                {
                    products =grid[r][c]*products;

                }
                x=r;
            }
            if (products>highRnum)
            {
                highRnum=products;
                highR=grid[x][c]+1;
            }
            System.out.println (products);
        }
        System.out.println();
        System.out.println (highRnum);
        System.out.println (highC);
        System.out.println (highCnum);
        System.out.println (highR);

        intersect=grid[highC][highR];
        for (int r=0; r<grid.length;r++ )
        {
            for (int c=0; c<grid[0].length; c++)
            {
                if(grid[r][c]==intersect)
                {
                    grid[r][c]=0;
                }
                else if (grid[r][c]==0)
                {
                    grid[r][c]=intersect;
                }

            }
        }
        System.out.println();

        for (int[] row : grid )
        {
            for (int num : row)
            {
                System.out.print( num + " ");
            }
            System.out.println();
        }
    }

}