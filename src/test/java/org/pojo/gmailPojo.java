package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gmailPojo {
	
	//Email field
    @FindBy(xpath = "//input[@id='identifierId']")
    private WebElement mailid;
    
    //Next Button
    @FindBy(xpath = "(//div[@class='VfPpkd-RLmnJb'])[2]")
    private WebElement nextBtn;
    
    //password field
    @FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
    private WebElement password;
    
    //Login Button
    @FindBy(xpath = "(//div[@class='VfPpkd-RLmnJb'])[2]")
    private WebElement login;
    
    public WebElement getMailid() {
		return mailid;    	
    }
    public WebElement getNxtBtn() {
    	return nextBtn;
    }
    public WebElement getpassword() {
    	return password;
    }
    public WebElement getLogin() {
    	return login;
    }
    
}
