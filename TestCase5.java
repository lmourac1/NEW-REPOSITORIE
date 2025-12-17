import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase5 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        boolean pagina = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
        System.out.println("A pagina esta visivelmente correta?" + pagina);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Signup / Login']"))).click();

        boolean login = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']")).isDisplayed();
        System.out.println("O login está aparecendo?" + login);

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Lucas Calil");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("l.mourac5@gmail.com");
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();

        boolean exist = driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']")).isDisplayed();
        System.out.println("erro O endereço de e-mail já existe! está visível?" + exist);









    }
}
