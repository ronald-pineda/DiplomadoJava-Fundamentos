package djava;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import fundamentals.MainClass;

public class MainClassTest {

	@Test
	public void testMainClass() {
		MainClass mc = new MainClass();
		assertNotNull(mc);
	}

}
