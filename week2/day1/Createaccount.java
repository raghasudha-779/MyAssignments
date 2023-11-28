                package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get( "http://leaftaps.com/opentaps/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Create Account")).click();
	
	driver.findElement(By.id("accountName")).sendKeys("RaghaSudha");
	
	WebElement industry = driver.findElement(By.name("industryEnumId"));
	Select industryvalue = new Select(industry);
	industryvalue.selectByValue("IND_SOFTWARE");
	
	WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	Select ownershipvisibletext = new Select(ownership);
	ownershipvisibletext.selectByVisibleText("S-Corporation");
	
	WebElement source = driver.findElement(By.name("dataSourceId"));
	Select sourcevalue = new Select(source);
	sourcevalue.selectByValue("LEAD_EMPLOYEE");
	
	WebElement MarketingCampaign = driver.findElement(By.name("marketingCampaignId"));
	Select Marketindex = new Select(MarketingCampaign);
	Marketindex.selectByIndex(5);
	

	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
	driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("1234");
	driver.findElement(By.id("primaryEmail")).sendKeys("fgfh@jhg.com");
	
	WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select statevalue = new Select(state);
	statevalue.selectByVisibleText("Texas");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	}
}
