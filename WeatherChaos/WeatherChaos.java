import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main ( String args[] )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
        int[] temp= new int[input];
        System.out.println("day" + "\t" + "temp"+ "\t" + "swing" + "\t" + "description");
        String output="";
        int thisNum; 
        int min=100;
        int max=-99;
        int sum=0;
        int swing=0;
        int output2=0; 
        int output3=0;
        int output4=0;
        int output5=0;
        if( input < 32 && input > 0)
        {
            int i = 0;
            while(  i < temp.length )
            {
                temp[i] =((int)(200*Math.random())-100);
                thisNum=temp[i];
                if ( thisNum < min )
                {
                    min = thisNum;
                    output2=i+1;
                }

                if ( thisNum > max )
                {
                    max = thisNum;
                    output3=i+1;
                }

                sum += thisNum;
                if(i== 0)
                {
                    if(thisNum<=0)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Freezing"  + "\n"; 
                    }
                    if(thisNum>0 && thisNum <=15 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Chilly"  + "\n"; 
                    }
                    if(thisNum>=16 && thisNum <=30 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Comfortable"  + "\n"; 
                    }
                    if(thisNum>=31 && thisNum <45 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Hot"  + "\n"; 
                    }
                    if(thisNum>=45)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Argghhhh!!!"  + "\n"; 
                    }
                }
                else
                {
                    if(thisNum<=0)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+ "\t"+ "Freezing"  + "\n"; 
                    }
                    if(thisNum>0 && thisNum <=15 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+ "\t"+ "Chilly"  + "\n"; 
                    }
                    if(thisNum>=16 && thisNum <=30 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+  "\t"+ "Comfortable"  + "\n"; 
                    }
                    if(thisNum>=31 && thisNum <45 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+  "\t"+ "Hot"  + "\n"; 
                    }
                    if(thisNum>=45)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+  "\t"+ "Argghhhh!!!"  + "\n"; 
                    }
                }

                i++;

            }//end while

        }//end if
        else
        {
            System.out.print("That is not a valid number of days");
        }
        for (int i=1; i<temp.length; i++)
        {

            if (Math.abs(temp[i-1]-temp[i])>swing)
            {
                swing = Math.abs(temp[i-1]-temp[i]);
                output4=i-1;
                output5=i;
            }//end if

        }//end for
        System.out.print(output);
        System.out.println("MIN: " + min + " on day" + output2);
        System.out.println("MAX: " + max + " on day" + output3);
        System.out.println("AVG: " + (double) sum / (double) input);
        System.out.println("SWING: " + swing + "between day "+output4+"and day "+output5);

    } // end main
} // end NAME