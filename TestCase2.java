import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase2 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        if (driver.getTitle().contains("Automation Exercise")) {
            System.out.println("Página carregada com sucesso");
        } else {
            System.out.println("Página NÃO carregou");
        }


        //driver.findElement(By.xpath("//font[contains(text(),'Cadastre-se / Faça login')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//header[@id='header']//li[4]")
        )).click();


        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("l.mourac5@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("lucasloko");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        boolean loggin = driver.findElement(By.xpath("//header[@id='header']//li[1]")).isDisplayed();
        System.out.println("Conectado com o nome do usuario?" + loggin);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//header[@id='header']//li[5]"))).click();

        //driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

        boolean deleted = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
        System.out.println("Conta deletada?" + deleted);

    }
}
