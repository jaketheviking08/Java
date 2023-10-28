package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Stats_Avg {

	@Test
	void test() 
	{
		//fail("Not yet implemented");
		
		lab_2  test = new lab_2();
		double input = test.stats(2,4);
		
		assertEquals(0.5, input);
	}

}
