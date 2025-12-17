import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase6 {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        boolean home = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
        System.out.println("Home page esta certa?" + home);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Contact us']"))).click();

        boolean help = driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']")).isDisplayed();
        System.out.println("Get help in touch está disponivel?" + help);

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Lucas");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("l.mourac5@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("erro na encomenda");
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("minha encomenda veio errada");

       // WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='upload_file']"))).click();

        driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys("C:\\Users\\lmour\\Desktop\\Automação.");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait1.until(ExpectedConditions.alertIsPresent());
        alert.accept();


        boolean success = driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed();
        System.out.println("Success está aparencendo?" + success);

        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

        boolean home1 = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
        System.out.println("Home está aparecendo?" + home1);







    }
}
