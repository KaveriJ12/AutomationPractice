package com.mySelemiumProject.testFile;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mySelemiumProject.javaFile.*;

public class DemoTestClass {
	DemoJavaClass demoJavaClass = new DemoJavaClass();

	@BeforeClass
	public void testSetup() {
		demoJavaClass.setup();
	}

	@BeforeMethod
	public void openBrowser() {

		demoJavaClass.openBrowser();

	}

	@Test(description = "This test case selects mobile")
	public void selectMobileTestCase() {
		demoJavaClass.selectMobileMethod();
	}

	@AfterMethod
	public void afterMobileSelection() {
		Reporter.log(demoJavaClass.driver.getTitle());
	}

	@AfterClass
	public void quitBrowser() {
		demoJavaClass.driver.quit();
	}
}
