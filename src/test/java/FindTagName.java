import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindTagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        System.out.println(tableRows.size());
        for (int i = 0; i < 5; i++){
            System.out.println(tableRows.get(i).getText());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
