import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import calcultor.dto.Calacultor;

public class CalciTest {
	Calacultor c = new Calacultor();
	@BeforeAll
	public static void beforeAll() {
		System.out.println("hi.............!");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("hi.............!");
	}

	@Test
	public void testAdd() {
		Assertions.assertEquals(-2, c.add(10, -12));
	}

	@Test
	public void testSub() {
		Assertions.assertEquals(-9, c.sub(-10, -1));
	}

	@Test
	public void testMul() {
		Assertions.assertEquals(20, c.mul(10, 2));
	}

	@Test
	public void testmod() {
		Assertions.assertEquals(0, c.mod(10, 2));
	}
	
	@Test
	public void testDiv() {
		Assertions.assertThrows(ArithmeticException.class,() ->{
			c.div(10, 0);
		});
	}
	@AfterEach
	public void AfterEach() {
		System.out.println("bye.............!");
	}
	@org.junit.jupiter.api.AfterAll
	public void AfterAll() {
		System.out.println("good bye.............!");
	}

}
