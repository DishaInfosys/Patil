package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 {
	@Test
	public void tc1() {
		Reporter.log("I am from TC1 Method");
	}
	@Test
	public void tc2() {
		Reporter.log("I am from TC2 method");
	}

}
