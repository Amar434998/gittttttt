import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webtables {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get(
            "https://datatables.net/examples/core/basic_init/zero_configuration.html"
        );
Boolean found = false;
        while (!found) {

            // Find the table again on every page
            WebElement table = driver.findElement(By.tagName("table"));

            // Get table headers
            List<WebElement> heading =
                    table.findElements(By.tagName("th"));

            int pos = -1;
            int name = -1;

            // Find Position and Name column indexes
            for (int i = 0; i < heading.size(); i++) {

                String header = heading.get(i).getText().trim();

                if (header.equalsIgnoreCase("Position")) {
                    pos = i;
                }

                if (header.equalsIgnoreCase("Name")) {
                    name = i;
                }

                if (pos != -1 && name != -1) {
                    break;
                }
            }

            // Get all rows on current page
            List<WebElement> rows =
                    table.findElements(By.tagName("tr"));

            // Process all rows
            for (WebElement row : rows) {

                List<WebElement> cells =
                        row.findElements(By.tagName("td"));

           

                // Check Position
                if (cells.get(pos).getText().trim()
                        .equalsIgnoreCase("Software Engineer")) {

                    // Get Name
                    String employeeName =
                            cells.get(name).getText().trim();

                    System.out.println(employeeName);
                    found = true;
                    break;
                    
                }
            }

           

        }
     
    }
}
