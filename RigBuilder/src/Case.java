public class Case extends Components {

    String formFactor;
    int height;
    int depth;
    int width;
    int Fans140;
    int Fans120;

    // IO List;

    String SidePanel;

    boolean fansIncluded;
	
	// ------------------------------------------------------------------------	
	// Contrusctors
	// ------------------------------------------------------------------------	

    void reset()
    {
        height= 0;
        depth = 0;
        width = 0;
        Fans140 = 0 ;
        Fans120 = 0;
    
        // IO List;
        formFactor = "";
        SidePanel = "" ;
    
        fansIncluded = false;  
    }
	
	case()
	{
		super.reset();
		reset();
		return;
	}
	
	// ------------------------------------------------------------------------	
	// Setters
	// ------------------------------------------------------------------------	

    public void setDepth(int depth) 
    {
        this.depth = depth;
        return;
    }

    public void setFans120(int fans120) 
    {
        this.Fans120 = fans120;
        return;
    }

    public void setFans140(int fans140) 
    {
        this.Fans140 = fans140;
        return;
    }

    public void setFansIncluded(boolean fansIncluded) 
    {
        this.fansIncluded = fansIncluded;
        return;
    }

    public void setFormFactor(String formFactor) 
    {
        this.formFactor = formFactor;
        return;
    }

    public void setHeight(int height) 
    {
        this.height = height;
        return;
    }

    public void setSidePanel(String sidePanel) 
    {
        this.SidePanel = sidePanel;
        return;
    }

    public void setWidth(int width) 
    {
        this.width = width;
        return;
    }

	// ------------------------------------------------------------------------	
	// ------------------------------------------------------------------------	
	// ------------------------------------------------------------------------	

    public int getDepth() 
    {
        return depth;
    }

    public int getFans120() 
    {
        return Fans120;
    }

    public int getFans140() 
    {
        return Fans140;
    }

    public String getFormFactor() 
    {
        return formFactor;
    }

    public int getHeight() 
    {
        return height;
    }

    public String getSidePanel() 
    {
        return SidePanel;
    }

    public int getWidth() 
    {
        return width;
    }


}
