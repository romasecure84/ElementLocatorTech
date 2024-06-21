import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNgClass {
    WebDriver driver;

    @BeforeTest
    public void prepare() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //driver.quit();
    }

    @Test(priority = 1)
    public void openWebsite() {
        System.out.println("Let's open the browser");
        driver.get("https://www.facebook.com");
    }

    @Test(priority = 2)
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
