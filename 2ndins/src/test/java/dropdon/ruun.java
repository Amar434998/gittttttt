package dropdon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base1.base1;
import data.data;

public class ruun extends base1 {
	
	@Test
	private void testt1() throws Exception {
		openchrome();
		windowmax();
		url("https://testautomationpractice.blogspot.com/");
		doDown d = new doDown();
		
	
		selectByIndex(d.getDirop(), 7);
		selectByIndex(d.getColor(), 1);
		selectByIndex(d.getColor(), 2);
		selectByIndex(d.getSort(), 1);// index starts from 0
   
     click(d.getSelecttab());
     
     
     selectDates(d.getSelectmth(),
    		 d.getSelectyr(),d.getNxt(),d.getPrevious(),
    		 (By) d.getDay(), "December", "2024",15);
    		 
    	       
    	
		Thread.sleep(4000);


		}

		
	
	

}
