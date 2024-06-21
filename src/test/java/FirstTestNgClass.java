import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgClass {

    WebDriver driver;

    @BeforeTest
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void openWebsite() {
        System.out.println("Let's open the browser");
        driver.get("https://www.google.com");
    }

    @Test
    public void signUp() {
        System.out.println("Signing up");
    }

    @Test
    public void login() {
        System.out.println("Logging in");
    }

    @Test
    public void addToCard() {
        System.out.println("Add items to cart");
    }

    @Test
    public void logOut() {
        System.out.println("Logging out");
    }

    @Test
    public void closeBrowser() {
        System.out.println("Closing Browser");
    }
}
