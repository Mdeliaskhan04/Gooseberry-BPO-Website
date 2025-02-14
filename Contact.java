package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Contact {
    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","F:\\Automation Testing Using Selenium+TestNG\\iCrew\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gooseberry-bpo.agiledot.us/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 5)
    public void email() throws InterruptedException
    {
        WebElement Email=driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[3]/ul/li[1]/a"));
        Email.click();
        System.out.println("Sucessfully Passes all the test cases");
    }
    @Test(priority = 2)
    public void facebook()
    {
     WebElement Facebook=driver.findElement(By.cssSelector("div.mt-4:nth-child(2) > a:nth-child(1) > svg:nth-child(1) > path:nth-child(1)"));
     Facebook.click();
     System.out.println("Sucessfully Passes all the test cases");
    }
    @Test(priority = 3)
    public void linkdin()
    {
        WebElement Linkdin=driver.findElement(By.cssSelector("div.mt-4:nth-child(2) > a:nth-child(2) > svg:nth-child(1)"));
        Linkdin.click();
        System.out.println("Sucessfully Passes all the test cases");
    }
    @Test(priority = 4)
    public void twitter()
    {
        WebElement Twitter=driver.findElement(By.cssSelector("div.mt-4:nth-child(2) > a:nth-child(3) > svg:nth-child(1)"));
        Twitter.click();
        System.out.println("Sucessfully Passes all the test cases");
    }
    @Test(priority = 1)
    public void instra()
    {
        WebElement Instragram=driver.findElement(By.cssSelector("div.mt-4:nth-child(2) > a:nth-child(4) > svg:nth-child(1)"));
        Instragram.click();
        System.out.println("Sucessfully Passes all the test cases");
    }
    @AfterClass
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(1500);
        driver.quit();
        System.out.println("Sucessfully Passes all the test cases");
    }
}
