import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest {


    BaseTest baseTest = new BaseTest();
    ChromeDriver chromeDriver;

    @BeforeClass
    public void setUp() {
        chromeDriver = baseTest.setUp("https://www.worldmarket.com");
    }


    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        //*[@id="cpwm-additionaldisclaimer3"]/button
        //ازالة الاعلان الظاهر
        WebElement additionaldiscbutton = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        additionaldiscbutton.click();

       //البحث عن سكشن بالصفحة
        WebElement MainDiv = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-1']"));
        assertTrue(MainDiv.isDisplayed());
    }

    @Test (priority = 2)
    public void verifyThatFurniturelinkIsDisplayed() {
        WebElement Furniturelink = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        assertTrue(Furniturelink.isDisplayed());
    }
    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}