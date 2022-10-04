public class WaterCooler extends Cooler {
    
    int RadiatorSize;
    boolean LCDdisplay;
	
	// ------------------------------------------------------------------------	
	// Contrusctors
	// ------------------------------------------------------------------------	
	
	void reset()
	{
		RadiatorSize = 0;
		LCDdisplay = false;
		return;
	}
	
	WaterCooler ()
	{
		super.reset();
		reset();
		return;
	}

	// ------------------------------------------------------------------------	
	// Setters
	// ------------------------------------------------------------------------	

    public void setLCDdisplay(boolean lCDdisplay) 
    {
        this.LCDdisplay = lCDdisplay;
        return;
    }

    public void setRadiatorSize(int radiatorSize) 
    {
        this.RadiatorSize = radiatorSize;
        return;
    }

	// ------------------------------------------------------------------------	
	// Getters
	// ------------------------------------------------------------------------	

	public boolean getLCDDisplay()
	{
		return(LCDDisplay);
	}
	
	public int getRadiatorSize()
	{
		return(RadiatorSize);
	}
}
