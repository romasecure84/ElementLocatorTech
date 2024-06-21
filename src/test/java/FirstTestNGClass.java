import org.testng.annotations.Test;

public class FirstTestNGClass {
    @Test
    public void openBrowser() {
        System.out.println("Let's open the browser");
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
