package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfulSignIn {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging.oful.be/sign-in");
        driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("jor.meliksetyan6@gmail.com");
        driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("Jora1234568");
        driver.findElement(By.xpath("//button[@class = 'pointer']")).click();
    }
}
