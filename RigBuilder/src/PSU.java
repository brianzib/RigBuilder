public class PSU extends Components{

    int Wattage;

    String Modular;
    String powerRating;
    String Colour;

    double Length;

    void reset()
    {
        Wattage = 0;

        Modular = "";
        powerRating = "";
        Colour = "";

        Length = 0.0;

        return;
    }

    PSU()
    {
        super.reset();
        reset();
        return;
    }



    public void setColour(String colour) 
    {
        this.Colour = colour;
        return;
    }

    public void setLength(double length)
    {
        this.Length = length;
        return;
    }

    public void setModular(String modular)
    {
        this.Modular = modular;
        return;
    }

    public void setPowerRating(String powerRating) 
    {
        this.powerRating = powerRating;
        return;
    }

    public void setWattage(int wattage)
    {
        this.Wattage = wattage;
        return;
    }

    public String getColour() 
    {
        return Colour;
    }

    public double getLength() 
    {
        return Length;
    }

    public String getModular() 
    {
        return Modular;
    }

    public String getPowerRating()
    {
        return powerRating;
    }

    public int getWattage() 
    {
        return Wattage;
    }



}
