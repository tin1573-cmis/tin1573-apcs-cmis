import java.util.ArrayList;
public class SuperDriver
{
    public static void main (String args[])
    {
        AsteroidMan sup1 = new AsteroidMan( );
        sup1.setSuitColor("Black");
        sup1.setCape( true );

        FriedEggMan sup2 = new FriedEggMan( );
        sup2.setSuitColor("Yellow");
        sup2.setCape( false );

        ManMan sup3 = new ManMan( );
        sup3.setSuitColor("Pink");
        sup3.setCape( true );

        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(sup1);
        heroes.add(sup2); 
        heroes.add(sup3);

        SuperHero[][] capeHero = new SuperHero[3][3];
        for (SuperHero hero : heroes)
        {
            System.out.println(hero);
        }
        System.out.println();
        int size = heroes.size();
        int i=0;

        for(int row = 0; row < capeHero.length; row++)
        {
            for(int col = 0; col < capeHero[0].length; col++)
            {
                if(i < heroes.size())
                {
                    if(heroes.get(i).isCaped() == true)
                    {
                        capeHero[row][col] = heroes.get(i);
                        heroes.remove(heroes.get(i));
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }

        System.out.println();

        for (SuperHero[] row : capeHero )
        {
            for (SuperHero superHero : row)
            {
                System.out.print( superHero  + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (SuperHero hero : heroes)
        {
            System.out.println(hero);
        }
    }
}
