
public class GPU extends /* */Components {


	String MemoryType;  
	String PowerConnectors;  

	int BusWidth;  
	int PCIEGen;  
	int HDMIports;  
	int DisplayPorts;  
	int VGAPorts;  
	int DVIPorts;  

	double baseClock;  
	double boostClock;  
	double MemorySize;  
	
	// ------------------------------------------------------------------------	
	// Contrusctors
	// ------------------------------------------------------------------------	
	
	void reset ()
	{
	
		MemoryType  = ""; 
		PowerConnectors = "";  

		BusWidth = 0 ; 
		PCIEGen = 0 ; 
		HDMIports = 0 ; 
		DisplayPorts = 0 ;  
		VGAPorts = 0 ; 
		DVIPorts = 0 ; 

		baseClock = 0;  
		boostClock = 0 ; 
		MemorySize = 0 ;  

		return;
	}
	
	GPU ()
	{
		super.reset();
		reset();
		return;
	}

	// ------------------------------------------------------------------------	
	// Setters
	// ------------------------------------------------------------------------	

	public void setMemoryType(String memoryType) 
	{
		MemoryType = memoryType;
		return;
	}

	public void setPCIEGen(int pCIEGen) 
	{
		PCIEGen = pCIEGen;
		return;
	}

	public void setBaseClock(double baseClock) 
	{
		this.baseClock = baseClock;
		return;
	}

	public void setBoostClock(double boostClock) 
	{
		this.boostClock = boostClock;
		return;
	}

	public void setBusWidth(int busWidth) 
	{
		this.BusWidth = busWidth;
		return;
	}

	public void setDVIPorts(int dVIPorts) 
	{
		this.DVIPorts = dVIPorts;
		return;
	}

	public void setDisplayPorts(int displayPorts) 
	{
		this.DisplayPorts = displayPorts;
		return;
	}

	public void setHDMIports(int hDMIports) 
	{
		this.HDMIports = hDMIports;
		return;
	}

	public void setMemorySize(double memorySize) 
	{
		this.MemorySize = memorySize;
		return;
	}

	public void setPowerConnectors(String powerConnectors) 
	{
		this.PowerConnectors = powerConnectors;
		return;
	}

	public void setVGAPorts(int vGAPorts) 
	{
		this.VGAPorts = vGAPorts;
		return;
	}
	
	// ------------------------------------------------------------------------	
	// Getters
	// ------------------------------------------------------------------------	

	public double getBaseClock() {
		return baseClock;
	}

	public double getBoostClock() {
		return boostClock;
	}

	public int getBusWidth() 
	{
		return BusWidth;
	}

	public int getDVIPorts() 
	{
		return DVIPorts;
	}

	public int getDisplayPorts() 
	{
		return DisplayPorts;
	}

	public int getHDMIports() 
	{
		return HDMIports;
	}

	public double getMemorySize() 
	{
		return MemorySize;
	}

	public String getMemoryType() 
	{
		return MemoryType;
	}
	public int getPCIEGen() {
		return PCIEGen;
	}

	public String getPowerConnectors() 
	{
		return PowerConnectors;
	}

	public int getVGAPorts() 
	{
		return VGAPorts;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
