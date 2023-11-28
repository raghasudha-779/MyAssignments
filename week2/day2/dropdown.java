package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	// load the url
	driver.get("http://leaftaps.com/opentaps/control/main");
	// maximize the browser
	driver.manage().window().maximize();
	// to locate the username element -> ctrl 2 l
	// WebElement username = driver.findElement(By.id("username"));
	// username.sendKeys("DemoCSR");
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	// totype inthe text field use sendKeys()

	// to loacte the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");

	// to click on the login button
	driver.findElement(By.className("decorativeSubmit")).click();

	// click on the link CRMSFA
	WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	System.out.println(crmsfa.getText());// Element verification
	crmsfa.click();

	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

	// to handle drop down -- select tag
	// step:1 locate the drop doen ele
	// step:2 use select class by creating a object and pass argument as webelement

	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));

	Select dd = new Select(source);
	dd.selectByIndex(4);// using index

	WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

	Select mark = new Select(marketing);
	mark.selectByValue("CATRQ_AUTOMOBILE"); // the value attribute
	mark.selectByVisibleText("Car and Driver");// using black text
	
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));

	Select indus = new Select(industry);
	indus.selectByVisibleText("Computer Software");
	
	WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));

	Select owner = new Select(Ownership);
	owner.selectByIndex(3);
}
}
