package base1;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class  base1 {
public static WebDriver driver;
public static JavascriptExecutor js;

public static void openchrome() {
	driver= new ChromeDriver();
}
public static void windowmax() {
	driver.manage().window().maximize();
}
public static void url(String url) {
	driver.get(url);
}
public String getCurrentUrl() {
    return driver.getCurrentUrl();
}

public static void impli() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

public static void input(WebElement ref ,String value) {
ref.sendKeys(value);	
}

public static void click(WebElement ref) {
ref.click();	
}
public static void mouse(WebElement ref) {
	Actions act = new Actions(driver);
	act.moveToElement(ref).perform();
	
}

public static void printText(WebElement ref) {
	System.out.println(ref.getText());
}

public static void printInputValue(WebElement ref ) {
    System.out.println(ref.getAttribute("value"));
}
public static void screenShot(String name) throws IOException { // To Take Scrrenshots
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File newpath = new File("C:\\Users\\amar4\\eclipse-workspace\\2ndins\\photo/"+name+"r.png");
	FileUtils.copyFile(temp, newpath);
}

public static void selectDOB(WebElement dob,
        String month,
        String year,
        String day) {

dob.click();

Select m = new Select(
driver.findElement(By.className("react-datepicker__month-select")));
m.selectByVisibleText(month);

Select y = new Select(
driver.findElement(By.className("react-datepicker__year-select")));
y.selectByVisibleText(year);

driver.findElement(By.xpath(
"//div[contains(@class,'react-datepicker__day') and text()='" + day + "']"))
.click();
}




public void selectDate(String day, String month, String year) {

    driver.findElement(By.id("dateOfBirthInput")).click();

    Select m = new Select(
        driver.findElement(By.className("react-datepicker__month-select")));
    m.selectByVisibleText(month);

    Select y = new Select(
        driver.findElement(By.className("react-datepicker__year-select")));
    y.selectByVisibleText(year);

    driver.findElement(By.xpath(
        "//div[contains(@class,'react-datepicker__day') " +
        "and not(contains(@class,'outside-month')) " +
        "and text()='" + day + "']"
    )).click();
}



public static void quitt() {
	driver.quit();
}

public void inputAndEnter(WebElement ref, String value) {
    ref.sendKeys(value);
    ref.sendKeys(Keys.ENTER);
}

public void robotType(String text) throws Exception {

    Robot r = new Robot();
    for (char c : text.toUpperCase().toCharArray()) {
        int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
        r.keyPress(keyCode);
        r.keyRelease(keyCode);
        Thread.sleep(200);
    }

    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
}





public void selectByIndex(List<WebElement> options, int index) {
    options.get(index).click();
}



public static void selectDropdownByIndex(List<WebElement> dropList, int index) {
	if (index >= 0 && index < dropList.size()) {
        WebElement click= dropList.get(index);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", click);
        System.out.println(" index num: "+ index);
}
}
public static void selectByIndex(WebElement dropdown, int index) {
    Select s = new Select(dropdown);
    s.selectByIndex(index);
}

public static void selectByIndex2(WebElement element, int... indexes) {
    Select s = new Select(element);
    for (int i : indexes) {
        s.selectByIndex(i);
    }
}
public static void selectDates(
        WebElement monthDropdown,
        WebElement yearDropdown,
        WebElement nextBtn,
        WebElement prevBtn,
        By list,
        String expMonth,
        String expYear,
        int i) {

    	Select monthSelect = new Select(monthDropdown);
        Select yearSelect = new Select(yearDropdown);

        // Loop until correct month & year
        while (true) {

        	String currentMonth = monthSelect.getFirstSelectedOption().getText();
            String currentYear = yearSelect.getFirstSelectedOption().getText();

            // *** FIX IMPLEMENTED HERE ***
            // Before parsing, check if the string is empty or null.
            if (currentYear == null || currentYear.isEmpty() || expYear == null || expYear.isEmpty()) {
                System.err.println("Year value is empty! Cannot perform comparison.");
                // Break or throw an exception to prevent the NumberFormatException
                break; 
            }
            // *** END FIX ***
            
            if (currentMonth.equals(expMonth) && currentYear.equals(expYear)) {
                break;
            }

            // Compare years (Now it's safe to parse)
            if (Integer.parseInt(currentYear) < Integer.parseInt(expYear)) {
                nextBtn.click();
            } else if (Integer.parseInt(currentYear) > Integer.parseInt(expYear)) {
                prevBtn.click();
            }
            base1.waitForElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
            
            // 2. FIND THE DATES *AFTER* NAVIGATION (ENSURES FRESH LIST)
            List<WebElement> allDates1 = driver.findElements(list);
            
            // 3. Loop and Click (with JavaScript fallback for reliability)
            String expDay = String.valueOf(i);
            
            for (WebElement date : allDates1) {
                if (date.getText().trim().equals(expDay)) { 
                    try {
                        date.click(); 
                    } catch (Exception e) {
                        js = (JavascriptExecutor) driver;
                        js.executeScript("arguments[0].click();", date);
                    }
                    break;
                }
        }
}
}
private static void waitForElement(By xpath) {
	// TODO Auto-generated method stub
	
}
}









	
	




	





































