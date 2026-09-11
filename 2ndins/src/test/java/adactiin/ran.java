package adactiin;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base1.base1;
import data.data;

public class ran extends base1 {

	@BeforeClass
	public void setup() {
		openchrome();
		windowmax();
		url("https://adactinhotelapp.com/index.php");
		impli();

	}

	@Test
	public void test1() {
		adact lp = new adact();
		click(lp.getRegisterLink());
		Assert.assertTrue(lp.getCurrentUrl().contains("Register.php"));
	}

	@Test
	public void test2() throws Exception { // chk username eqals
		regi rp = new regi();
		input(rp.getUsename2(), data.readData(4, 1));
		input(rp.getPassword2(), data.readData(4, 2));
		String g = "datac1245";
		String excelname = data.readData(4, 1);
		Assert.assertEquals(g, excelname);
		quitt();
	}

	@Test(retryAnalyzer = faild.class)
	public void test3() throws Exception { // print username warning
		openchrome();
		url("https://adactinhotelapp.com/Register.php");
		regi rp = new regi();
		input(rp.getUsename2(), data.readData(14, 1));
		click(rp.getAcceptclick());
		click(rp.getSubmit());
		String f = rp.getTxtspan().getText();
		System.out.println(f);
		String sp = "Username must contain minimum 8 characters";
		Assert.assertEquals(f, sp);
		quitt();
	}

	@Test(retryAnalyzer = faild.class)

	public void test4() throws Exception {
		openchrome();
		url("https://adactinhotelapp.com/Register.php");
		regi rp = new regi();
		input(rp.getUsename2(), data.readData(12, 1));
		input(rp.getPassword2(), data.readData(14, 1));
		input(rp.getFullName(), data.readData(12, 4));
		input(rp.getEmail(), data.readData(14, 3));
		click(rp.getAcceptclick());
		click(rp.getSubmit());
		String errorText = rp.getPasswordError().getText();
		System.out.println(errorText);
		quitt();
	}

	@Test(retryAnalyzer = faild.class)
	public void test5() throws Exception { // email confirm
		openchrome();
		url("https://adactinhotelapp.com/Register.php");
		regi rp = new regi();
		input(rp.getEmail(), data.readData(14, 3));
		String s = rp.getEmailchk().getText();
		System.out.println(s);
		String ss = rp.getEmail().getAttribute("value");
		String t = "teating6576@gmail.com";
		Assert.assertTrue(ss.contains(t));

	}

	/*
	 * @Test(priority = 3) public void emptyPswd() throws Exception {
	 * url("https://adactinhotelapp.com/Register.php");
	 * 
	 * regi rp = new regi();
	 * 
	 * input(rp.getUsename2(),data.readData(4,0));
	 * input(rp.getFullName(),data.readData(4, 3));
	 * input(rp.getEmail(),data.readData(4, 4));
	 * 
	 * Thread.sleep(15000); click(rp.getAcceptclick()); click(rp.getSubmit());
	 * 
	 * String errorText = rp.getPasswordError().getText();
	 * System.out.println(errorText);
	 * 
	 * 
	 * 
	 * }
	 */
	/*
	 * @Ignore
	 * 
	 * @Test(priority = 4) public void fiveLetterPswd() throws Exception {
	 * 
	 * url("https://adactinhotelapp.com/Register.php");
	 * 
	 * regi rp = new regi();
	 * 
	 * input(rp.getUsename2(),data.readData(4,0));
	 * input(rp.getPassword2(),data.readData(12, 1));
	 * input(rp.getRepass(),data.readData(12, 2));
	 * input(rp.getFullName(),data.readData(4, 3));
	 * input(rp.getEmail(),data.readData(4, 4));
	 * 
	 * Thread.sleep(15000); click(rp.getAcceptclick()); click(rp.getSubmit());
	 * String txt = rp.getPasswordError().getText(); System.out.println(txt);
	 * Assert.assertTrue(txt.contains("Password must contain minimum 6 characters"))
	 * ; }
	 */

}
