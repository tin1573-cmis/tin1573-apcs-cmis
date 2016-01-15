public class MyPod
{
    private String color;
    private int memory;
    private String[] songLibrary = new String[3];
    public MyPod()
    {
        this.color="neon green";
        this.memory=128;
        this.songLibrary[0]="We are the World";
        this.songLibrary[1]="What is Love";
        this.songLibrary[2]="Rasputin";
    } 

    public MyPod(String color, int memory, String song1, String song2, String song3 )
    {
        this.color=color;
        this.memory=memory;
        this.songLibrary[0]= song1;
        this.songLibrary[1]= song2;
        this.songLibrary[2]= song3;

    }

    public String toString()
    {
        String output =
            String.format(
                "color: %s\n" +
                "memory: %d\n" +
                "song1: %s\n" +
                "song2: %s\n"+
                "song3: %s\n" ,

                color, memory, songLibrary[0], songLibrary[1], songLibrary[2]);

        return output;

    }//toString
    
}  //instant variable 

