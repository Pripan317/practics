package dev;



import static org.junit.Assert.assertEquals;

import org.junit.*;

import dev.dev09.JavaCalculator;


public class CalculatorTest {
	public static JavaCalculator objCalculator;

	
@Before
	public void setup() throws Exception {
	 objCalculator=new JavaCalculator();
	}

	
@After
	public void tearDown() throws Exception {

	System.out.println("closing ");
	}
@Test


	

	public void additionTest() {

	assertEquals(25, objCalculator.addition(12, 13));
	}
@Test
public void subtractionTest() {

	assertEquals(-1, objCalculator.subtraction(12, 13));
	

}
@Test
public void multiplicationTest() {

	assertEquals(156, objCalculator.multiplication(12, 13));
	

}
@Test
public void divisionTest() {

	assertEquals(0, objCalculator.division(12, 13));
	

}



}

	
