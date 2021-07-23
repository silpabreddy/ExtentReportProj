package testNGPkg;

import org.testng.annotations.*;

public class BeforeAfterAnnotationPgm {

	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("I am in Before Method");
		
		}
	
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("I am in After method");
	}
}
