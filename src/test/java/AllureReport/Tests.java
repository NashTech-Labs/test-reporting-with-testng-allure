package AllureReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({Listener.class})
public class Tests extends BaseClass{

	public WebDriver driver;
	
	@BeforeClass 
	public void setUp() {
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
		driver.get("https://demo.nopcommerce.com/");
		
	}
	
	@Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Verify Logo presence on Home Page")
	@Description("Verify Logo presence on Home Page........")
	@Epic("EP001")
	@Feature("Feature1: Logo")
	@Story("Story:Logo Presence")
	@Step("Verify logo Presence")
	public void logoPresence() throws InterruptedException
	{
		boolean dispStatus=driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
		Assert.assertEquals(dispStatus, true);
	}
	
	@Severity(SeverityLevel.BLOCKER)	
	@Test(priority=2)
	@Description("Verify login with different Credentials")
	@Epic("E01")
	@Feature("Feature2: Login")
	@Story("Story:PRO-45262")
	@Step("Verify login with different password")
	public void loginTest1() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("prajjawalkansal@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).submit();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store1");

	}
		
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority=3)
	@Description("Verify login with valid credentials")
	@Epic("E01")
	@Feature("Feature3: PRO-45262")
	@Story("Story:Verify login with same password")
	
	public void loginTest2() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("prajjawalkansal1218@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("prajjawal");
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).submit();
		Thread.sleep(3000);

		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store");
	}
	

	@AfterClass
	public void tearDown()
	{	
		driver.quit();
	}
	
}
