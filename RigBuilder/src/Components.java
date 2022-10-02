
public class Components {

	String szName;
	int TDP;
	boolean bOverclock;
	String Manufacturer;



	Components ()
	{
		reset();
		return;
	}

	void reset ()
	{
		String szName = "";
		int TDP = 0;
		boolean bOverclock = false;
		String Manufacturer = "";

		return;
	}

	public void setName (String Name)
	{
		this.szName = Name;
		return;
	}
	

	public void setTDP (int TDP)
	{
		this.TDP = TDP;
		return;
	}
	

	public void setOverclock (String overclock)
	{
		if (overclock == "no" || overclock == "No")
		{
			this.bOverclock = true;
		}
		else
		{
			this.bOverclock = false;
		}
		return;
	}
	
	public void setManufacturer (String szManufacturer)
	{
		this.Manufacturer = szManufacturer;
		return;
	}

	// Getters
	
	public String getName ()
	{
		return (szName);
	}
	
	public String getManufacturer ()
	{
		return (Manufacturer);
	}
	
	public boolean getOverclock()
	{
		return(bOverclock);
	}
	
	public int getTDP()
	{
		return(TDP);
	}
	
	// Display 
	
	void display()
	{
		System.out.println("Manufacturer::  " + getManufacturer());
		System.out.println("Name = " + getName());
		System.out.println("TDP = " + getTDP());
		System.out.println("Overclokable = " + getTDP());
		
	}
	
	public static void main(String[] args) {
		
		Components CPU  = new Components();
		CPU.setManufacturer("Intel");
		CPU.setOverclock("Yes");
	}

}
