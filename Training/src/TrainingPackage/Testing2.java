package TrainingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing2 {

@Test
	public void TestCalcNumbers() 
{
	int answer = 2+2;
	
	assertEquals("2 + 2 = 4",4, answer);
	
}
	

@Test
public void integerExampleTest()
{
	Integer four = new Integer (4);
	assertEquals("intValue returns int 4",4, four.intValue());
	
}
	
@Test 
public void testStringExample()
{
	Integer five = new Integer("5");
	assertEquals(5, five.intValue());
}

@Test
public void maxIntegerSizes() {
	
	Integer minnie = new Integer(Integer.MIN_VALUE);
	Integer maxxie = new Integer(Integer.MAX_VALUE);
	
	assertEquals(-2147483648, minnie.intValue());
	assertEquals(2147483647, maxxie.intValue());
}


}
