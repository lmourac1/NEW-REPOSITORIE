import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase7 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");

        boolean home = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
        System.out.println("Home page esta certa?" + home);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Test Cases')]"))).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));

        boolean visivel = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[normalize-space()='Test Cases']")
                )
        ).isDisplayed();
        System.out.println("Pagina de test case está visivel? " + visivel);




    }
}
