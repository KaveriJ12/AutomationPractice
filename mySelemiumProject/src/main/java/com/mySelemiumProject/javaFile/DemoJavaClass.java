package com.mySelemiumProject.javaFile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavaClass {
	
	public String baseUrl="https://www.amazon.in/";
	public WebDriver driver;
	
	public void setup() {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void openBrowser() {
		driver.get(baseUrl);
	}
	
	public void selectMobileMethod() {
//		driver.findElement(By.id("nav-hamburger-menu")).click();
//		driver.findElement(By.xpath("//div[text()=\"Mobiles, Computers\"]")).click();
//		driver.findElement(By.xpath("//a[text()=\"All Mobile Phones\"]")).click();
		System.out.println(driver.getTitle());
//		WebElement redmiCheckBox=driver.findElement(By.name("s-ref-checkbox-Redmi"));
//		if(!redmiCheckBox.isSelected()) {
//			redmiCheckBox.click();
//		}
//		
//		List<WebElement> selectMobile=driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
//		
//		for(int i=0;i<selectMobile.size();i++) {
//			System.out.println(selectMobile.get(i).getText());
//		}
//		selectMobile.get(2).click();
	}


}
