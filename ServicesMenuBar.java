package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class ServicesMenuBar {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","F:\\Automation Testing Using Selenium+TestNG\\iCrew\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gooseberry-bpo.agiledot.us/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String mainWindow=driver.getWindowHandle();
        WebElement servicesMenu=driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[3]/button"));
        servicesMenu.click();
        Thread.sleep(1000);
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window); // নতুন উইন্ডোতে সুইচ করো
                break;
            }
        }

    }
    @Test(priority = 2)
    public void first() throws InterruptedException
    {
        WebElement First=driver.findElement(By.linkText("Front Office Management"));
        First.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void second() throws InterruptedException
    {
        WebElement Second=driver.findElement(By.linkText("IT & Technical Support"));
        Second.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void third() throws InterruptedException
    {
        WebElement Third=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/a[3]"));
        Third.click();
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
        System.out.println("Sucessfully Passes all the test cases");
    }
}
