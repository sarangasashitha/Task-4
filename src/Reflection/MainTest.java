package Reflection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {

	/* These test are written for public methods written in the class passed.
	 * if some method is private we have to make it public or write a reflection API in test class
	 * using getDeclaredFields()
	 */
		
	/*1 we checks here whether the getA() method is worked.
	 * a=10, b=20, c=30
	 * Actual value should be 10
	 */	
	@Test
	public void testgetA() {
		Main r = new Main(10,20,30);
		assertEquals(10,r.getA());
	}
	/*2 we checks here whether the setA() method is worked.
	 * new A value= 50
	 * Actual value should be 50
	 */	
	@Test
	public void testsetA() {
		Main r = new Main();
		r.setA(50);
		assertEquals(50,r.getA());
	}
	
	/*3 we checks here whether the SquareA() method is worked.
	 * b=10
	 * Actual value should be 10*10 = 100
	 */	
	@Test
	public void testSquareA() {
		Main r = new Main(10,20,30);
		r.squareA();
		assertEquals(100,r.getA());
	}	
	/*4 we checks here whether the SquareB() method is worked.
	 * new B value= 25
	 * Actual value should be 25*25 = 625
	 */
	@Test
	public void testSetBSquareB() {
		Main r = new Main();
		r.setB(25);
		r.squareB();
		assertEquals(625,r.getB());
	}
	
	/*5 we checks here whether the toString() method is worked.
	 * a=10 b=20 C=30
	 * and from toSting() it will displayed as 
	 * a:10, b:20, c:30
	 */
	@Test
	public void testSquare() {
		Main r = new Main(10,20,30);
		r.getA();
		r.getB();
		r.getC();
		assertEquals("(a:10, b:20, c:30)",r.toString() );
	}
	
}

