package dropdon;
import base1.*;
import java.awt.print.PageFormat;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doDown extends base1{
	
	public doDown() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//select[@id ='country']/option")
	List<WebElement>  dirop;
	public List<WebElement> getDirop() {
		return dirop;
	}
	@FindBy(xpath ="//select[@id ='colors']/option")
	List<WebElement>  color;
	public List<WebElement> getColor() {
		return color;
	}
	@FindBy(xpath ="//select[@id='animals']/option")
	List<WebElement>  sort;
	public List<WebElement> getSort() {
		return sort;
	}
	@FindBy(id ="datepicker")
	private WebElement  date1;
	
	@FindBy(id ="txtDate")
	private WebElement  date2;
	public WebElement getDate1() {
		return date1;
	}

	public WebElement getDate2() {
		return date2;
	}
	
	@FindBy(id="date")
	private WebElement dat;
	public WebElement getDat() {
		return dat;
	}
	
	@FindBy(xpath="//input[@id='txtDate']")
	private WebElement selecttab;
	public WebElement getSelecttab() {
		return selecttab;
	}
	
	
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement selectmth;
	public WebElement getSelectmth() {
		return selectmth;
	}
	

	@FindBy(xpath="//select[@class='ui-datepicker-year']") // <<< FIX IS HERE
	private WebElement selectyr;
	public WebElement getSelectyr() {
		return selectyr;
	}
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-e']")
	private WebElement nxt;
	
	@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-w']")
	private WebElement previous;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//td/a")
	private List<WebElement> day;
	
	public WebElement getNxt() {
		return nxt;
	}

	public WebElement getPrevious() {
		return previous;
	}

	public List<WebElement> getDay() {
		return day;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
