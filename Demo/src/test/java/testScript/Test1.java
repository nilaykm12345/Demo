package testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.GooglePO;
import POM.SearchPO;
import library.BaseTest;

public class Test1 extends BaseTest
{
	public WebDriverWait wait;
	@Test
	public void testFaceBookHkome()
	
	{
	
		wait=new WebDriverWait(driver, 20);
		driver.get("https://google.com");
		GooglePO googprPO=new GooglePO(driver);
		googprPO.searchTxtBx().sendKeys("facebook"+Keys.ENTER);
		SearchPO searchpo=new SearchPO(driver);
		searchpo.verifyElement(searchpo.facebooklink());
		searchpo.facebooklink().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String eTitle= "Facebook – log in or sign up";
		wait.until(ExpectedConditions.titleContains(eTitle));	
		String aTitle = driver.getTitle();
		Reporter.log("Tital displayed is"+aTitle,true);
		Assert.assertEquals(aTitle,eTitle);
	
	
	
	}
	
}
