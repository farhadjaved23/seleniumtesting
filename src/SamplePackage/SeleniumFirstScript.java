package SamplePackage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.jasper.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFirstScript {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\FARHAD\\Downloads\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");
		WebDriver web=new ChromeDriver(options);
		web.get("https://qatestid12.wixsite.com/qaspecialist");
		web.manage().window().maximize();
		
		
		//when you go through link
				WebElement contact;
				contact = web.findElement(By.id("comp-ifgtula74label"));
				//contact.click();
				
				//through link
				JavascriptExecutor jse=(JavascriptExecutor)web;
				jse.executeScript("arguments[0].scrollIntoView()", contact);
				
				WebElement name;
				name = web.findElement(By.id("comp-jhrgftz1input"));
				name.clear();
				name.sendKeys("farhad javed");
				
				//WebDriverWait wait = new WebDriverWait(web,20);
				//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("comp-jhrgftz1input")));
				web.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				
				WebElement email;
				email = web.findElement(By.id("comp-jhrggrufinput"));
				email.clear();
				email.sendKeys("mytc5@gmail.com");
				
				WebDriverWait wait2 = new WebDriverWait(web,20);
				wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("comp-jhrggrufinput")));
				
				WebElement subject;
				subject = web.findElement(By.id("comp-jhrgh32ainput"));
				subject.clear();
				subject.sendKeys("hello");
				
				WebDriverWait wait3 = new WebDriverWait(web,20);
				wait3.until(ExpectedConditions.presenceOfElementLocated(By.id("comp-jhrgh32ainput")));
				
				WebElement msg;
				msg = web.findElement(By.id("comp-jhrgk2pstextarea"));
				msg.clear();
				msg.sendKeys("good to see that...");
				
				WebDriverWait wait4 = new WebDriverWait(web,20);
				wait4.until(ExpectedConditions.presenceOfElementLocated(By.id("comp-jhrgk2pstextarea")));
				
				WebElement loginButton;  
				loginButton = web.findElement(By.xpath("//*[@id=\"comp-jhrgemmllabel\"]"));
				loginButton.click(); 
		
		

	}
 
}
