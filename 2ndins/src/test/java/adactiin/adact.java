package adactiin;
import base1.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base1.base1;

public class adact extends base1{
	public adact() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath = "//a[text()='New User Register Here']")
	    private WebElement registerLink;

	    public WebElement getRegisterLink() {
	        return registerLink;
	    }
	
	
	
	
	
	
	
	
	
}