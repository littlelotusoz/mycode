package WebTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebAppPageTitleTest {
	
	@Before
	public void testSetup() {
		
		System.out.println("One");
		
	}

	@After
	public void testShutdown() {
		System.out.println("Two");
	}
	
	@Test
	public void shouldHavePageTitleOfAboutZoo() {
		System.out.println("Three");
}
}
