
public class GPU {


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
		reset();
		return;
	}
void setMemoryType()
	
	{

	}

		




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
