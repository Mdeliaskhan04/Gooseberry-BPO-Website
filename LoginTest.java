package tests;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","F:\\Automation Testing Using Selenium+TestNG\\iCrew\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void Homepage() throws InterruptedException
    {
        driver.get("https://gooseberry-bpo.agiledot.us/");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        assert title.contains("Gooseberry BPO");
        System.out.println("The test cases has been passed");
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void Contact() throws InterruptedException
    {
        WebElement two=driver.findElement(By.linkText("Contact"));
        two.click();
        System.out.println("The test cases has been passed");
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void AboutUs() throws InterruptedException
    {
        WebElement three=driver.findElement(By.linkText("About us"));
        three.click();
        System.out.println("The test cases has been passed");
        Thread.sleep(1000);
    }

    @AfterClass
    public void teardown() throws InterruptedException
    {
        driver.quit();
        System.out.println("Browser closed after 5 seconds");
    }

}
