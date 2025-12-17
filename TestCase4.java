import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase4 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        boolean titulo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
        System.out.println("O titulo esta disponivel?" + titulo);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Signup / Login']"))).click();

        boolean login = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']")).isDisplayed();
        System.out.println("O titulo de login aparece?" + login);

        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("l.mourac5@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("lucasloko");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        boolean usuario = driver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed();
        System.out.println("Nome do usuario esta visivel?" + usuario);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']"))).click();

        boolean exit = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']")).isDisplayed();
        System.out.println("O usuario foi redirecionado para pagina de login?" + exit);


        // driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();








    }
}
