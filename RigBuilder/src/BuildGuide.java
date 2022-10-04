public class BuildGuide {
    public static void main(String[] args)
    {
       String szGuideSelection = "";
	   boolean ValidGuide = false;	 
	   
	   Menu.displayGuideMenu();

       
		while (Validguide = false)
		{
			szGuideSelection = Functions.getInput(szGuideSelection);
			ValidGuide = Functions.checkGuide(szGuideSelection);
		}
		
		Functions.collectGuide(szGuideSelection);
    }
}

