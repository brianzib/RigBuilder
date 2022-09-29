
public class Menu 
{

	public static void main(String[] args) 
	{

		MainMenu();
		NbuildMenu();

	}

	static void MainMenu ()
	{
		boolean flag = false;

		//	while (flag == false) // Change to the CheckValid function instead of using a flag
		//{
		System.out.println("\n");
		System.out.println("Please enter a number for one of the options below");
		System.out.println("-------------------------------------------------- \n\n");
		System.out.println("\t 1). Create new Build");
		System.out.println("\t 2). Update exising build");
		System.out.println("\t 3). Show build list");
		System.out.println("\t 4). Compare components");
		System.out.println("\t 5). Build Guides");
		System.out.println("\t 6). Exit");
		System.out.println("--------------------------------------------------");

		// String szInput = Functions.getInput();  Function for collecting input

		// Functions.checkValid(szInput);       Function for checking id the input is valid 

		// CreateBuild.submitChoice();

		//	}

	}

	static void NbuildMenu()
	{
		System.out.println("\n");
		System.out.println("Please enter a number for one of the options below");
		System.out.println("-------------------------------------------------- \n\n");
		System.out.println("\t 1). Current CPU:  " +  CPU.getName + "   Add or switch CPU");
		System.out.println("\t 2). Current GPU:  " +  GPU.getName + "   Add or switch GPU");
		System.out.println("\t 3). Current MotherBoard:  " +  Mobo.getName + "   Add or switch Motherboard");
		System.out.println("\t 4). Current CPU cooler:  " +  Cooler.getName + "   Add or switch CPU cooler");
		System.out.println("\t 5). Current Memory Module(s):  " +  RAM.getName + "Add or switch RAM");
		System.out.println("\t 6). Current Storage system:  " +  Storage.getName + "   Add or switch GPU");;
		System.out.println("\t 7). Current PSU:  " +  PSU.getName + "   Add or switch PSU");
		System.out.println("\t 8). Current Case:  " +  Case.getName + "   Add or switch GPU");
		System.out.println("\t 9). Save Build");
		System.out.println("\t10). Exit");
		System.out.println("--------------------------------------------------");
	}

}
