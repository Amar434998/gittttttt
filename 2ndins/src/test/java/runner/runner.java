package runner;
import base1.*;
import data.data;
import pojoo.firstpagepojo;

public class runner  extends base1{
	public static void main(String[] args) throws Exception {
		openchrome();
		impli();
		windowmax();
		url("https://demo.automationtesting.in/Register.html");
		firstpagepojo f = new firstpagepojo();
		
	    click(f.getPracticeSite());
	    click(f.getMyAccunt());
	String user1= data.readData(1,0);
	String passW = data.readData(1, 2);
	
	input(f.getUserName(), user1);
	input(f.getPswd(), passW);
    click(f.getLogin());
	
	
	}
}