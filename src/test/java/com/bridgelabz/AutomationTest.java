package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AutomationTest {
    static WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Login_Application() throws InterruptedException {
        driver.get("https://touch.facebook.com/?refsrc=https%3A%2F%2Ftouch.facebook.com%2F&_rdr");
        driver.findElement(By.id("m_login_email")).sendKeys("8412819692");
        driver.findElement(By.id("m_login_password")).sendKeys("tushar000");
        driver.findElement(By.xpath("//button[@name = 'login']")).click();
    }
}
