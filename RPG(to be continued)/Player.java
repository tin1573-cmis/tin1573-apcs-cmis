import javax.swing.JOptionPane;
public class Player
{
    public static void main (String args[])
    { 
        String name= JOptionPane.showInputDialog( "What is your name?");
        int type= Integer.parseInt(JOptionPane.showInputDialog( "(1)High attack and low health (2)High health and low attack"));

        if ( type == 1)
        {
            int HPtype = 100;
            int APtype = 10;

        }
        else if (type == 2)
        {
            int  HPtype = 150;
            int APtype = 7;
        }
        System.out.println(HP);
    }
    private int HPtype;
    private int APtype;
    private int HP=HPtype;
    private String[] inventory = new String[10];
    private int HPStatus;
    private int AP = APtype;

    public void setHP()
    {
        System.outprintln(HP);
        if (HPStatus>0)
        {
            //HP=HP - damage;
        }
        else if (HPStatus<0)
        {
            //  HP=HP + regen;
        }
    }
}
/*
 * IV's-health points(HP)
 * inventory
 * name
 * attack points(AP)
 * type
 * 
 * Methods-
 * add/subtract health
 * add/remove items
 */