package org.base11;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testpurpose {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void openchrome() {
		driver = new ChromeDriver();
	}

	public static void maxim() {
		driver.manage().window().maximize();
	}

	public static void implicite() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void urls(String ref) {
		driver.get(ref);
	}

	public static void input(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	public static void clcik(WebElement ref) {
		ref.click();
	}

	public static void mouseHover(WebElement element) { // mousehover - movetoelement
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public static void rightClick(WebElement element) { // mousehover - rightclick
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) { // mousehover - drag&drop
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	public static String parwindow() { // window switching for parent
		return driver.getWindowHandle();
	}

	public static void chikdwind(int index) { // window switching for child
		Set<String> ll = driver.getWindowHandles();
		List<String> lp = new ArrayList<String>(ll);
		lp.addAll(ll);
		driver.switchTo().window(lp.get(index));
	}

	public static void dropdownvisitxt(WebElement ref, String val) { // select dropdown by text.
		Select s = new Select(ref);
		s.selectByContainsVisibleText(val);
	}

	public static void dropdownindex(WebElement ref, int index) { // select dropdown by index.
		Select s = new Select(ref);
		s.selectByIndex(index);
	}

	public static void dropdowval(WebElement ref, String val) { // select dropdown by value.
		Select s = new Select(ref);
		s.selectByValue(val);
	}

	public static void screenShot(String val) throws IOException { // To Take Scrrenshots
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File newpath = new File(val);
		FileUtils.copyFile(temp, newpath);
	}

}
