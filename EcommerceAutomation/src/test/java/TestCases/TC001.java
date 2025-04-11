package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {


    @Test

public void open_browser() throws InterruptedException {
        System.out.println("Test Case 1 is running");
        DriverManager.startBrowser();
        DriverManager.open_browser();

        }

}
