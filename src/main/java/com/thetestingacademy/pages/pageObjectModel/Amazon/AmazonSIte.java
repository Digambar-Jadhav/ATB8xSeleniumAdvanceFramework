package SeleniumPracticeProject.SeleniumProjectTask001_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AmazonSIte {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--Start-Maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        //driver.manage().window().maximize();
        WebElement Element_Search = driver.findElement(By.id("twotabsearchtextbox"));
        String a = driver.getTitle    ();
        Element_Search.sendKeys("I Phone 16 Pro");
        Element_Search.submit();
        System.out.println(a);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Thread.sleep(3000);
        driver.quit();

    }
}
