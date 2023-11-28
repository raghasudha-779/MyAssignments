package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;

public class Facebookcreateaccount {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get(" https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Create new account")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abirami");
	driver.findElement(By.name("lastname")).sendKeys("abirami");
	driver.findElement(By.name("reg_email__")).sendKeys("sudha@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Confirm@123");
	
	
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sudha@gmail.com");
	//byvalue
	WebElement date = driver.findElement(By.id("day"));
	Select datevalue = new Select(date);
	datevalue.selectByValue("7");
	//byvisibletext
	WebElement month = driver.findElement(By.id("month"));
	Select monthvalue = new Select(month);
	monthvalue.selectByVisibleText("Jul");
	//byindex
	WebElement year = driver.findElement(By.id("year"));
	Select yearvalue = new Select(year);
	yearvalue.selectByIndex(27);
	
	
	driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	driver.findElement(By.name("websubmit")).click();
}
}
