public class Memory extends Components {

    int TransferRate;
    int CasLatency;

    double Capacity;
    double Voltage;

    String Type;
    String Modules;
    String Timings;
    String ECCRegistered;


    void reset() {
        TransferRate = 0;
        CasLatency = 0 ; 
    
        Capacity = 0;
        Voltage = 0 ;
    
        Type = "";
        Modules = "";
        Timings = "";
        ECCRegistered = "";
    
        return;
    }

    Memory()
    {
        super.reset();
        reset();
        return;
    }


    public void setCapacity(double capacity) 
    {
        this.Capacity = capacity;
        return;
    }

    public void setCasLatency(int casLatency) 
    {
        this.CasLatency = casLatency;
        return;
    }

    public void setECCRegistered(String eCCRegistered) 
    {
        this.ECCRegistered = eCCRegistered;
        return;
    }

    public void setModules(String modules) 
    {
        this.Modules = modules;
        return;
    }

    public void setTimings(String timings) 
    {
        this.Timings = timings;
        return;
    }

    public void setTransferRate(int transferRate) 
    {
        this.TransferRate = transferRate;
        return;
    }

    public void setType(String type) 
    {
        this.Type = type;
        return;
    }

    public void setVoltage(double voltage) 
    {
        this.Voltage = voltage;
        return;
    }

    public double getCapacity() 
    {
        return Capacity;
    }

    public int getCasLatency() 
    {
        return CasLatency;
    }

    public String getTimings() 
    {
        return Timings;
    }

    public int getTransferRate() 
    {
        return TransferRate;
    }

    public String getECCRegistered() 
    {
        return ECCRegistered;
    }

    public String getModules() 
    {
        return Modules;
    }

    public String getType() 
    {
        return Type;
    }

    public double getVoltage() 
    {
        return Voltage;
    }




}
