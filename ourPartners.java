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

public class ourPartners {
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

    @Test(priority = 3)
    public void iCrew()
    {
        WebElement firstLink=driver.findElement(By.xpath("/html/body/main/div[2]/div/div[4]/div/a[1]/img"));
        firstLink.click();
    }

    @Test(priority = 2)
    public void gooseberryInnovation()
    {
        WebElement SecondLink=driver.findElement(By.cssSelector(".flex-wrap > a:nth-child(2) > img:nth-child(1)"));
        SecondLink.click();
    }

    @Test(priority = 1)
    public void agileDot()
    {
        WebElement thirdLink=driver.findElement(By.xpath("/html/body/main/div[2]/div/div[4]/div/a[3]/img"));
        thirdLink.click();
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
        System.out.println("Sucessfully Passes all the test cases");
    }
}
