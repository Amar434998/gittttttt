package suedocode;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base1.*;
import data.data;

public class runner1 extends base1 {
	@Ignore
	@Test(groups ="smoke",priority = 1)
	public void test1login() throws Exception {
		openchrome();
		windowmax();
		impli();
		url("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
		driver.quit();
	}
	
	@Test(groups ={"sanity","regression"})
	public void test2() throws Exception {
	openchrome();
    url("https://www.saucedemo.com/");
	    saucelogin f = new saucelogin();
	    input(f.getUserName(),data.readData(0, 0));
	    String h = f.getUserName().getAttribute("value");
	    String exp = "visual_user";
		input(f.getPswd(),data.readData(0, 1));
		screenShot("login.png");
		click(f.getLogin());
		
		Thread.sleep(4000);
	    click(f.getDogsauce());
	    screenShot("addtocart.png");
	    WebElement g = f.getPirint();
	    String dd = g.getText();
	    System.out.println(dd);
	    String ex = "carry.allTheThings() with the sleek";
	    Assert.assertTrue(dd.contains(ex));
	    click(f.getAddcart());
	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
		Assert.assertEquals(h,exp );
		driver.quit();
	}
	@Ignore
	@Test(groups ={"sanity"},priority = -1)
	public void test3() throws Exception {
		openchrome();
		windowmax();
	    url("https://www.saucedemo.com/");
		saucelogin f = new saucelogin();
		
		    input(f.getUserName(),data.readData(0, 0));
			input(f.getPswd(),data.readData(0, 1));
			click(f.getLogin());
			Thread.sleep(4000);
		    click(f.getDogsauce());
		    click(f.getAddcart());
		    click(f.getClcikcrt());
		    click(f.getChkout());
		input(f.getfName(),data.readData(2, 0));
		input(f.getlName(),data.readData(3, 0));
		input(f.getCode(),data.readData(4, 0));
		String pin = f.getCode().getAttribute("value");
		String EXP = "612103";
		Assert.assertEquals(pin, EXP);
		click(f.getCtn());
		click(f.getFinish());
		String out = f.getPrintt().getText();
		System.out.println("Finaloutput is:" +out);	
		Assert.assertTrue(f.getCurrentUrl().contains("complete"));
		
		
	}

	
	
}
