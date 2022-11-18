package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OfulSignUp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging.oful.be/sign-up");
        driver.findElement(By.xpath("//input[@name = 'firstName' ]")).sendKeys("Jor");
        driver.findElement(By.xpath("//input[@name =  'lastName']")).sendKeys("Meliksetyan");
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("jor.meliksetyan6@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Jora1234568");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Jora1234568");
        driver.findElement(By.xpath("//input[@name = 'acceptTerms' ]")).click();
       driver.findElement(By.xpath("//button[@class = 'pointer']")).click();
       //(Es grancvelem arden karoxa chtoxi bayc ashxatuma)
    }
}

