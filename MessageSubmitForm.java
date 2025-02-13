package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MessageSubmitForm {
    WebDriver driver;
    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","F:\\Automation Testing Using Selenium+TestNG\\iCrew\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gooseberry-bpo.agiledot.us/contact");
    }

    @Test(priority = 1)
    public void validTestData() throws InterruptedException
    {
        WebElement name=driver.findElement(By.id("businessName"));
        name.sendKeys("Elias Khan");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("mdeliaskhan1918004@gmail.com");
        WebElement ContactNumber=driver.findElement(By.id("number"));
        ContactNumber.sendKeys("+8801781678998");
        WebElement Message=driver.findElement(By.id("message"));
        Message.sendKeys("Nice Work");
        WebElement Button=driver.findElement(By.xpath("//*[@type='submit']"));
        Button.click();
        Thread.sleep(5000);
    }
    @AfterClass
    public void teardown()
    {
        driver.quit();
        System.out.println("Sucessfully Passes all the test cases");
    }
}
