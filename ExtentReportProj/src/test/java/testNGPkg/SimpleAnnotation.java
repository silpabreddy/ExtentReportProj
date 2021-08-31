package testNGPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;

public class SimpleAnnotation {
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("I am in Before Method updated in Git Repository");
		
		}
	@Test
		public void testMethod() {
		System.out.println("I am in Test Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("I am in After method updated in Git Repository");
	}

}
