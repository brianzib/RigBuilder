
public class Storage extends Components{

    int Capacity;

    String Type;
    String FormFactor;
    String Interface;

    void reset()
    {
        Capacity = 0;

        Type = "";
        FormFactor = "";
        Interface = "";

        return;
    }

    Storage()
    {
        super.reset();
        reset();
        return;
    }



    public void setCapacity(int capacity) 
    {
        this.Capacity = capacity;
        return;
    }

    public void setFormFactor(String formFactor) 
    {
        this.FormFactor = formFactor;
        return;
    }

    public void setInterface(String interface1) 
    {
        this.Interface = interface1;
        return;
    }

    public void setType(String type) 
    {
        this.Type = type;
        return;
    }

    public int getCapacity() 
    {
        return Capacity;
    }

    public String getFormFactor() 
    {
        return FormFactor;
    }

    public String getInterface() 
    {
        return Interface;
    }

    public String getType() 
    {
        return Type;
    }




}
