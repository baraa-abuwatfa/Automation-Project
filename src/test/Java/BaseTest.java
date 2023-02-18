import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BaseTest {
    public static ChromeDriver chromeDriver;
    public static WebDriverWait wait;

    @Test
    public ChromeDriver setUp(String s) {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 60);
        chromeDriver.get(chromeDriver.getCurrentUrl());
        return chromeDriver;

    }
}
