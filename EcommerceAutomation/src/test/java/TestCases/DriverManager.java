// File: DriverManager.java
package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class DriverManager {
    public static WebDriver driver;

    public static void startBrowser() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
        driver.manage().window().maximize();
    }

    public  static void open_browser() throws InterruptedException {
        Thread.sleep(3000);
        WebElement Search = driver.findElement(By.id("search"));
        Search.sendKeys("Hoodie");
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.cssSelector("#search_mini_form > div.actions > button"));
        button.click();
    }



    public static void AddToCart () throws InterruptedException {

        Thread.sleep(3000);
        WebElement Product1 = driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div.search.results > div.products.wrapper.grid.products-grid > ol > li:nth-child(3) > div > a > span > span > img"));
        Product1.click();
        Thread.sleep(2000);
        WebElement Size = driver.findElement(By.id("option-label-size-143-item-167"));
        Size.click();
        WebElement Color = driver.findElement(By.id("option-label-color-93-item-50"));
        Color.click();
        WebElement Add = driver.findElement(By.cssSelector("#product-addtocart-button > span"));
        Add.click();
        Thread.sleep(5000);

    }

    public static void CartDetails () throws InterruptedException {
        Thread.sleep(3000);
        WebElement Cart = driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a > span.counter.qty"));
        Cart.click();
        WebElement Proceed = driver.findElement(By.cssSelector("#top-cart-btn-checkout"));
        Proceed.click();
    }
}
