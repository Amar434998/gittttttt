package suedocode;
import base1.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucelogin extends base1{
	public saucelogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement userName;
	
 public WebElement getUserName() {
		return userName;
	}
 @FindBy(id ="password")
 private WebElement pswd;
 

public WebElement getPswd() {
	return pswd;
}

@FindBy(id ="login-button")
 private WebElement login;

public WebElement getLogin() {
	return login;
}
@FindBy(xpath ="//div[text()='Sauce Labs Backpack']")
private WebElement dogsauce;

public WebElement getDogsauce() {
	return dogsauce;
}
@FindBy(name= "add-to-cart")
private WebElement addcart;

public WebElement getAddcart() {
	return addcart;
}
@FindBy(xpath ="(//div[@class='inventory_details_price']")
private WebElement dollarchk;

public WebElement getDollarchk() {
	return dollarchk;
	
}

@FindBy(xpath="//div[contains(text(),'uncompromising')]")
private WebElement pirint;


public WebElement getPirint() {
	return pirint;
}

@FindBy(xpath="//span[@class='shopping_cart_badge']")
private WebElement clcikcrt;

@FindBy(id= "checkout")
private WebElement chkout;

public WebElement getClcikcrt() {
	return clcikcrt;
}

public WebElement getChkout() {
	return chkout;
}


@FindBy(id ="first-name")
private WebElement fName;
@FindBy(id ="last-name")
private WebElement lName;
@FindBy(id ="postal-code")
private WebElement code;

public WebElement getfName() {
	return fName;
}

public WebElement getlName() {
	return lName;
}

public WebElement getCode() {
	return code;
}
@FindBy(id ="continue")
private WebElement ctn;
@FindBy(id ="finish")
private WebElement finish;
@FindBy(xpath ="//h2[@class='complete-header']")
private WebElement printt;

public WebElement getCtn() {
	return ctn;
}

public WebElement getFinish() {
	return finish;
}

public WebElement getPrintt() {
	return printt;
}

		























	
}