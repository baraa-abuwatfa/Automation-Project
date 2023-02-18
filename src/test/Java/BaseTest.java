import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BaseTest {
    public static ChromeDriver driver;
    public static WebDriverWait wait;

    @Test
    public ChromeDriver setUp(String s) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 60);
        driver.get(driver.getCurrentUrl());
        return driver;

    }
}
