package lesson1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class AutoTest {


    WebDriver driver ;

    public static void main(String[] args) throws InterruptedException {


        //@BeforeClass
      //  public void BeforeClass () {
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://www.youtube.com/");
            driver.manage().window().maximize(); // make big screen
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // }
       // @Test
       // public void Test () throws InterruptedException {

            WebElement searchButton = driver.findElement(By.xpath("//input[@id='search']"));
            searchButton.click();
            Thread.sleep(2000);
            searchButton.sendKeys("madonna hung up");

            WebElement searchClickButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
            searchClickButton.click();

            Thread.sleep(1000);
            WebElement SongPlay = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
            SongPlay.click();
        //   }

      //  @AfterClass
      //  public void AfterClass () throws InterruptedException {
            Thread.sleep(10000);
            driver.quit();
        }


        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));


    }


