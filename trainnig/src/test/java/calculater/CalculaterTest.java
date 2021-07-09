package calculater;

import calculater.Calculater;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculaterTest {
	private Calculater c;

	@Before
	public void setUp() throws Exception {
		c = new Calculater();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void testAdd() {
		int value = c.add(4, 5);
		assert value == 9 : "The calculator is wrongly implimented";
	}

	@Test
	public void testSub() {
		int result = c.sub(5, 4);
		assert result == 1 : "The calculator is wrongly implimented";
	}

	@Test
	public void testMult() {
		int result = c.mult(4, 5);
		assert result == 20 : "The calculator is wrongly implimented";
	}

	@Test
	public void testDiv() {
		int result = c.div(2, 1);
		assert result == 2 : "The calculator is wrongly implimented";
	}

}
