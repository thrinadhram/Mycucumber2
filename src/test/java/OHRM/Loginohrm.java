package OHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginohrm{
	public WebDriver driver;
	public Loginohrm(WebDriver rd) {
		driver = rd;
		PageFactory.initElements(rd,this);
	}
	@FindBy(name ="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement Pwd;
	
	@FindBy(xpath ="//button[@type='submit']")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")
	@CacheLookup
	WebElement Stestingbtn;
	
	@FindBy(linkText ="Logout" )
	@CacheLookup
	WebElement logout;
	
	public void enterUname(String Uname) throws InterruptedException{
		Thread.sleep(1000);
		username.clear();
		username.sendKeys(Uname);
	}
	public void Enterpwd(String Password) throws InterruptedException {
		Thread.sleep(1000);
		Pwd.clear();
		Pwd.sendKeys(Password);	
	}
	public void Login() {
		Login.click();
	}
	public void Stestingbtn() throws InterruptedException {
		Thread.sleep(1000);
		Stestingbtn.click();
	}
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		logout.click();
	}

}
