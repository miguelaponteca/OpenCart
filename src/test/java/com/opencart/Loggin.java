package com.opencart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Loggin {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webchromedriver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Testname1");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Testlast");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("test1237@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("3427462544");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Test123");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Test123");
        driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
    }

    @After
    public void close() {
        //driver.close();
    }
}
