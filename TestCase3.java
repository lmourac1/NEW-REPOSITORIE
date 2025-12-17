import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase3 {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        if (driver.getTitle().contains("Automation Exercise")) {
            System.out.println("Página carregada com sucesso");
        } else {
            System.out.println("Página NÃO carregou");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Signup / Login']"))).click();

        boolean loggin = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']")).isDisplayed();
        System.out.println("A frase Login to your account aparece?" + loggin);

        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("l.mourac6@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("lucasloko");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        boolean incorrect = driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).isDisplayed();
        System.out.println("A frase Your email or password is incorrect aparece?" + incorrect);






    }

}
