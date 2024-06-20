import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Gulfstream G800");
        driver.findElement(By.cssSelector(".FPdoLc [value='Поиск в Google']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
