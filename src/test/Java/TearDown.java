import org.testng.annotations.Test;

public class TearDown {
    @Test
    public void tearDown() {
        BaseTest.driver.quit();
    }

}
