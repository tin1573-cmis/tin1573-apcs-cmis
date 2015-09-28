import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main ( String args[] )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Type an integer: "));
        String output="";
        int thisNum; 
        int min=100;
        int max=-99;
        int sum=0;
        int swing=0;
        int outMin=0; 
        int outMax=0;
        int outSwing1=1;
        int outSwing2=0;
        if( input < 32 && input > 0)
        {
            int[] temp= new int[input];
            System.out.println("day" + "\t" + "temp"+ "\t" + "swing" + "\t" + "description");
            int i = 0;
            while(  i < temp.length )
            {
                temp[i] =((int)(200*Math.random())-100);
                thisNum=temp[i];
                if ( thisNum < min )
                {
                    min = thisNum;
                    outMin=i+1;
                }// end if

                if ( thisNum > max )
                {
                    max = thisNum;
                    outMax=i+1;
                }// end if

                sum += thisNum;
                if(i== 0)
                {
                    if(thisNum<=0)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Freezing"  + "\n"; 
                    }// end if
                    if(thisNum>0 && thisNum <=15 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Chilly"  + "\n"; 
                    }// end if
                    if(thisNum>=16 && thisNum <=30 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Comfortable"  + "\n"; 
                    }// end if
                    if(thisNum>=31 && thisNum <45 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Hot"  + "\n"; 
                    }// end if
                    if(thisNum>=45)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + "0" + "\t"+ "Argghhhh!!!"  + "\n"; 
                    }// end if
                }// end if
                else
                {
                    if(thisNum<=0)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+ "\t"+ "Freezing"  + "\n"; 
                    }// end if
                    if(thisNum>0 && thisNum <=15 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+ "\t"+ "Chilly"  + "\n"; 
                    }// end if
                    if(thisNum>=16 && thisNum <=30 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+  "\t"+ "Comfortable"  + "\n"; 
                    }// end if
                    if(thisNum>=31 && thisNum <45 )
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+  "\t"+ "Hot"  + "\n"; 
                    }// end if
                    if(thisNum>=45)
                    {
                        output += i+1 + "\t" + temp[i] + "\t" + Math.abs(temp[i-1]-temp[i])+  "\t"+ "Argghhhh!!!"  + "\n"; 
                    }// end if
                }// end else

                i++;

            }//end while
            for (int index=1; index<temp.length; index++)
            {
                if (Math.abs(temp[index-1]-temp[index])>swing)
                {
                    swing = Math.abs(temp[index-1]-temp[index]);
                    outSwing1=index+1;
                    outSwing2=index;
                }//end if

            }//end for
            System.out.print(output);
            System.out.println("The minimum temperature was " + min + " on day " + outMin);
            System.out.println("The maximum temperature was " + max + " on day " + outMax);
            System.out.println("The average temperature was " + (double) sum / (double) input);
            System.out.println("The biggest temperature swing was " + swing + " degrees between days "+outSwing2+" and "+outSwing1);

        }//end if
        else
        {
            System.out.print("That is not a valid number of days.");
        }// end else

    } // end main
} // end NAME