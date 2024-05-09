package trytestingthis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // Corrected import statement
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trytestingthis {
    
    public static void main(String[] args) throws InterruptedException {
        // Setup Firefox WebDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
     
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Now you can use 'driver' to interact with the Firefox browser
        // For example, navigate to a URL
        driver.get("https://trytestingthis.netlify.app/");
        
        
        driver.findElement(By.id("fname")).sendKeys("Somiya");
        Thread.sleep(2000);
        driver.findElement(By.id("lname")).sendKeys("Tasnim");
        Thread.sleep(2000);
        
        //radiobutton
        WebElement radiobutton = driver.findElement(By.id("female")); // Corrected WebElement declaration
        radiobutton.click();
        
        assert radiobutton.isSelected();
        System.out.println(radiobutton.isSelected());
        
		WebElement textDropDown = driver.findElement(By.id("option"));
		Select dropdown = new Select (textDropDown);
		dropdown.selectByVisibleText("Option 1");

        // Verify if Option 1 is selected
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        assert selectedOption.getText().equals("Option 1");
        System.out.println("Selected option: " + selectedOption.getText());
        Thread.sleep(2000);
        
     // Checkbox options
     // Find checkboxes by their name attribute
        WebElement option1Checkbox = driver.findElement(By.name("option1"));
        WebElement option2Checkbox = driver.findElement(By.name("option2"));
        WebElement option3Checkbox = driver.findElement(By.name("option3"));

        // Select any two checkboxes
        option1Checkbox.click(); // Select Option 1
        option3Checkbox.click(); // Select Option 3


        // Assert checkbox is checked
        assert option1Checkbox.isSelected() : "Checkbox is not checked";
        System.out.println("Checkbox is checked");
        Thread.sleep(2000);
     // Find the file input element by its ID
        WebElement fileInput = driver.findElement(By.id("myfile"));

        // Specify the file path you want to upload
        String filePath = "D:\\OneDrive\\Documents\\Pictures\\Screenshots\\Screenshot (1279).png"; // Update this with the actual file path on your system

        // Enter the file path into the file input element
        fileInput.sendKeys(filePath);
        

     // Assert that the value of the file input element matches the specified file path
        assert fileInput.getAttribute("value").equals(filePath) : "File path assertion failed";

        System.out.println("File path assertion passed successfully.");
        Thread.sleep(2000);
     // Find the button element by its class name
        WebElement submitButton = driver.findElement(By.className("btn-success"));

        // Click the button to open the new window/tab
        submitButton.click();

        Thread.sleep(2000);
        
        driver.quit();
    }
}
