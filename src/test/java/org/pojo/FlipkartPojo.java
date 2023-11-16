package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPojo {
	
	//mobile Number
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement mobNo;
	
	//request OTP button
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement reqBtn;

	public WebElement getMobNo() {
		return mobNo;
	}

	public WebElement getReqBtn() {
		return reqBtn;
	}

}
