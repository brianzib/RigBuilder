
public class CPU extends Components  {

	int CoreCount;
	int ThreadCount;
	int MaxMemory;
	int DirectXSupp;
	int OpenGLSupp;

	String Socket;
	String MaxMemorySpeed;
	String MemoryType;
	String Graphics;

	double BaseGraphicsFreq;
	double DynamicGraphicsFreq;
	double BaseFreq;
	double BoostFreq;

	boolean ECCSupport;
	boolean VT;

	// ------------------------------------------------------------------------	
	// Contrusctors
	// ------------------------------------------------------------------------	
	
	CPU ()
	{
		super.reset()
		reset();
		return;
	}


	void reset()
	{
		CoreCount = 0;
		ThreadCount =0;
		MaxMemory = 0;
		DirectXSupp = 0;
		OpenGLSupp = 0;

		Socket = "";
		MaxMemorySpeed = "";
		MemoryType = "";
		Graphics = "";

		BaseGraphicsFreq = 0.0;
		DynamicGraphicsFreq = 0.0;
		BaseFreq = 0.0;
		BoostFreq = 0.0;

		ECCSupport = false;
		VT = false;

		return;
	}

	// ------------------------------------------------------------------------	
	// Setters
	// ------------------------------------------------------------------------	
	void setCoreCount(int i)
	{
		this.CoreCount = i;
		return;
	}

	void setThreadCount(int i)
	{
		this.ThreadCount = i;
		return;
	}

	void setMaxMemory(int i)
	{
		this.MaxMemory = i;
		return;
	}

	void setDirectX(int i)
	{
		this.DirectXSupp = i;
		return;
	}

	void setOenGL(int i)
	{
		this.OpenGLSupp = i;
		return;
	}

	void setSocket(String sz)
	{
		this.Socket = sz;
		return;
	}

	void setMemorySpeed(String sz)
	{
		this.MaxMemorySpeed = sz;
		return;
	}

	void setMemoryType(String sz)
	{
		this.MemoryType = sz;
		return;
	}

	void setGraphics(String sz)
	{
		this.Graphics = sz;
		return;
	}

	void setGtaphicsFreq(double d)
	{
		this.BaseGraphicsFreq = d;
		return;
	}

	void setDynamicGtaphicsFreq(double d)
	{
		this.DynamicGraphicsFreq = d;
		return;
	}

	void setBaseFreq(double d)
	{
		this.BaseFreq = d;
		return;
	}

	void setBoostFreq(double d)
	{
		this.BoostFreq= d;
		return;
	}

	void setECCSupport(boolean b)
	{
		this.ECCSupport = b;
		return;
	}

	void setVTSupport(boolean b)
	{
		this.VT = b;
		return;
	}

	// ------------------------------------------------------------------------	
	// ------------------------------------------------------------------------	
	// ------------------------------------------------------------------------	
	
	public int getCoreCount()
	{
		return(CoreCount);
	}

	public int getThreadCount()
	{
		return(ThreadCount);
	}

	public int getMaxMemory()
	{
		return(MaxMemory);
	}

	public int getDirectX()
	{
		return(DirectXSupp);
	}

	public int getOpenGL()
	{
		return(OpenGLSupp);
	}

	public String getSocket()
	{	
		return(Socket);
	}

	public String getMemorySpeed()
	{	
		return(MaxMemorySpeed );
	}

	public String getMemoryType()
	{
		return(MemoryType);
	}

	public String getGraphics()
	{
		return(Graphics);
	}

	public double getGraphicsFreq()
	{
		return(BaseGraphicsFreq);
	}

	public double getDynamicGraphicsFreq()
	{

		return(DynamicGraphicsFreq);
	}

	public double getBaseFreq()
	{

		return(BaseFreq);
	}

	public double getBoostFreq()
	{
		return(BoostFreq);
	}

	public boolean getECCSupport()
	{	
		return(ECCSupport);
	}

	public boolean getVTSupport()
	{
		return(VT);
	}
	
	
	// ------------------------------------------------------------------------	
	// Display Function
	// ------------------------------------------------------------------------	
	
	void Display()
	{
		System.out.println("The CPU Core Count is  " + getCoreCount());
		System.out.println("The CPU Thread Cunt is  " + getThreadCount());
		System.out.println("The CPU's Base frequency is " + getBaseFreq());
		System.out.println("The CPU's Boost frequency is " + getBoostFreq());
		System.out.println("The CPU uses " + getMemoryType() + " Type of Memory");
		System.out.println("The CPU's Max Memory Size is " + getMaxMemory());
		System.out.println("The CPU's Max supported memory speed is " + getMemorySpeed());
		
	}
	
	public static void main(String[] args) {
			
	}

}
