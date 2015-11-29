import javax.swing.JOptionPane;
public class PythagDriver
{

    public static void main (String args[])
    {
        double a = Double.parseDouble(JOptionPane.showInputDialog("a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c: "));
        Pythagorean pythagOne = new Pythagorean(a, b , c );
        pythagOne.calc();
        System.out.println(pythagOne);
    }
}
