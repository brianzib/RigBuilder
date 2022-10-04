
public class Motherboard extends Components{

    String Socket;
    String Chipset;
    String FormFactor;
    String onBoardEthernet;
    String WirelessNetworking;

    int PCIEx16;
    int PCIEx8;
    int PCIEx4;
    int PCIEx1;
    int PCIEslots;
    int SataSlots;
    int bMNVMEslots;
    int eNVMEslots;
    int MaxMemory;

    boolean ECCSupport;
    boolean SLISupport;

	// ------------------------------------------------------------------------	
	// Contrusctors
	// ------------------------------------------------------------------------	

    void reset()
    {
        Socket = "";
        Chipset = "";
        FormFactor = "";
        onBoardEthernet = "";
        WirelessNetworking = "" ;

        PCIEx16 = 0;
        PCIEx8 = 0;
        PCIEx4 = 0 ;
        PCIEx1 = 0;
        PCIEslots = 0;
        SataSlots = 0;
        bMNVMEslots = 0;
        eNVMEslots = 0;
        MaxMemory = 0 ;

        ECCSupport = false;
        SLISupport = false;
    }

    Motherboard()
    {
        super.reset();
        reset();
        return;
    }

	// ------------------------------------------------------------------------	
	// Setters
	// ------------------------------------------------------------------------	

    public void setChipset(String chipset) 
    {
        this.Chipset = chipset;
        return;
    }

    public void setSocket(String socket) 
    {
        this.Socket = socket;
        return;
    }

    public void setFormFactor(String formFactor) 
    {
        this.FormFactor = formFactor;
        return;
    }

    public void setMaxMemory(int maxMemory) 
    {
        this.MaxMemory = maxMemory;
        return;
    }

    public void setOnBoardEthernet(String onBoardEthernet) 
    {
        this.onBoardEthernet = onBoardEthernet;
        return;
    }

    public void setPCIEslots(int pCIEslots)
    {
        this.PCIEslots = pCIEslots;
        return;

    }

    public void setPCIEx1(int pCIEx1) 
    {
        this.PCIEx1 = pCIEx1;
        return;
    }

    public void setPCIEx16(int pCIEx16) 
    {
        this.PCIEx16 = pCIEx16;
        return;
    }

    public void setPCIEx4(int pCIEx4) 
    {
        this.PCIEx4 = pCIEx4;
        return;
    }

    public void setPCIEx8(int pCIEx8) 
    {
        this.PCIEx8 = pCIEx8;
        return;
    }

    public void setSLISupport(boolean sLISupport) 
    {
        this.SLISupport = sLISupport;
        return;
    }

    public void setSataSlots(int sataSlots) 
    {
        this.SataSlots = sataSlots;
        return;
    }

    public void setWirelessNetworking(String wirelessNetworking) 
    {
        this.WirelessNetworking = wirelessNetworking;
        return;
    }

    public void setbMNVMEslots(int bMNVMEslots) 
    {
        this.bMNVMEslots = bMNVMEslots;
        return;
    }

    public void seteNVMEslots(int eNVMEslots) 
    {
        this.eNVMEslots = eNVMEslots;
        return;
    }

    public void setECCSupport(boolean eCCSupport) 
    {
        this.ECCSupport = eCCSupport;
        return;
    }
	
	// ------------------------------------------------------------------------	
	// Getters
	// ------------------------------------------------------------------------	

    public String getChipset() 
    {
        return Chipset;
    }

    public String getFormFactor()
    {
        return FormFactor;
    }

    public int getMaxMemory() 
    {
        return MaxMemory;
    }

    public String getOnBoardEthernet()
    {
        return onBoardEthernet;
    }

    public int getPCIEslots()
    {
        return PCIEslots;
    }

    public int getPCIEx1()
    {
        return PCIEx1;
    }

    public int getPCIEx16()
    {
        return PCIEx16;
    }

    public int getPCIEx4() 
    {
        return PCIEx4;
    }
    public int getPCIEx8() 
    {
        return PCIEx8;
    }

    public int getSataSlots() 
    {
        return SataSlots;
    }

    public String getSocket()
    {
        return Socket;
    }

    public String getWirelessNetworking()
    {
        return WirelessNetworking;
    }

    public int getbMNVMEslots() 
    {
        return bMNVMEslots;
    }

    public int geteNVMEslots()
    {
        return eNVMEslots;
    }

}
