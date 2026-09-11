package org.pojootestng;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base1.base1;

public class  Register extends base1{
	
	public Register(){
		PageFactory.initElements( driver,this);
	}
	@FindBy(id="username")
	private WebElement usename2;
	public WebElement getUsename2() {
		return usename2;
	}
	@FindBy(id ="password")
	private WebElement password2;
	public WebElement getPassword2() {
		return password2;
	}
	@FindBy(id ="re_password")
	private WebElement repass;
	public WebElement getRepass() {
		return repass;
	}
	@FindBy(id ="full_name")
	private WebElement fullName;
	public WebElement getFullName() {
		return fullName;
	}
	@FindBy( id = "email_add")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id ="tnc_box")
	private WebElement acceptclick;
	public WebElement getAcceptclick() {
		return acceptclick;
	}
	@FindBy(id ="Submit")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id = "password_span")
	private WebElement passwordError;

	public WebElement getPasswordError() {
	    return passwordError;
	}

	
}


	

	
	


