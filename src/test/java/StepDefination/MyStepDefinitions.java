package StepDefination;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	WebDriver driver;
	@Given("^User is on login page \"([^\"]*)\"$")
    public void user_is_on_login_page_something(String strArg1) throws Throwable {
      /*System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get(strArg1);*/
		System.out.println(strArg1);
    }
	@When("^user login into application with$")
	public void user_login_into_application_with(DataTable arg1) throws Throwable {
		List<List<String>> obj= arg1.raw();
        
        /*driver.findElement(By.cssSelector("input[id='username']")).sendKeys(obj.get(0).get(0));
	driver.findElement(By.cssSelector("input[id='password']")).sendKeys(obj.get(0).get(1));
*/
		System.out.println(obj.get(0).get(1));
	}
	

	    @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("validate the browser");
	    }

	    @When("^Browser the triggers$")
	    public void browser_the_triggers() throws Throwable {
	     System.out.println("browser is trigger");
	    }

	    @Then("^click if browser is open$")
	    public void click_if_browser_is_open() throws Throwable {
	        System.out.println("click if browser is open");
	    }

	
	
	
	
	
	
	 

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	//driver.findElement(By.cssSelector("input[id='Login']")).click();
    	System.out.println("Login");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("login page");
    	//driver.close();
    }

}