package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("testleaf.2023@gamil.com");
	driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();
	WebElement error = driver.findElement(By.linkText("Find your account and log in."));
	error.click();
	String title = driver.getTitle();
	System.out.println(title);
	
}
}
