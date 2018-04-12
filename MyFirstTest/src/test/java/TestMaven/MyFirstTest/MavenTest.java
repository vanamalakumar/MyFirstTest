package TestMaven.MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest {
	@Test
	public void xxxtest()
	{
	
System.out.println("hello");
System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://www.indeed.co.in");
driver.findElement(By.id("what")).clear();
driver.findElement(By.id("what")).sendKeys("Selenium");
driver.findElement(By.id("where")).clear();
driver.findElement(By.id("where")).sendKeys("Bangalore");
driver.findElement(By.id("fj")).click();
String actual = driver.findElement(By.className("summary")).getText();
Assert.assertTrue(actual.contains("Selenium"));
}
}