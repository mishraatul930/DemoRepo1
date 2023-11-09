package testngbasics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestNgBasics {
	@BeforeSuite
	public void setup() {
		System.out.println("driver setup");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("This is browser launch");
	}

}