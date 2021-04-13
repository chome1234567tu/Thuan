import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator c = new Calculator();
		assertEquals(3,c.mul(3,1));
		
	}
	void lagermax()
	{
		
		Calculator c = new Calculator();
		assertEquals(Integer.MAX_VALUE-4 ,c.mul(Integer.MAX_VALUE+2, 0));
	//	System.out.println(Integer.MAX_VALUE+2);
	}

}
