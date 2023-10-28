package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Menu_1 {


	@Test
	void test() 
	{
		//fail("Not yet implemented");
		
		lab_2  test = new lab_2();
		double input = test.menu(2);
		
		assertEquals(2, input);
	}

}
