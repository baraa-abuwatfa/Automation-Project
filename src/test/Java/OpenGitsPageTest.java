import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OpenGitsPageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver chromeDriver;

    @BeforeClass
    public void setUp() {
        baseTest.setUp("https://www.worldmarket.com/category/gifts/all.do");
    }


    @Test (priority = 1)
    public void verifyThatGiftslinkIsDisplayed() {
        WebElement Giftslink = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-gifts-1']"));
        assertTrue(Giftslink.isDisplayed());
    }
    @Test (priority = 2)
    public void verifyThatClickOnGiftslink() {
        WebElement Giftslink= BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-gifts-1']"));
        Giftslink.click();
    }
    @Test(priority = 3)
    public void verifyThatClickOnShopAllGiftslinkInTheList() {
        WebElement ShopAllGiftslink = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-gifts-sub']/li[1]/ul/li[2]/a"));
        assertTrue(ShopAllGiftslink.isDisplayed());
        ShopAllGiftslink.click();

    }


    //h1[@class='wm-header']
    @Test(priority = 4)
    public void verifyThatShopAllGiftsPageIsDisplayed(){
        WebElement ShopAllGiftsText = BaseTest.chromeDriver.findElement(By.xpath("//*[@id='ml-body-container']/main/div[3]/div/div/div/div[3]/h1"));
        assertTrue(ShopAllGiftsText.isDisplayed());
    }
    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}