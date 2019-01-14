package ap.lib;

public class Driver {

	public static void main(String[] args) {
		IArmbandMachines machine =
				new ArmBandMachine();
		System.out.println("Cost :" + machine.getCost(3, 4));

	}

}
