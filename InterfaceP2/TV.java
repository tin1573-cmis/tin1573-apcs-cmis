public abstract class TV
{

    private boolean tvOn;
    
    public TV()
    {
        tvOn = false;
    }

    public boolean turnTvOn()
    {
        return tvOn;
    }

    public void setTv(boolean tvOn)
    {
        this.tvOn = tvOn;
    }

    public abstract String tvType();
    
}