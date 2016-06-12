package csd.chennai;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps extends TestCase {
	private WebDriver driver;
	private String baseUrl;

@Given("^user open \"([^\"]*)\" browser$")
public void user_open_browser(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	driver = new FirefoxDriver();
}

@Given("^open \"([^\"]*)\" in brower$")
public void open_in_brower(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	if(arg1.equals("Google"))
	{
		baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
	}
}

@Given("^enter \"([^\"]*)\" in search box$")
public void enter_in_search_box(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	driver.findElement(By.id("lst-ib")).clear();
	driver.findElement(By.id("lst-ib")).sendKeys(arg1);
}

@When("^click on submit$")
public void click_on_submit() throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	driver.findElement(By.name("btnK")).submit();
}

@Then("^result should more than (\\d+)$")
public void result_should_more_than(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	String result = driver.findElement(By.id("resultStats")).getAttribute("text");
	assertEquals(arg1, Integer.parseInt(result));
}




}
