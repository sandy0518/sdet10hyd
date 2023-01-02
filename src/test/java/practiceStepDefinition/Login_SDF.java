package practiceStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_SDF {
	
	WebDriver driver;
	@Given("launch Browser")
	public void launch_browser() {
		//WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	}

	@Then("enter url")
	public void enter_url() {
		driver.manage().window().maximize();
	    driver.get("http://localhost:8888");
	}

	@Then("validate login page is displayed or not")
	public void validate_login_page_is_displayed_or_not() {
	    Assert.assertEquals(false, false);
	}

	@Then("enter username")
	public void enter_username() {
		 driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("enter password")
	public void enter_password() {
		 driver.findElement(By.name("user_password")).sendKeys("admin");
	}

	@Then("click on login button")
	public void click_on_login_button() {
		 driver.findElement(By.id("submitButton")).click();
	}

	@Then("validate home page is displayed or not")
	public void validate_home_page_is_displayed_or_not() {
		 Assert.assertEquals(false, false);
	}
	
	@Then("logout from the application")
	public void logout_from_the_application() {
	    WebElement adminImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions action=new Actions(driver);
	    action.moveToElement(adminImg).perform();
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
}
