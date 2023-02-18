import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OpenFearniturePageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver chromeDriver;

    @BeforeClass
    public void setUp() {
        baseTest.setUp("https://www.worldmarket.com/category/furniture/all.do");
    }

    @Test(priority = 1)
    public void verifyThaDeleteadditionaldisc() {
        //*[@id="cpwm-additionaldisclaimer3"]/button
        //ازالة الاعلان الظاهر
        WebElement additionaldiscbutton = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        additionaldiscbutton.click();
    }

    @Test (priority = 2)
    public void verifyThatFurniturelinkIsDisplayed() {
        WebElement Furniturelink = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        assertTrue(Furniturelink.isDisplayed());
    }
    @Test (priority = 3)
    public void verifyThatClickOnFurniturelink() {
        WebElement Furniturelink = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        Furniturelink.click();
    }
    @Test(priority = 4)
    public void verifyThatClickOnShopAllFurniturelinkInTheList() {
        WebElement ShopAllFurniturelink = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-sub']/li[1]/ul/li[2]/a"));
        assertTrue(ShopAllFurniturelink.isDisplayed());
        ShopAllFurniturelink.click();

    }



//h1[@class='wm-header']
    @Test(priority = 5)
    public void verifyThatShopAllFurniturePageIsDisplayed(){
    WebElement ShopAllFurnitureText = BaseTest.chromeDriver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/h1]"));
    assertTrue(ShopAllFurnitureText.isDisplayed());
    }
    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}