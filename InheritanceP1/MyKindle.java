public class MyKindle extends MyDevice
{
    private int numOfBooks;

    public MyKindle()
    {
        super();
        this.numOfBooks = 12;
    }

    public MyKindle(int memory, String color, int numOfBooks)
    {
        super(memory, color);
        this.numOfBooks = numOfBooks;
    }

    public void setNumOfBooks(int num)
    {
        this.numOfBooks = num;
    }

    public int getNumOfBooks()
    {
        return numOfBooks;   
    }

    public String toString()
    {
        String output = new String("");
        output = super.toString() + 
        "\nNumber of Books: " + numOfBooks;
        return output;
    }
}
