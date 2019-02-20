package loginmorningstar;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginMorningStar {
	@Test
	public void Homepage() {
		WebDriver driver=new FirefoxDriver();
		String url="https://www.morningstar.in/membership/";
		driver.get(url);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Mutual Funds, India, Ratings, Investment Research, Latest NAV, Portfolio Management";
	    assertEquals(expectedTitle,actualTitle);
	    System.out.println(driver.getTitle());
	
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	   wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a#ctl00_ucHeader_hlLogin"))).click(); 
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#ctl00_ContentPlaceHolder1_txtEmail"))).sendKeys("shyampotu@outlook.com");
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#ctl00_ContentPlaceHolder1_txtPassword"))).sendKeys("shyam1267");
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#ctl00_ContentPlaceHolder1_btnLogin"))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a#ctl00_ucHeader_hlLogin"))).click();
	 driver.quit();   
	   
		
	}

}
