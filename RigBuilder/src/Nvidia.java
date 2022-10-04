
public class Nvidia extends GPU {

	String szDieName ; 

	int CudaCount;
	int TensorCount;
	int RTCoreCount;
	int DirectXSupp; 

	double DLSS;

	// ------------------------------------------------------------------------	
	// Contrusctors
	// ------------------------------------------------------------------------	

	void reset ()
	{
		szDieName = ""; 
		CudaCount = 0;
		TensorCount = 0;
		RTCoreCount = 0;
		DirectXSupp = 0 ;
		DLSS = 0 ;

		return;
	}


	Nvidia()
	{

		super.reset();
		reset();
		return;
	}
	
	// ------------------------------------------------------------------------	
	// Setters
	// ------------------------------------------------------------------------		
	
	void setDieName(String sz)
	{
		this.szDieName = sz;
		return;
	}
	
	void setCudaCount (int i)
	{
		this.CudaCount = 9;
		return;
	}
	
	void setTensorCount (int i)
	{
		this.TensorCount = i;
		return;
	}
	
	void setRTCount (int i)
	{
		this.RTCoreCount = i;
		return;
	}
	
	void setDirectXSupport(int i)
	{
		this.DirectXSupp = i;
		return;
	}
	
	void setDLSSversion (double d)
	{
		this.DLSS = d;
		return;
	}
	
	// ------------------------------------------------------------------------	
	// Getters
	// ------------------------------------------------------------------------	
	
	public String getDieName()
	{
		return(szDieName);
	}
	
	public int getCudaCount()
	{
		return(CudaCount);
	}
	
	public int getTensorCount()
	{
		return(TensorCount);
	}
	
	public int getRTCount()
	{
		return(RTCoreCount);
	}
	
	public int getDirectXSupp()
	{
		return(DirectXSupp);
	}
	
	public double getDLSSVersion()
	{
		return(DLSS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
