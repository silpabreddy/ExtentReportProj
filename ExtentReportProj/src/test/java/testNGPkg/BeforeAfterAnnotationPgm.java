package testNGPkg;

import org.testng.annotations.*;

public class BeforeAfterAnnotationPgm {

	
	@BeforeMethod
	public void beforeMethod() {
		

		System.out.println("I am in Before Method updated recently in GIT and again updated in Program");

		
		}
	
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("I am in After method updated in Git");
	}
}
