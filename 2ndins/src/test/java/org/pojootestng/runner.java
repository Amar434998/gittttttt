package org.pojootestng;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base1.base1;
import data.data;

public class runner extends base1 {
	
	@BeforeClass
    public void setup() {
        openchrome();
        windowmax();
        url("https://adactinhotelapp.com/index.php");
        impli();
    
         }
	
	@Test(priority = 1)
    public void navigateToRegisterPage() {
    LoginPage lp = new LoginPage();
    click(lp.getRegisterLink());
    Assert.assertTrue(lp. getCurrentUrl().contains("Register.php"));
	}
	
    @Test(priority = 2)
    public void validRegistration() throws Exception {
        Register rp = new Register();

     input(rp.getUsename2(),data.readData(4,0));
     input(rp.getPassword2(),data.readData(4, 1));
   	 input(rp.getRepass(),data.readData(4, 2));
   	 input(rp.getFullName(),data.readData(4, 3));
   	 input(rp.getEmail(),data.readData(4, 4));
   	  Thread.sleep(15000);
   	  click(rp.getAcceptclick());
   	  click(rp.getSubmit());
   	  Assert.assertTrue(getCurrentUrl().contains("Login.php"));
    }
    
    @Test(priority = 3)
    public void emptyPswd() throws Exception {
        url("https://adactinhotelapp.com/Register.php");

        Register rp = new Register();

        input(rp.getUsename2(),data.readData(4,0));
        input(rp.getFullName(),data.readData(4, 3));
        input(rp.getEmail(),data.readData(4, 4));

        Thread.sleep(15000);
     	  click(rp.getAcceptclick());
     	  click(rp.getSubmit());

        String errorText = rp.getPasswordError().getText();
        System.out.println(errorText);
        Assert.assertTrue(errorText.contains("Password is Empty"));     
    }
        
    @Test(priority = 4)
    public void  fiveLetterPswd() throws Exception {

    	  url("https://adactinhotelapp.com/Register.php");

          Register rp = new Register();

          input(rp.getUsename2(),data.readData(4,0));
          input(rp.getPassword2(),data.readData(12, 1));
        	 input(rp.getRepass(),data.readData(12, 2));
          input(rp.getFullName(),data.readData(4, 3));
          input(rp.getEmail(),data.readData(4, 4));

          Thread.sleep(15000);
       	  click(rp.getAcceptclick());
       	  click(rp.getSubmit());
       	  String txt = rp.getPasswordError().getText();
       	  System.out.println(txt);
       	  Assert.assertTrue(txt.contains("Password must contain minimum 6 characters"));
    }

        
 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	
	
	
	
	
	
	}

