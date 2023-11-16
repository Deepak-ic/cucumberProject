package org.stepdefinition;

import org.bas.baseClass;
import org.pojo.FlipkartPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipkartCucumber extends baseClass{

	FlipkartPojo f;
	
	@Given("To open Microsoft edge browser and maximize the window")
	public void to_open_Microsoft_edge_browser_and_maximize_the_window() {
		launchBrowser();
		WindowsMaximazer();
	}

	@When("To launch the flipkart Url")
	public void to_launch_the_flipkart_Url() {
		launchUrl("https://www.flipkart.com/account/login?ret=/");
	}

	@When("pass the valid mobile number and do not click request opt button")
	public void pass_the_valid_mobile_number_and_do_not_click_request_opt_button() {
		f = new FlipkartPojo();
		passText("9488462164", f.getMobNo());
	}

	@When("To check whether the site open or not")
	public void to_check_whether_the_site_open_or_not() {
		System.out.println("To chech ur login mobile number");
	}
	
	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeBrowser();
	}

}
