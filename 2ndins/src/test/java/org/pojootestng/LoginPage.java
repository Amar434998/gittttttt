package org.pojootestng;

import base1.base1;
	

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	

	public class LoginPage extends base1 {

	    public LoginPage() {
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[text()='New User Register Here']")
	    private WebElement registerLink;

	    public WebElement getRegisterLink() {
	        return registerLink;
	    }
	}



