package StepDefinaiton;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import OHRM.Loginohrm;
import io.cucumber.java.en.*;


public class OHRmlogin {
	public WebDriver driver;
	public Loginohrm ln;
	

	
	@Given("User launch browser")
	public void user_launch_browser() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		ln= new Loginohrm(driver);
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	   driver.get(string);
	}

	@Then("User Enter Uname as {string} and password as {string}")
	public void user_enter_uname_as_and_password_as(String Uname, String password) throws InterruptedException {
	    ln.enterUname(Uname);
	    ln.Enterpwd(password);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    ln.Login();
	}

	@When("click on image")
	public void click_on_image() throws InterruptedException {
		String actual= driver.getCurrentUrl();
		String Excepted="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		assertEquals(actual, Excepted,"Login successfull.....");
		Thread.sleep(1000);
				ln.Stestingbtn();
	   	}

	@Then("click logout btn")
	public void click_logout_btn() throws InterruptedException {
		ln.logout();
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	    
	}

}

