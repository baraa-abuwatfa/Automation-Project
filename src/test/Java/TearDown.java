import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TearDown {
    @Test
    public void tearDown() {
        BaseTest.chromeDriver.quit();
    }

}
