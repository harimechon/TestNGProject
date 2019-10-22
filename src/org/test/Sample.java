package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	@Parameters({"FirstName","LastName","Address","EmailAddress","Phone","Password","ConfirmPassword"})
	@Test
	public void test1(String Fname,String Lname,String Add,String Email,String Phone,String pass,String cpass) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.preethi\\Desktop\\myselenium\\TestNG\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement Ftname =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		Ftname.sendKeys("Hari");
		WebElement  Lsname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		Lsname.sendKeys("Prasath");
		WebElement add =driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		add.sendKeys("176C5jkknataraja");
		WebElement mail =driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		mail.sendKeys("harimech18@gmail.com");
		WebElement phno =driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phno.sendKeys("8754949406");
		WebElement radiobt =driver.findElement(By.xpath("//input[@value='Male']"));
		radiobt.click();
		WebElement checkbox =driver.findElement(By.id("checkbox1"));
		checkbox.click();
		WebElement drop =driver.findElement(By.id("msdd"));
		drop.click();
		WebElement clickeng =driver.findElement(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")));
		clickeng.click();
		WebElement skl =driver.findElement(By.id("Skills"));
		Select s=new Select(skl);
		s.selectByVisibleText("Mobile");
		WebElement cnt =driver.findElement(By.id("countries"));
		Select s1=new Select(cnt);
		s1.selectByVisibleText("India");
		WebElement cntry =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		Select s2=new Select(cnt);
		s2.selectByVisibleText("India");
		WebElement yr =driver.findElement(By.id("yearbox"));
		Select s3=new Select(yr);
		s3.selectByVisibleText("1993");
		WebElement month =driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select s4=new Select(month);
		s4.selectByVisibleText("August");
		WebElement date =driver.findElement(By.id("daybox"));
		Select s6=new Select(date);
		s6.selectByVisibleText("15");
		WebElement passw =driver.findElement(By.id("firstpassword"));
		passw.sendKeys("12345678");
		WebElement cpassw =driver.findElement(By.id("secondpassword"));
		cpassw.sendKeys("12345678");

		
		driver.quit();
	}	

}
