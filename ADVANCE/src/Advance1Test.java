import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Advance1Test {
	Advance1 a = new Advance1();
	@Test
	void testUCLN() {
		assertEquals(3,a.USCLN(3, 6));
	}
	void testBCNN()
	{
		assertEquals(18,a.BSCNN(18, 6));
	}
}
