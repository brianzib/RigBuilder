

public class Cooler extends Components{

    boolean WaterCooler;
    // SocketSupport - list
    int FanRPM;

    double NoiseLevel;
    double Height;
    double Length;
	
	// ------------------------------------------------------------------------	
	// Contrusctors
	// ------------------------------------------------------------------------	

    void reset()
    {
        WaterCooler = false;
        // SocketSupport - list
        FanRPM = 0;

        NoiseLevel = 0;
        Height = 0;
        Length = 0;
     
        return;
    }

    Cooler()
    {
        super.reset();
        reset();
        return;
    }

	// ------------------------------------------------------------------------	
	// Setters
	// ------------------------------------------------------------------------	


    public void setFanRPM(int fanRPM) 
    {
        this.FanRPM = fanRPM;
        return;
    }

    public void setNoiseLevel(double noiseLevel) 
    {
        this.NoiseLevel = noiseLevel;
        return;
    }


    public void setWaterCooler(boolean waterCooler) 
    {
        this.WaterCooler = waterCooler;
        return;
    }

    public void setHeight(double height) 
    {
        this.Height = height;
        return;
    }

    public void setLength(double length) 
    {
        this.Length = length;
        return;
    }

	// ------------------------------------------------------------------------	
	// ------------------------------------------------------------------------	
	// ------------------------------------------------------------------------	


    public double getHeight() 
    {
        return Height;
    }

    public double getLength() 
    {
        return Length;
    }

    public int getFanRPM() 
    {
        return FanRPM;
    }

    public double getNoiseLevel() 
    {
        return NoiseLevel;
    }

    public boolean getWaterCooler()
    {
        return WaterCooler;
    }




}
