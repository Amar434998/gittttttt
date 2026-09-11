package pojootestng;
import data.*;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.pojootestng.pojoclass;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import base1.base1;

public class runner extends base1{
	
	@BeforeClass
	private void start(){
		openchrome();;
		windowmax();
		impli();
		url("https://adactinhotelapp.com/");
		System.out.println("Browser lauched sucessfully");
}
@Test
private void test2() throws Exception {
	pojoclass s = new pojoclass();
	click(s.getRegisterform());
	input(s.getUsename2(), data.readData(4, 0));
	  input(s.getPassword2(),data.readData(4, 1));
	  input(s.getRepass(),data.readData(4, 2));
	  input(s.getFullName(),data.readData(4, 3));
	 input(s.getEmail(),data.readData(4, 4));
	  Thread.sleep(15000);
	  click(s.getAcceptclick());
	  click(s.getSubmit());
	
	  String currentUrl = driver.getCurrentUrl();
	  System.out.println("Current URL: " + currentUrl);
	  Assert.assertTrue(currentUrl.contains("Login"));



	 }



@Test

private void EmptyPassword() throws Exception {	
	pojoclass c = new pojoclass();
	click(c.getRegisterform());
	
	input(c.getUsename2(), data.readData(4, 0));
	//  input(c.getPassword2(),data.readData(8, 1));
	 // input(c.getRepass(),data.readData(0, 0));
	 input(c.getFullName(),data.readData(4, 3));
	 input(c.getEmail(),data.readData(4, 4));
	  Thread.sleep(15000);
	  click(c.getAcceptclick());
	  click(c.getSubmit());
	  Thread.sleep(3000);
	  String text = c.getPasswordError().getText();
	   System.out.println("Error Message: " + text);
	  Assert.assertTrue(text.contains("Password is Empty"));
}
@Test
private void fiveltrpass() throws Exception {	
	pojoclass h = new pojoclass();
	click(h.getRegisterform());
	
	input(h.getUsename2(), data.readData(4, 0));
	input(h.getPassword2(),data.readData(12, 1));
	input(h.getRepass(),data.readData(12, 2));
	 input(h.getFullName(),data.readData(4, 3));
	 input(h.getEmail(),data.readData(4, 4));
	  Thread.sleep(15000);
	  click(h.getAcceptclick());
	  click(h.getSubmit());
	

	
}

}
	

