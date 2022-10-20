package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabsLoginPage;
import utility.CommonElements;
import utility.Parametrization;

@Listeners(utility.Listeners.class)
public class SwagLabsLoginTest extends CommonElements
{
	@BeforeClass
	public void openBrowser()
	{
		driver = Browser.openChromeBrowser();
	}
	
	@Test
	public void validateLogin() throws EncryptedDocumentException, IOException
	{
		SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
		swagLabsLoginPage.enterUsername(Parametrization.getData(0, 1));
		swagLabsLoginPage.enterPassword(Parametrization.getData(1, 1));
		swagLabsLoginPage.clickOnLogin();
	}
	

}
