package org.stepdefinition;

import org.bas.baseClass;
import org.pojo.gmailPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gamilCucumber extends baseClass {

	gmailPojo g;

	@Given("user launch the bowser and maximize the window")
	public void user_launch_the_bowser_and_maximize_the_window() {
		launchBrowser();
		WindowsMaximazer();
	}

	@When("user launch the gamil Url")
	public void user_launch_the_gamil_Url() {
		launchUrl(
				"https://accounts.google.com/");
	}

	@When("user pass vaild mail id to email <{string}> field and click next button")
	public void user_pass_vaild_mail_id_to_email_field_and_click_next_button(String mail) {
		g = new gmailPojo();
		passText(mail, g.getMailid());
		clckBtn(g.getNxtBtn());
	}

	@When("user pass vaild password to the password <{string}> field and click login button")
	public void user_pass_vaild_password_to_the_password_field_and_click_login_button(String pass) {
		g = new gmailPojo();
		passText(pass, g.getpassword());
		clckBtn(g.getLogin());
	}

	@Then("user close the entire browser")
	public void user_close_the_entire_browser() {
		closeBrowser();
	}
}
