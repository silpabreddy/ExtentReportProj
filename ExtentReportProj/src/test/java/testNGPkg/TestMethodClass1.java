package testNGPkg;

import org.testng.annotations.Test;

public class TestMethodClass1 extends BeforeAfterAnnotationPgm {
	
	@Test
	public void testMethod1() {
		
		System.out.println("I am in Test Method 1");
	}
	
	@Test
	public void testMethod2() {
		
		System.out.println("I am in Test Method 2");
	}

	@Test
	public void testMethod3() {
		
		System.out.println("I am in Test Method 3");
	}
}
