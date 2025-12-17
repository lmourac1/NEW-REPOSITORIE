import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class testCase {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        if (driver.getTitle().contains("Automation Exercise")) {
            System.out.println("Página carregada com sucesso");
        } else {
            System.out.println("Página NÃO carregou");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='/login']")
        )).click();

        boolean visivel = driver.findElement(
                By.xpath("//h2[normalize-space()='New User Signup!']")
        ).isDisplayed();

        System.out.println("Menu Produtos visível? " + visivel);

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Lucas Moura Calil");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("l.mourac6@gmail.com");
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();

        boolean contem = driver.findElement(By.xpath("//body/section[@id='form']/div[@class='container']/div[@class='row']/div[@class='col-sm-4 col-sm-offset-1']/div[@class='login-form']/h2[1]")).isDisplayed();
        System.out.println("está visivel?" + contem);

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("lucasloko");
        driver.findElement(By.id("days")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[normalize-space()='1']"))).click();
        driver.findElement(By.id("months")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[normalize-space()='March']"))).click();
        driver.findElement(By.id("years")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value='2021']"))).click();

        WebElement checkbox = driver.findElement(By.id("newsletter"));
        if (!checkbox.isSelected()){
            checkbox.click();
        }

        WebElement checkbox1 = driver.findElement(By.id("optin"));
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Lucas");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Calil");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Double Well");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Rua copacabana 610");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Rua copacabana 510");
        driver.findElement(By.id("country")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value='United States']"))).click();
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("São Paulo");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("São Paulo");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("02461-000");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("11 - 976045559");
        driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();

        boolean created = driver.findElement(By.xpath("//b[normalize-space()='Account Created!']")).isDisplayed();
        System.out.println("Foi criada?" + created);

        driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();

        boolean loggin = driver.findElement(By.xpath("//header[@id='header']//li[1]//a[1]")).isDisplayed();
        System.out.println("Foi criada?" + loggin);


    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Delete Account']"))).click();

    boolean deleted = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
    System.out.println("Foi deletada?" + deleted);





    }
}
    