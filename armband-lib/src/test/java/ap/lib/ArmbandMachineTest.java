package ap.lib;

import org.junit.Test;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//imports above are used in JUnit 5
import static org.junit.Assert.*;

import ap.lib.IArmbandMachines;

public class ArmbandMachineTest {

	@Test
	public void shouldCalculateCost() {
		IArmbandMachines machine =
				new ArmBandMachine();
		assertEquals(12, machine.getCost(3, 4),0);
		//fail("Not yet implemented");
	}

}
