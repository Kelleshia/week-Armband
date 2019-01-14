package ap.lib;

//import ap.lib.IArmBandMachines;

public class ArmBandMachine  
	implements IArmbandMachines
	{
		public float getCost(float price, int quantity)
		{
			return price * quantity;
		}
	}
