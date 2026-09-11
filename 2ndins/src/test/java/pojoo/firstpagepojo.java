package pojoo;
import base1.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firstpagepojo extends base1 {
	public firstpagepojo(){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath ="//a[text()='Practice Site']")
private WebElement practiceSite;


public WebElement getPracticeSite() {
	return practiceSite;
}
@FindBy(xpath ="//a[text()='My Account']")
private WebElement MyAccunt;


public WebElement getMyAccunt() {
	return MyAccunt;
}
@FindBy(id ="username")
private WebElement username;
	
public WebElement getUserName() {
	return username;
}


@FindBy(id ="password")
private WebElement pswd;
	
public WebElement getPswd() {
	return pswd;
}
@FindBy(name ="login")
private WebElement login;


public WebElement getLogin() {
	return login;
}

}

