package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps 
{
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    System.out.println("User is on NetBanking landing page");
	   
	}
	
//	@When("User login into application with {string} and {string}")
//	public void user_login_into_application_with_and(String usr, String pwd) {
//		System.out.println(usr+ " : user , password : " +pwd);
//	}
	
	@When("^User login into application with (.+) and (.+)$")
	public void user_login_into_application_with_and(String usr, String pwd) {
		System.out.println(usr+ " : user , password : " +pwd);
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() 
	{
		System.out.println("User is on Practice landing page");
		Assert.assertTrue(false);
	   
	}
	@When("User signup into application")
	public void user_signup_into_application(List<String> data) 
	{
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	    
	}
	
	@Given("Setup the entries in database")
	public void setup()
	{
		System.out.println("****************************");
		System.out.println("Setup the entries in database");
	}
	@When("Launch the browser from config variables")
	public void launchBrowser()
	{
		System.out.println("Launch the browser from config variables");
	}
	@When("Hit the home page url of banking site")
	public void hitUrl()
	{
		System.out.println("Hit the home page url of banking site");
	}



}
