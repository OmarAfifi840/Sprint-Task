package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {

    @Test

    public  void AddToCart () throws InterruptedException {

        System.out.println("Test Case 3 is running");
        DriverManager.startBrowser();
        DriverManager.open_browser();
        DriverManager.AddToCart();
        DriverManager.CartDetails();

    }

}
