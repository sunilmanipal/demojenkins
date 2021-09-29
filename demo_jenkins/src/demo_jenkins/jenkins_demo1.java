package demo_jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jenkins_demo1 {
	
	@Test
	public void testjenkins()
	{
		System.out.println("first program in jenkins");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		String a=driver.getTitle();
		System.out.println(a);
	}
	

}
